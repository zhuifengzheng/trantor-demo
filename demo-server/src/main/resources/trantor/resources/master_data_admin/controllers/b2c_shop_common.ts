import {Controller, utils, showMessage} from 'nusi-sdk';

export default class extends Controller {
    delayTriggerServer = async (modelKey: string, code: string) => {
        utils.openUrl('https://www.baidu.com?appKey=' + code, true);

    }

    delayTriggerServer2 = async () => {
        utils.openUrl('https://www.baidu.com', true);
    }

    checkToken = ({context}) => {
        // 触发 ServerAction
        utils.triggerServerAction('master_data_admin_B2cMDShopVO_B2cMDShopAction::checkToken', {
            record: context,
            // modelKey: 'master_data_admin_B2cMDShopVO',
            actionLabel: '检验授权' // 用于log记录的名称，在xml中则是按钮文字
        }).then(res => {
            console.log("检验授权=>" + res.data);
            if (res.data) {
                showMessage({level: 'Strong', message: '授权验证通过', type: 'Success'});

                // this.triggerViewAction('master_data_admin_B2cMDShopVO_toMDGrantTokenCheck', {
                //     context,
                //     modelKey: 'master_data_admin_B2cMDShopVO',
                //     env:{grantProgress: 2,id:123},
                //     // env:{grantProgress: 1,id: this.getContainerByKey('parent').data.id},
                //     // env:{type:'delete',id: this.getContainerByKey('parent').data.id,enterpriseId: this.getContainerByKey('parent').data.enterprise.id},
                //     openViewType: 'Dialog' // 默认为 Self
                // });

            } else {
                showMessage({level: 'Strong', message: '授权验证失败，请重试', type: 'Warning'});
            }

        });
    }

    grantAuthorizationAction = ({context}) => {
        // 触发 ServerAction
        utils.triggerServerAction('master_data_admin_B2cMDShopVO_B2cMDShopAction::grant', {
            record: context,
            // modelKey: 'master_data_admin_B2cMDShopVO',
            actionLabel: '授权' // 用于log记录的名称，在xml中则是按钮文字
        }).then(res => {
            if (!res.data.result) {
                console.log("url=>" + res.data);
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
            console.log("res=============>" + res.data);

            if (res.data) {
                this.triggerViewAction('master_data_admin_B2cMDShopVO_toMDGrantTokenCheck', {
                    context,
                    modelKey: 'master_data_admin_B2cMDShopVO',
                    // 获取从上一个容器From表单key='parent'的id值=>this.getContainerByKey('parent').data.id
                    env:{grantProgress: 2,id: this.getContainerByKey('parent').data.id},
                    // env:{grantProgress: 1,id: this.getContainerByKey('parent').data.id},
                    // env:{type:'delete',id: this.getContainerByKey('parent').data.id,enterpriseId: this.getContainerByKey('parent').data.enterprise.id},
                    openViewType: 'Dialog' // 默认为 Self
                });
                // showMessage({level: 'Strong', message: '授权码验证通过', type: 'Success'});
            } else {
                console.log("data======false=======>" + res.data)

                // Strong 弹框
                showMessage({level: 'Strong', message: '授权验证失败，请重试', type: 'Warning'});
            }

        }).catch((error) => {
            showMessage({level: 'Strong', message: error.toast, type: 'Error'});
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