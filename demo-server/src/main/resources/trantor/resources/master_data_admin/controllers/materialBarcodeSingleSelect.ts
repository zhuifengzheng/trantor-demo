import {Controller, utils} from "nusi-sdk";

export default class extends Controller {
    // 当条码字段值发生变化时触发以下方法
    changeBarcodeDefault = (containerKey: string, changedValue: any, fieldName: string, order: number) => {
        utils.openUrl('https://baidu.com', true);
        const container = this.getContainerByKey(containerKey);
        const data = container.data
        // console.log(data, changedValue, fieldName, order)
        const newData = data.map((d, index) => {
            if (index === order) {
                return {
                    ...d,
                    [fieldName]: changedValue,
                }
            } else {
                if (changedValue === true && fieldName === 'isMain') {
                    return {
                        ...d,
                        isMain: false,
                    }
                }
                return d
            }
        })

        container.updateData(newData)
    };

    // 当条码字段值发生变化时触发以下方法
    changeAvailableUnitDefault = (containerKey: string, changedValue: any, fieldName: string, order: number) => {
        const container = this.getContainerByKey(containerKey)
        const data = container.data
        // console.log(data, changedValue, fieldName, order)
        const newData = data.map((d, index) => {
            if (index === order) {
                return {
                    ...d,
                    [fieldName]: changedValue,
                }
            } else {
                if (changedValue === true && fieldName === 'isBase') {
                    return {
                        ...d,
                        isBase: false,
                    }
                }
                return d
            }
        })

        container.updateData(newData)
    };
}