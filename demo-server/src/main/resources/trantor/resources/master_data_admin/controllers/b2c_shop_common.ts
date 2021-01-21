import {Controller, utils,showMessage} from 'nusi-sdk';

export default class extends Controller {
    delayTriggerServer = async (modelKey: string,code: string) => {
        utils.openUrl('https://www.baidu.com?appKey='+code, true);

    }

    delayTriggerServer2 = async () => {
        utils.openUrl('https://www.baidu.com', true);
    }

    grantAuthorizationAction = ({context}) => {
        // 触发 ServerAction
        utils.triggerServerAction('master_data_admin_B2cMDShopVO_B2cMDShopSingleDataAction::grant', {
            // record: context,
            // modelKey: 'master_data_admin_B2cMDShopVO',
            actionLabel: '授权' // 用于log记录的名称，在xml中则是按钮文字
        }).then(res => {
            if (!res.data.result) {
                console.log("url=>"+res.data)
                utils.openUrl(res.data, true);
                // this.triggerViewAction('master_data_admin_MDDepartmentVO_toMDDepartmentMove', {
                //     context,
                //     modelKey: 'master_data_admin_MDDepartmentVO',
                //     env:{type:'delete',id: this.getContainerByKey('parent').data.id,enterpriseId: this.getContainerByKey('parent').data.enterprise.id},
                //     openViewType: 'Dialog' // 默认为 Self
                // })
            } else {
                showMessage({level:'Strong',message:'获取授权码失败，请联系管理员',type:'Warning'});
            }

        });


    }
}