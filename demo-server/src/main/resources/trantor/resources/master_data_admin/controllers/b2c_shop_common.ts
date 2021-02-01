import {Controller, utils, showMessage} from 'nusi-sdk';

export default class extends Controller {
    delayTriggerServer = async (modelKey: string, code: string) => {
        utils.openUrl('https://www.baidu.com?appKey=' + code, true);

    }

    delayTriggerServer2 = async () => {
        utils.openUrl('https://www.baidu.com', true);
    }

    grantAuthorizationAction = ({context}) => {
        // 触发 ServerAction
        utils.triggerServerAction('master_data_admin_B2cMDShopVO_B2cMDShopAction::grant', {
            record: context,
            // modelKey: 'master_data_admin_B2cMDShopVO',
            actionLabel: '授权' // 用于log记录的名称，在xml中则是按钮文字
        }).then(res => {
            if (!res.data.result) {
                console.log("url=>" + res.data)
                utils.openUrl(res.data, true);
                // this.triggerViewAction('master_data_admin_MDDepartmentVO_toMDDepartmentMove', {
                //     context,
                //     modelKey: 'master_data_admin_MDDepartmentVO',
                //     env:{type:'delete',id: this.getContainerByKey('parent').data.id,enterpriseId: this.getContainerByKey('parent').data.enterprise.id},
                //     openViewType: 'Dialog' // 默认为 Self
                // })
            } else {
                showMessage({level: 'Strong', message: '获取授权码失败，请联系管理员', type: 'Warning'});
            }

        });


    }

    grantSave = ({context}) => {
        // 触发 ServerAction
        utils.triggerServerAction('master_data_admin_B2cMDShopVO_B2cMDShopAction::grantAuthorizationSave', {
            record: context,
            // modelKey: 'master_data_admin_B2cMDShopVO',
            actionLabel: '授权' // 用于log记录的名称，在xml中则是按钮文字
        }).then(res => {
            if (res.data) {
                // this.triggerViewAction('master_data_admin_MDDepartmentVO_toMDGrantTokenCheck', {
                //     context,
                //     modelKey: 'master_data_admin_MDDepartmentVO',
                //     // env:{type:'delete',id: this.getContainerByKey('parent').data.id,enterpriseId: this.getContainerByKey('parent').data.enterprise.id},
                //     openViewType: 'Dialog' // 默认为 Self
                // })
                showMessage({level: 'Strong', message: '授权码验证通过', type: 'Success'});
            } else {
                console.log("data======false=======>" + res.data)

                // Strong 弹框
                showMessage({level: 'Strong', message: '授权验证失败，请重试', type: 'Warning'});
            }

        });


    }

    // delayTriggerServer = async (actionName: string, modelKey: string, record, timeout: number) => {
    //     await utils.triggerServerAction(actionName, {
    //         modelKey,
    //         record,
    //     }).then(() => {
    //         return new Promise((resolve) => {
    //             setTimeout(resolve, timeout)
    //         });
    //     })
    // }
}