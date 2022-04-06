import {pageInfo, initPage, initUpdate, saveData, editData, deleteData} from './../api';
import { Message } from 'element-ui';
const course = {
  namespaced: true,
  state: {
    total:0,
    pageResp:null,
    addResp: null,
    editResp: null,
    deleteResp: null,
    initPageObj: null,
    initUpdateObj: null,
  },
  mutations: {

    PAGE_INFO(state,data){
      state.total = data.total;
      state.pageResp = data.obj || [];
    },
    INIT_PAGE(state,data) {
      state.initPageObj = data.obj || {};
    },
    INIT_UPDATE(state,data) {
      state.initUpdateObj = data.obj || {};
    },
    SAVE_DATA(state,data){
      state.addResp = data;
    },
    EDIT_DATA(state,data){
      state.editResp = data;
    },
    DELETE_DATA(state,data){
      state.deleteResp = data;
    }
  },
  actions: {
    //查询事件
    async pageInfo({commit}, obj){
      let resp = await pageInfo(obj);
      commit('PAGE_INFO', resp);
    },
    //初始化页面事件
    async initPage({commit}, obj){
      let resp = await initPage(obj);
      commit('INIT_PAGE', resp);
    },
    //初始化更新对象事件
    async initUpdate({commit}, obj){
      let resp = await initUpdate(obj);
      commit('INIT_UPDATE', resp);
    },
    //新增保存事件
    async saveData({commit}, obj){
      let resp = await saveData(obj);
      commit('SAVE_DATA', resp);
    },
    //修改保存事件
    async editData({commit}, obj){
      let resp = await editData(obj);
      commit('EDIT_DATA', resp);
    },
    //删除数据事件
    async deleteData({commit}, obj){
      let resp = await deleteData(obj);
      commit('DELETE_DATA', resp);
    },
  }
}
export default course