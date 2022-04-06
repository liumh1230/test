package com.zhqc.cloud.oms.qimen.web.controller;

import com.zhqc.cloud.oms.qimen.web.model.req.CourseUpdateReq;
import com.zhqc.cloud.oms.qimen.web.model.req.CourseReq;
import com.zhqc.cloud.oms.qimen.web.model.query.CourseQuery;
import com.zhqc.cloud.oms.qimen.web.model.vo.CourseVO;
import com.zhqc.cloud.oms.qimen.web.service.CourseService;
import com.zhqc.cloud.oms.qimen.web.convert.CourseConvert;
import com.zhqc.framerwork.common.model.vo.PageResponseVO;
import com.zhqc.framerwork.common.model.vo.BusinessResponseVO;
import com.zhqc.framerwork.common.model.vo.ResponseVO;
import com.zhqc.framerwork.common.controller.DefaultCrudController;
import io.swagger.annotations.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.math.*;

/**
* @类说明: 表注释缺失,请按规范填写Controller
* @author: liaohuanghe
* @createTime: 2022/04/06
* @updateAuthor: [修改作者]
* @UpdateRemark: [说明本次修改内容]
* @version 1.2.9
*/
@RestController
@RequestMapping("/web/course")
@Api(value="表注释缺失,请按规范填写")
public class CourseController extends DefaultCrudController<CourseVO,CourseService,CourseConvert> {
    @ApiOperation(value="页面初始化操作")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_SEARCH')")
    @PostMapping(value = "/initPage" )
    public BusinessResponseVO initPage() {
        return super.initPage();
    }

    @ApiOperation(value="查询表注释缺失,请按规范填写")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_SEARCH')")
    @PostMapping(value = "/pageInfo")
    public PageResponseVO<CourseVO> pageInfo(@RequestBody @Validated CourseQuery query) {
        return super.pageInfo(query);
    }

    @ApiOperation(value="新增时初始化操作")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_ADD')")
    @PostMapping(value = "/initAdd/{id}")
    public BusinessResponseVO initAdd(@ApiParam(value="主键",required = true)@PathVariable("id") Integer id) {
        return super.initAdd(id);
    }

    @ApiOperation(value="修改时初始化操作")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_EDIT')")
    @PostMapping(value = "/initUpdate/{id}")
    public BusinessResponseVO initUpdate(@ApiParam(value="主键",required = true)@PathVariable("id") Integer id) {
        return super.initUpdate(id);
    }

    @ApiOperation(value="新增表注释缺失,请按规范填写")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_ADD')")
    @PostMapping(value = "/add")
    public ResponseVO add(@RequestBody @Validated CourseReq req) {
        super.add(req);
        return ResponseVO.SYS_SUCCESS;
    }
    @ApiOperation(value="修改表注释缺失,请按规范填写")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_EDIT')")
    @PostMapping(value = "/update")
    public ResponseVO update(@RequestBody @Validated CourseUpdateReq req) {
        super.update(req);
        return ResponseVO.SYS_SUCCESS;
    }

    @ApiOperation(value="删除表注释缺失,请按规范填写")
    @PreAuthorize("hasRole('ZHQC_BYWL_CLOUD_OMS_API_IMPL_WEB_COURSE_DELETE')")
    @PostMapping(value = "/delete/{id}")
    public ResponseVO delete(@ApiParam(value="主键",required = true)@PathVariable("id") Integer id) {
        super.delete(id);
        return ResponseVO.SYS_SUCCESS;
    }


}

