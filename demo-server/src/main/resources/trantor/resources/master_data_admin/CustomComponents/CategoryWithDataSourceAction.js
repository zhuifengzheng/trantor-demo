define(["@terminus/nusi","@terminus/nusi-engine","react"], function(__WEBPACK_EXTERNAL_MODULE__terminus_nusi__, __WEBPACK_EXTERNAL_MODULE__terminus_nusi_engine__, __WEBPACK_EXTERNAL_MODULE_react__) { return /******/ (function(modules) { // webpackBootstrap
    /******/ 	// The module cache
    /******/ 	var installedModules = {};
    /******/
    /******/ 	// The require function
    /******/ 	function __webpack_require__(moduleId) {
        /******/
        /******/ 		// Check if module is in cache
        /******/ 		if(installedModules[moduleId]) {
            /******/ 			return installedModules[moduleId].exports;
            /******/ 		}
        /******/ 		// Create a new module (and put it into the cache)
        /******/ 		var module = installedModules[moduleId] = {
            /******/ 			i: moduleId,
            /******/ 			l: false,
            /******/ 			exports: {}
            /******/ 		};
        /******/
        /******/ 		// Execute the module function
        /******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
        /******/
        /******/ 		// Flag the module as loaded
        /******/ 		module.l = true;
        /******/
        /******/ 		// Return the exports of the module
        /******/ 		return module.exports;
        /******/ 	}
    /******/
    /******/
    /******/ 	// expose the modules object (__webpack_modules__)
    /******/ 	__webpack_require__.m = modules;
    /******/
    /******/ 	// expose the module cache
    /******/ 	__webpack_require__.c = installedModules;
    /******/
    /******/ 	// define getter function for harmony exports
    /******/ 	__webpack_require__.d = function(exports, name, getter) {
        /******/ 		if(!__webpack_require__.o(exports, name)) {
            /******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
            /******/ 		}
        /******/ 	};
    /******/
    /******/ 	// define __esModule on exports
    /******/ 	__webpack_require__.r = function(exports) {
        /******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
            /******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
            /******/ 		}
        /******/ 		Object.defineProperty(exports, '__esModule', { value: true });
        /******/ 	};
    /******/
    /******/ 	// create a fake namespace object
    /******/ 	// mode & 1: value is a module id, require it
    /******/ 	// mode & 2: merge all properties of value into the ns
    /******/ 	// mode & 4: return value when already ns object
    /******/ 	// mode & 8|1: behave like require
    /******/ 	__webpack_require__.t = function(value, mode) {
        /******/ 		if(mode & 1) value = __webpack_require__(value);
        /******/ 		if(mode & 8) return value;
        /******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
        /******/ 		var ns = Object.create(null);
        /******/ 		__webpack_require__.r(ns);
        /******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
        /******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
        /******/ 		return ns;
        /******/ 	};
    /******/
    /******/ 	// getDefaultExport function for compatibility with non-harmony modules
    /******/ 	__webpack_require__.n = function(module) {
        /******/ 		var getter = module && module.__esModule ?
            /******/ 			function getDefault() { return module['default']; } :
            /******/ 			function getModuleExports() { return module; };
        /******/ 		__webpack_require__.d(getter, 'a', getter);
        /******/ 		return getter;
        /******/ 	};
    /******/
    /******/ 	// Object.prototype.hasOwnProperty.call
    /******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
    /******/
    /******/ 	// __webpack_public_path__
    /******/ 	__webpack_require__.p = "";
    /******/
    /******/
    /******/ 	// Load entry module and return exports
    /******/ 	return __webpack_require__(__webpack_require__.s = "./components/CategoryWithDataSourceAction/index.tsx");
    /******/ })
    /************************************************************************/
    /******/ ({

        /***/ "./components/CategoryWithDataSourceAction/index.tsx":
        /*!***********************************************************!*\
          !*** ./components/CategoryWithDataSourceAction/index.tsx ***!
          \***********************************************************/
        /*! exports provided: default */
        /***/ (function(module, __webpack_exports__, __webpack_require__) {

            "use strict";
            eval("__webpack_require__.r(__webpack_exports__);\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! react */ \"react\");\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_0__);\n/* harmony import */ var _terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @terminus/nusi-engine */ \"@terminus/nusi-engine\");\n/* harmony import */ var _terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1___default = /*#__PURE__*/__webpack_require__.n(_terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1__);\n/* harmony import */ var _terminus_nusi__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @terminus/nusi */ \"@terminus/nusi\");\n/* harmony import */ var _terminus_nusi__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(_terminus_nusi__WEBPACK_IMPORTED_MODULE_2__);\nvar __extends = (undefined && undefined.__extends) || (function () {\n    var extendStatics = function (d, b) {\n        extendStatics = Object.setPrototypeOf ||\n            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||\n            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };\n        return extendStatics(d, b);\n    };\n    return function (d, b) {\n        extendStatics(d, b);\n        function __() { this.constructor = d; }\n        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());\n    };\n})();\nvar __assign = (undefined && undefined.__assign) || function () {\n    __assign = Object.assign || function(t) {\n        for (var s, i = 1, n = arguments.length; i < n; i++) {\n            s = arguments[i];\n            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))\n                t[p] = s[p];\n        }\n        return t;\n    };\n    return __assign.apply(this, arguments);\n};\nvar __awaiter = (undefined && undefined.__awaiter) || function (thisArg, _arguments, P, generator) {\n    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }\n    return new (P || (P = Promise))(function (resolve, reject) {\n        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }\n        function rejected(value) { try { step(generator[\"throw\"](value)); } catch (e) { reject(e); } }\n        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }\n        step((generator = generator.apply(thisArg, _arguments || [])).next());\n    });\n};\nvar __generator = (undefined && undefined.__generator) || function (thisArg, body) {\n    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;\n    return g = { next: verb(0), \"throw\": verb(1), \"return\": verb(2) }, typeof Symbol === \"function\" && (g[Symbol.iterator] = function() { return this; }), g;\n    function verb(n) { return function (v) { return step([n, v]); }; }\n    function step(op) {\n        if (f) throw new TypeError(\"Generator is already executing.\");\n        while (_) try {\n            if (f = 1, y && (t = op[0] & 2 ? y[\"return\"] : op[0] ? y[\"throw\"] || ((t = y[\"return\"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;\n            if (y = 0, t) op = [op[0] & 2, t.value];\n            switch (op[0]) {\n                case 0: case 1: t = op; break;\n                case 4: _.label++; return { value: op[1], done: false };\n                case 5: _.label++; y = op[1]; op = [0]; continue;\n                case 7: op = _.ops.pop(); _.trys.pop(); continue;\n                default:\n                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }\n                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }\n                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }\n                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }\n                    if (t[2]) _.ops.pop();\n                    _.trys.pop(); continue;\n            }\n            op = body.call(thisArg, _);\n        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }\n        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };\n    }\n};\nvar __spreadArrays = (undefined && undefined.__spreadArrays) || function () {\n    for (var s = 0, i = 0, il = arguments.length; i < il; i++) s += arguments[i].length;\n    for (var r = Array(s), k = 0, i = 0; i < il; i++)\n        for (var a = arguments[i], j = 0, jl = a.length; j < jl; j++, k++)\n            r[k] = a[j];\n    return r;\n};\n\n\n\nvar default_1 = /** @class */ (function (_super) {\n    __extends(default_1, _super);\n    function default_1(props) {\n        var _this = _super.call(this, props) || this;\n        _this.state = {\n            options: props.options,\n        };\n        return _this;\n    }\n    default_1.prototype.init = function () {\n        this.loadData();\n    };\n    default_1.prototype.refresh = function () {\n        var parentId = this.state.parentId;\n        this.setState({ parentId: undefined });\n        return this.refreshParentNode(parentId);\n    };\n    default_1.prototype.loadData = function (selectedOptions) {\n        if (selectedOptions === void 0) { selectedOptions = []; }\n        return __awaiter(this, void 0, void 0, function () {\n            var _a, model, dataSourceAction, valueField, hasChildrenField, parentField, options, targetOption, data;\n            var _b;\n            return __generator(this, function (_c) {\n                switch (_c.label) {\n                    case 0:\n                        _a = this.props, model = _a.model, dataSourceAction = _a.dataSourceAction, valueField = _a.valueField, hasChildrenField = _a.hasChildrenField, parentField = _a.parentField;\n                        options = this.state.options;\n                        targetOption = selectedOptions[selectedOptions.length - 1] || {};\n                        targetOption.loading = true;\n                        if (!dataSourceAction) return [3 /*break*/, 2];\n                        return [4 /*yield*/, Object(_terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1__[\"fetchDSData\"])({\n                                dataSourceAction: dataSourceAction,\n                                targetModel: model,\n                                // @ts-ignore\n                                context: {\n                                    record: (_b = {},\n                                        _b[parentField] = targetOption[valueField] || 0,\n                                        _b)\n                                },\n                            })];\n                    case 1:\n                        data = (_c.sent()).data;\n                        data = data.map(function (v) { return (__assign(__assign({}, v), { isLeaf: !v[hasChildrenField] })); });\n                        targetOption.loading = false;\n                        targetOption.children = data;\n                        this.setState({\n                            options: selectedOptions.length ? __spreadArrays(options) : data,\n                        });\n                        _c.label = 2;\n                    case 2: return [2 /*return*/];\n                }\n            });\n        });\n    };\n    default_1.prototype.refreshParentNode = function (parentId) {\n        var targetNode;\n        if (parentId) {\n            targetNode = [this.findNodeById(parentId)];\n        }\n        return this.loadData(targetNode);\n    };\n    default_1.prototype.findNodeById = function (id, options) {\n        if (options === void 0) { options = this.state.options; }\n        var result;\n        for (var i = 0; i < options.length; i++) {\n            var option = options[i];\n            if (option.id === id) {\n                result = option;\n                return result;\n            }\n            if (!result && option.children && option.children.length) {\n                result = this.findNodeById(id, option.children);\n            }\n        }\n        return result;\n    };\n    default_1.prototype.getRecordAction = function () {\n        var _a = this.props, model = _a.model, triggerViewAction = _a.triggerViewAction, after = _a.after;\n        var config = this.config.select(_terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1__[\"EngineTag\"].RecordActions);\n        if (config) {\n            var actions = config.actions();\n            return actions.filter(function (action) { return action.show !== false; })\n                .map(function (action, i) {\n                return {\n                    node: action.label,\n                    func: function (value) {\n                        return __awaiter(this, void 0, void 0, function () {\n                            return __generator(this, function (_a) {\n                                switch (_a.label) {\n                                    case 0:\n                                        if (!action.openViewType) return [3 /*break*/, 2];\n                                        return [4 /*yield*/, triggerViewAction(action.action, {\n                                                openViewType: action.openViewType,\n                                                context: {\n                                                    record: {\n                                                        id: value,\n                                                    },\n                                                }\n                                            })];\n                                    case 1:\n                                        _a.sent();\n                                        return [3 /*break*/, 4];\n                                    case 2: return [4 /*yield*/, Object(_terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1__[\"triggerServerAction\"])(action.action, {\n                                            modelKey: model,\n                                            // @ts-ignore\n                                            context: {\n                                                record: {\n                                                    id: value,\n                                                },\n                                            }\n                                        })];\n                                    case 3:\n                                        _a.sent();\n                                        _a.label = 4;\n                                    case 4:\n                                        this.setState({ parentId: action.pid });\n                                        return [2 /*return*/];\n                                }\n                            });\n                        });\n                    }\n                };\n            });\n        }\n    };\n    default_1.prototype.render = function () {\n        var _this = this;\n        var _a = this.props, labelField = _a.labelField, valueField = _a.valueField, value = _a.value, _b = _a.depthLimit, depthLimit = _b === void 0 ? '4' : _b, onAdd = _a.onAdd, onSelect = _a.onSelect, _c = _a.triggerViewAction, triggerViewAction = _c === void 0 ? function () { } : _c;\n        var options = this.state.options;\n        console.log(111, this);\n        return (react__WEBPACK_IMPORTED_MODULE_0___default.a.createElement(_terminus_nusi__WEBPACK_IMPORTED_MODULE_2__[\"Category\"], { expandIcon: \">\", depthLimit: parseInt(depthLimit), defaultValue: value, options: options, loadData: this.loadData.bind(this), onAdd: function (parentId) {\n                triggerViewAction(onAdd, {\n                    openViewType: 'Dialog',\n                    context: {\n                        record: {\n                            id: parentId,\n                        },\n                    }\n                });\n                _this.setState({ parentId: parentId });\n            }, actions: this.getRecordAction.bind(this), onSelect: function (selectedIds) {\n                triggerViewAction(onSelect, {\n                    openViewType: 'Columns',\n                    context: {\n                        record: {\n                            id: selectedIds[selectedIds.length - 1],\n                        },\n                    }\n                });\n            }, fieldNames: { label: labelField, value: valueField } }));\n    };\n    return default_1;\n}(_terminus_nusi_engine__WEBPACK_IMPORTED_MODULE_1__[\"TreeContainer\"]));\n/* harmony default export */ __webpack_exports__[\"default\"] = (default_1);\n\n\n//# sourceURL=webpack:///./components/CategoryWithDataSourceAction/index.tsx?");

            /***/ }),

        /***/ "@terminus/nusi":
        /*!*********************************!*\
          !*** external "@terminus/nusi" ***!
          \*********************************/
        /*! no static exports found */
        /***/ (function(module, exports) {

            eval("module.exports = __WEBPACK_EXTERNAL_MODULE__terminus_nusi__;\n\n//# sourceURL=webpack:///external_%22@terminus/nusi%22?");

            /***/ }),

        /***/ "@terminus/nusi-engine":
        /*!****************************************!*\
          !*** external "@terminus/nusi-engine" ***!
          \****************************************/
        /*! no static exports found */
        /***/ (function(module, exports) {

            eval("module.exports = __WEBPACK_EXTERNAL_MODULE__terminus_nusi_engine__;\n\n//# sourceURL=webpack:///external_%22@terminus/nusi-engine%22?");

            /***/ }),

        /***/ "react":
        /*!************************!*\
          !*** external "react" ***!
          \************************/
        /*! no static exports found */
        /***/ (function(module, exports) {

            eval("module.exports = __WEBPACK_EXTERNAL_MODULE_react__;\n\n//# sourceURL=webpack:///external_%22react%22?");

            /***/ })

        /******/ })});;