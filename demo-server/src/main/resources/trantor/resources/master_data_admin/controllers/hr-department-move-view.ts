import {Controller, utils,showMessage} from 'nusi-sdk'

export default class extends Controller {
    deleteDepartemntAction = ({context}) => {

        // 触发 ServerAction
        utils.triggerServerAction('master_data_admin_MDDepartmentVO_MDDepartmentAction::hasChildren', {
            record: context,
            modelKey: 'master_data_admin_MDDepartmentVO',
            actionLabel: '提交' // 用于log记录的名称，在xml中则是按钮文字
        }).then(res => {
            if (!res.data.result) {
                this.triggerViewAction('master_data_admin_MDDepartmentVO_toMDDepartmentMove', {
                    context,
                    modelKey: 'master_data_admin_MDDepartmentVO',
                    env:{type:'delete',id: this.getContainerByKey('parent').data.id,enterpriseId: this.getContainerByKey('parent').data.enterprise.id},
                    openViewType: 'Dialog' // 默认为 Self
                })
            } else {
                showMessage({level:'Strong',message:'存在下级部门，请调整后重新删除',type:'Warning'});
            }

        });


    }
}