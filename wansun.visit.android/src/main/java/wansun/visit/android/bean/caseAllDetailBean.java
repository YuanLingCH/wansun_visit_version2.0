package wansun.visit.android.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by User on 2019/7/23.
 */

public class caseAllDetailBean implements Serializable {

    /**
     * statusID : 200
     * message : ok
     * dataType : application/json
     * data : {"contactItems":[{"cidTypeText":"其他","relationText":"其他","gender":999,"name":"朱姣姣","cidType":999,"emailItems":null,"companyItems":[{"companyAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"},"companyName":"西安市唐朝商贸有限公司","resumeStatus":10,"position":"","resumeEndBeginDate":1561953481246,"resumeStatusText":"在职","resumeStatusRemark":"在职","resumeBeginDate":1561953481246,"companyPhone":{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"ecb0ea0b-824e-4350-ae6f-944bdebc1ea1","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":null},"companyGuId":"bd645a14-cdaf-4d7c-811b-3a9a8e309689"}],"relation":999,"phoneItems":[{"phoneNumberExt":"02968775126","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":999,"province":"","addressStatus":1,"addressGuId":"dd22d7e8-edd4-4db6-82e4-44b5c4a8f2cf","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"18681947299","phoneStatusTypeItem":{"phoneOwnerType":10,"phoneType":999,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"其他","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"},"phoneGuId":"329533c4-3cab-409d-b598-defdee4a57a3","isDel":false,"callCount":0,"remark":"","creator":"cs024","creatDate":1561953481246,"lastFollowDate":0,"sameDayCounts":0}],"genderText":"其他","addressItems":[],"personStatusItem":{"endBeginDate":1561953481246,"personStatus":10,"personStatusRemark":"正常","personStatusText":"正常","personStatusTime":1561953481246,"beginDate":1561953481246},"cidOfDebtor":"432522197109076981","age":0,"cidNo":"432522197109076981","contactGuId":"28e0eb7d-e7d7-412a-a0db-76ea68b5723c","cidNoExt":null,"unconnectDays":0,"lastValidFollowDate":0,"lastFollowDate":0},{"cidTypeText":null,"relationText":"夫妻","gender":0,"name":"fdsgfds","cidType":0,"emailItems":null,"companyItems":[],"relation":10,"phoneItems":[],"genderText":null,"addressItems":[{"addressStatusRemark":null,"address2":"案件地址2","addressTypeText":"住宅地址","country":null,"addressStatusText":"有效","city":null,"address1":"案件地址1","postCode":"442580","addressType":1,"province":null,"addressStatus":1,"addressGuId":"0b2fa1e7-8906-4526-a8e1-437f740639f9","creator":"szadmin","createDate":1563871808100,"isDel":false,"remark":"备注信息test","isVisited":true,"isLetter":false,"address1Ext":null,"address2Ext":null}],"personStatusItem":null,"cidOfDebtor":null,"age":0,"cidNo":null,"contactGuId":"50c68edc-03eb-4ff1-993f-a8febb78d7c4","cidNoExt":null,"unconnectDays":null,"lastValidFollowDate":0,"lastFollowDate":0},{"cidTypeText":null,"relationText":"夫妻","gender":0,"name":"朱娇娇","cidType":0,"emailItems":null,"companyItems":[],"relation":10,"phoneItems":[],"genderText":null,"addressItems":[{"addressStatusRemark":null,"address2":"未知地址2","addressTypeText":"未知地址","country":null,"addressStatusText":"有效","city":null,"address1":"未知地址1","postCode":"4455","addressType":10,"province":null,"addressStatus":1,"addressGuId":"35862a46-ccf7-4abd-a118-4e7bd2cb8e14","creator":"szadmin","createDate":1563957925112,"isDel":false,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"其他地址2","addressTypeText":"其他","country":null,"addressStatusText":"有效","city":null,"address1":"其他地址1","postCode":"4455","addressType":999,"province":null,"addressStatus":1,"addressGuId":"f4ed3f33-d6f8-4b58-988a-64b4f1aaccb1","creator":"szadmin","createDate":1563957948803,"isDel":false,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"户籍地址2","addressTypeText":"户籍地址","country":null,"addressStatusText":"有效","city":null,"address1":"户籍地址1","postCode":"4455","addressType":0,"province":null,"addressStatus":1,"addressGuId":"95d10a2b-610c-4a20-94e8-234c0d4bb391","creator":"szadmin","createDate":1563960134757,"isDel":true,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"personStatusItem":null,"cidOfDebtor":null,"age":0,"cidNo":null,"contactGuId":"81485b20-2f0c-413c-b440-66e5a0d85a76","cidNoExt":null,"unconnectDays":null,"lastValidFollowDate":0,"lastFollowDate":0}],"debtorItems":[{"debtorNo":"","iM":"","cidTypeText":"其他","gender":999,"name":"朱姣姣","cidType":999,"emailItems":null,"companyItems":[{"companyAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"},"companyName":"西安市唐朝商贸有限公司","resumeStatus":10,"position":"","resumeEndBeginDate":1561953481246,"resumeStatusText":"在职","resumeStatusRemark":"在职","resumeBeginDate":1561953481246,"companyPhone":{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"c194ce48-601e-4cf7-9f7e-82d7fd448ce5","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":{"phoneOwnerType":20,"phoneType":30,"phoneNumberTypeText":"固话","phoneOwnerTypeText":"非本人","phoneTypeText":"单位","connectSummaryStatusText":"无","phoneNumberType":10,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}},"companyGuId":"93fcabe5-2a31-469c-a6b4-2721efbac2d4"}],"socialNo":"","phoneItems":[{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"全省","address1":"","postCode":"","addressType":999,"province":"全国","addressStatus":1,"addressGuId":"af0e6d02-d3dc-4704-8a89-d881ec6533e0","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"18681947299","phoneStatusTypeItem":{"phoneOwnerType":10,"phoneType":10,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"手机","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"},"phoneGuId":"0b196d0a-4dd7-4236-ad08-aa724c1708f8","isDel":false,"callCount":0,"remark":"","creator":"cs024","creatDate":1561953481246,"lastFollowDate":0,"sameDayCounts":0}],"genderText":"其他","addressItems":[{"addressStatusRemark":null,"address2":"户籍地址测试2","addressTypeText":"户籍地址","country":null,"addressStatusText":"有效","city":null,"address1":"户籍地址测试2","postCode":"7878","addressType":0,"province":null,"addressStatus":1,"addressGuId":"3d619528-c29c-427a-965f-fa4c5de7db9c","creator":"szadmin","createDate":1563956613057,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"公司地址2","addressTypeText":"公司地址","country":null,"addressStatusText":"有效","city":null,"address1":"公司地址1","postCode":"7878","addressType":3,"province":null,"addressStatus":1,"addressGuId":"c8639cc3-773b-41c4-96ec-aad2c07456db","creator":"szadmin","createDate":1563957188846,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"personStatusItem":{"endBeginDate":1561953481246,"personStatus":10,"personStatusRemark":"正常","personStatusText":"正常","personStatusTime":1561953481246,"beginDate":1561953481246},"age":0,"cidNo":"432522197109076981","unconnectDays":0,"lastValidFollowDate":0,"lastFollowDate":0,"cidNoExt":null,"im":""}],"caseOperateItem":{"caseOfAgencyName":"深圳万乘","caseOfOperateID":36,"caseOfOperateName":"深圳系统管理员","caseOfDepartmentID":24,"caseOfDepartmentName":"总经理室","caseOfAgencyID":3,"caseAssistOfOperateName":"","caseAssistOfOperateID":0,"updateUserName":null,"updateUserId":0,"isOfAgDist":true,"caseOfDispatchItems":[{"caseDispatchId":3901,"caseDispatchName":"黄旦丽"}]},"caseCardRows":1,"caseId":0,"caseCode":"BNJ-20190701-002-000001","caseTotalReceiptAmount":0,"urgeItems":[{"urgeVisitItems":[{"visitGuid":"02f25893-6b03-4d75-9e36-fb8b5387a888","taskGuid":"c555aee1-a184-24d5-8ffd-cf14fff0ae2f","applyOrgId":3,"applyOrgName":"深圳万乘","visitOrgId":3,"visitOrgName":"深圳万乘","visitObjectName":"fdsgfds","relationText":"夫妻","relation":10,"addressGuid":"0b2fa1e7-8906-4526-a8e1-437f740639f9","addressType":0,"addressTypeText":"户籍地址","address":"fbhfdhgfd","postCode":null,"province":"内蒙古","city":"鄂尔多斯市","county":"杭锦旗","visitArea":"内蒙古 . 鄂尔多斯市 . 杭锦旗","visitTimes":0,"applicantId":36,"applicantName":"szadmin","applyTime":1563871818296,"visitors":"szadmin","visitorsName":"深圳系统管理员,","visitBeginTime":1563408000000,"visitEndTime":1566518400000,"visitCompleteTime":0,"effectBackDay":0,"clerkId":36,"clerkName":"szadmin","visitStatus":30,"visitStatusText":"已排程","visitStatusRemark":null,"visitStatusTime":1563871818296,"visitBackAmount":0,"visitReason":"1","visitGoal":"fgf","remark":null,"isArchived":false,"isDel":false,"isPrint":false,"visitRecordItems":[{"recordGuid":"6f111d18-3c2a-477f-bdd4-2e6be5e602e3","operateTypeText":"审核","operateContent":"操作前：已申请/待审核修改，操作后：已审核/待排程","operateId":36,"operatorName":"szadmin","operateTime":1563871885771,"isDel":false},{"recordGuid":"5bdc9771-5e3a-48ba-bc0c-09061d3a0593","operateTypeText":"排程","operateContent":"操作前：已审核/待排程，操作后：已排程/待打印","operateId":36,"operatorName":"szadmin","operateTime":1563871971050,"isDel":false}]},{"visitGuid":"b096b21d-b5fc-402d-8eb1-48dc683de07a","taskGuid":null,"applyOrgId":3,"applyOrgName":"深圳万乘","visitOrgId":3,"visitOrgName":"深圳万乘","visitObjectName":"朱姣姣","relationText":"本人","relation":60,"addressGuid":"c722e05f-f0dc-4f88-8aea-39429c19fae1","addressType":7,"addressTypeText":"开卡地址","address":"案件地址1test","postCode":"787899875555","province":"山西省","city":"晋城市","county":"陵川县","visitArea":"山西省 . 晋城市 . 陵川县","visitTimes":0,"applicantId":36,"applicantName":"szadmin","applyTime":1563956396259,"visitors":null,"visitorsName":null,"visitBeginTime":0,"visitEndTime":0,"visitCompleteTime":0,"effectBackDay":0,"clerkId":36,"clerkName":"szadmin","visitStatus":10,"visitStatusText":"已申请","visitStatusRemark":null,"visitStatusTime":1563956396259,"visitBackAmount":0,"visitReason":"2","visitGoal":"tedsdsasa","remark":"fdfgggg","isArchived":false,"isDel":false,"isPrint":false,"visitRecordItems":[]}],"urgeLetterItems":[],"urgeAssistItems":[],"urgeSmsItems":[],"urgeRepairItems":[],"urgePhoneItems":[{"phoneUrgeTag":"280fca13-5586-4990-9c9d-a7a49a43d909","name":"test","phone":"1212333","relation":60,"urgeTypeName":"电催","callRecords":"催记test","contactSummary":1,"contactSummaryText":"未接通","contactResult":11,"contactResultText":"通话中","remark":"备注test","isDel":false,"createDate":1563872455591,"creator":"szadmin","urgeType":0,"promisePaymentItems":[{"cardNo":"9900000000163882","collectAmount":0,"promiseStatus":30,"promiseStatusText":"已付款","promisePaymentDate":1564012800000,"promisePaymentAmount":2000,"confirmAmount":2000,"confirmDate":1563875432623,"confirmPerson":"36","checkAmount":2000,"checkDate":1563811200000,"checkPerson":"36","applicationCheckAccountDate":0,"applicationPerson":null,"promiseDate":1563872455591,"remark":null,"isDel":false,"promisePaymentGuid":"6bdcbbc2-63f2-47c4-8931-657daf2ec822","isExport":null,"operator":"szadmin","operatorName":"深圳系统管理员","confirmPersonName":"深圳系统管理员","checkPersonName":"深圳系统管理员","applicationPersonName":null}]},{"phoneUrgeTag":"19bdecd6-4054-4660-8756-3973caa58680","name":"test","phone":"12233333","relation":60,"urgeTypeName":"电催","callRecords":"ddddd","contactSummary":2,"contactSummaryText":"联系到本人","contactResult":7,"contactResultText":"无人接听","remark":"teed","isDel":false,"createDate":1563935825957,"creator":"szadmin","urgeType":0,"promisePaymentItems":[{"cardNo":"9900000000163882","collectAmount":0,"promiseStatus":10,"promiseStatusText":"承诺还款","promisePaymentDate":1563926400000,"promisePaymentAmount":2000,"confirmAmount":0,"confirmDate":0,"confirmPerson":null,"checkAmount":0,"checkDate":0,"checkPerson":null,"applicationCheckAccountDate":0,"applicationPerson":null,"promiseDate":1563935825957,"remark":null,"isDel":false,"promisePaymentGuid":"45783318-cdd9-4881-b603-adb9b4800eb1","isExport":null,"operator":"szadmin","operatorName":"深圳系统管理员","confirmPersonName":null,"checkPersonName":null,"applicationPersonName":null}]}]}],"caseTotalUrgeAmount":22560.88,"cardItems":[{"verificationDate":1561953481246,"createAccountDate":1561953481246,"branchesBank":"","creditLine":0,"stagingPeriods":0,"caseAmount":22560.88,"collectAmount":22560.88,"paymentAmount":0,"arrearsAmount":22560.88,"masterCard":"","cardStatusItem":{"cardUrgeStatus":10,"cardRepaymenStatusRemark":"未还","cardRepaymentStatus":10,"cardUrgeStatusText":"在催","cardUrgeStatusTime":1561953481246,"cardRepaymenStatusText":"未还","cardRepaymenStatusTime":1561953481246,"cardUrgeStatusRemark":"在催"},"defaultRatings":"0-30","overdueDays":"15","reconciliationAddress":[{"addressStatusRemark":null,"address2":"对账地址2","addressTypeText":"对账单地址","country":null,"addressStatusText":"有效","city":null,"address1":"对账地址1","postCode":"7878","addressType":5,"province":null,"addressStatus":1,"addressGuId":"8ccae8e3-417f-4493-8689-0f3faf52ccc6","creator":"szadmin","createDate":1563957312411,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"对账地址22","addressTypeText":"对账单地址","country":null,"addressStatusText":"有效","city":null,"address1":"对账地址11","postCode":"4455","addressType":5,"province":null,"addressStatus":1,"addressGuId":"10185388-8f86-43a3-aafe-d3e6efb2fe72","creator":"szadmin","createDate":1563957838587,"isDel":true,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"interest":0,"overdueInstallments":"个人经营贷","currency":"RMB","carItem":{"carModel":"","carEngineNo":null,"carNo":"","carFrameNo":"","isGPS":0},"collectFee":0,"mortgageAddressItems":[{"addressStatusRemark":null,"address2":"抵押物地址2","addressTypeText":"抵押物地址","country":null,"addressStatusText":"有效","city":null,"address1":"抵押物地址1","postCode":"7878","addressType":6,"province":null,"addressStatus":1,"addressGuId":"6a735ec7-b969-4672-b169-1b2b37f407eb","creator":"szadmin","createDate":1563957421380,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"repaymentAmountPerPeriod":0,"accountNo":"9900000000163882","rate":0,"reconciliationDate":1561953481246,"branches":"","lastPaymentDate":0,"hand":"0-30","latestArrearsAmount":22560.88,"currencyAmount":0,"minRepaymentAmount":0,"latestArrearsDate":0,"cardNo":"9900000000163882","cardGuid":"f882dac8-9da3-4946-bb2c-2c0fe378601b","repaymentsPeriods":"","forfeitPenalty":0,"otherFee":0,"lastPaymentAmount":0,"principal":0,"cardDescription":null,"cardAddress":{"addressStatusRemark":"有效","address2":"案件地址2test","addressTypeText":"开卡地址","country":"中国","addressStatusText":"有效","city":"全省","address1":"案件地址1test","postCode":"787899875555","addressType":7,"province":"全国","addressStatus":1,"addressAsString":"全国全省","addressGuId":"c722e05f-f0dc-4f88-8aea-39429c19fae1","creator":"cs024","createDate":1561953481246,"isDel":false,"remark":"备注测试数据","isVisited":true,"isLetter":false,"address1Ext":null,"address2Ext":null},"billDate":"0","repaymentLogItems":[],"customersLatestArrears":null,"cardNoExt":null}],"batchItem":{"pauseTime":"1561952839873","pauseOfOperateName":"","customerCode":"BNJ","batchId":20,"pauseRemark":"","appointCaseQuantity":0,"customerId":1022,"batchType":20,"repaymentRate":1,"batchOperateItem":{"importAgencyID":1,"returnOfOperateName":"","importOperateName":"黄旦丽","importDate":1561952839873,"returnOfOperateID":0,"destroyOfOperateName":"","returnOfDate":1561952839873,"destroyOfOperateID":0,"importAgencyName":"集团","destroyOfDate":1564502400000,"importOperateID":3901},"returnRate":1,"batchCode":"BNJ-20190701-002","batchStatusItem":{"batchVerifyBillStatusRemark":"未生成对帐","batchVerifyBillStatus":10,"batchVerifyBillStatusText":"未生成对帐","batchVerifyBillStatusTime":1561953481246,"batchReceiptStatus":10,"batchAssignationStatusText":"分派到法务","batchAssignationStatusTime":1563625225764,"batchBillingStatusRemark":"未开","batchUrgeStatusRemark":"正常","batchReceiptStatusText":"未收","batchReceiptStatusTime":1561953481246,"batchAssignationStatus":40,"batchUrgeStatus":10,"batchStatusTime":1561953481246,"batchStatus":10,"batchUrgeStatusText":"正常","batchUrgeStatusTime":1561953481246,"batchAssignationStatusRemark":"分派到法务","batchReceiptStatusRemark":"未收","batchBillingStatus":10,"batchBillingStatusText":"未开","batchBillingStatusTime":1561953481246},"isPause":false,"appointCaseAmount":0,"pauseOfOperateID":0,"appointItem":{"appointEndDate":1561952839873,"appointEndBeginDate":1564502400000,"appointBeginDate":1561910400000,"appointDestroyDate":1564502400000,"keepDate":0},"customerName":"微众银行","commissionRate":1,"caseQuantity":0},"caseStatusItem":{"caseAssignationStatus":20,"caseAssignationStatusText":"已分配","caseAssignationStatusTime":1561953481246,"caseAssignationStatusRemark":"已分配","caseUrgeStatus":10,"caseUrgeStatusRemark":"在催","caseUrgeStatusText":"在催","caseUrgeStatusTime":1561953481246,"caseReturnStatus":10,"caseReturnStatusText":"未退案","caseReturnStatusTime":1561953481246,"caseReturnStatusRemark":"未退案","caseVerifyBillStatus":10,"caseVerifyBillStatusText":"未生成对帐","caseVerifyBillStatusTime":1561953481246,"caseVerifyBillStatusRemark":"未生成对帐","caseRepaymentStatus":10,"caseRepaymentStatusRemark":"未还","caseRepaymentStatusText":"未还","caseRepaymentStatusTime":1561953481246,"caseAssistStatus":0,"caseAssistStatusRemark":null,"caseAssistStatusText":null,"caseAssistStatusTime":0,"caseKeepStatus":0,"caseKeepStatusText":null,"caseKeepStatusRemark":null,"caseKeepStatusTime":0,"caseDisputeStatus":0,"caseDisputeStatusRemark":"无争议","caseDisputeStatusText":"无争议","caseDisputeStatusTime":1561953481246,"contactResultStatus":7,"contactResultStatusText":"无人接听"},"caseTotalAppointAmount":22560.88,"caseType":1,"caseNewRepayment":0,"latestFollowUpTime":1563960363277,"reportTime":0,"debtorDataItems":[],"originalJson":["[{\"省份\":\"全国\",\"城市\":\"全省\",\"案件类型\":\"0-30\",\"催收机构\":\"江门分公司\",\"统计日期\":\"2019-07-01\",\"客户编码\":\"9900000000163882\",\"企业名称\":\"西安市唐朝商贸有限公司\",\"法人姓名\":\"朱姣姣\",\"产品类型\":\"个人经营贷\",\"T1\":\"1\",\"T2\":\"1\",\"逾期天数\":\"15\",\"逾期阶段\":\"1\",\"委托金额\":\"22560.88\",\"结清金额\":\"130027.60\",\"逾期本金\":\"20416.66\",\"逾期利息\":\"1914.71\",\"罚息\":\"229.51\",\"借据笔数\":\"2\",\"委托日期\":\"2019-07-01\",\"委托到期日\":\"2019-07-31\",\"委外公司\":\"深圳万乘联合投资有限公司\",\"客户身份证号\":\"432522197109076981\",\"客户绑卡手机号\":\"18681947299\",\"客户号码1\":\"18681947299\",\"客户号码2\":\"02968775126\",\"客户号码3\":\"02984155322\",\"通讯地址\":\"陕西省西安市长安区樱花北路１号１０号楼２单元６０１室\",\"户籍地址\":\"陕西省西安市长安区樱花北路1号10号楼2单元601室\",\"还款帐户户名\":\"朱姣姣\",\"还款账户银行名\":\"微众银行\",\"还款账户号码\":\"6236330070166805703\",\"已绑定他行银行名称\":\"兴业银行;光大银行\",\"已绑定他行账户\":\"622908453023426013;6226662504099229\",\"34\":null,\"CaseCode\":\"BNJ-20190701-002-000001\"}]"],"assistCheckItems":[],"caseFollowMessageItems":[{"caseFollowMessageGuid":"107043b6-6fb6-4c8e-83d5-a58673b42963","caseFollowMessageType":2,"caseFollowMessageTypeText":"催收小结","contents":"跟进test","createDate":1563872134106,"remindDate":0,"operatorName":"深圳系统管理员","operatorId":36,"isRemind":false,"isDel":false}],"latestFollowTime":1563935826736}
     */

    private String statusID;
    private String message;
    private String dataType;
    private DataBean data;

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * contactItems : [{"cidTypeText":"其他","relationText":"其他","gender":999,"name":"朱姣姣","cidType":999,"emailItems":null,"companyItems":[{"companyAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"},"companyName":"西安市唐朝商贸有限公司","resumeStatus":10,"position":"","resumeEndBeginDate":1561953481246,"resumeStatusText":"在职","resumeStatusRemark":"在职","resumeBeginDate":1561953481246,"companyPhone":{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"ecb0ea0b-824e-4350-ae6f-944bdebc1ea1","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":null},"companyGuId":"bd645a14-cdaf-4d7c-811b-3a9a8e309689"}],"relation":999,"phoneItems":[{"phoneNumberExt":"02968775126","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":999,"province":"","addressStatus":1,"addressGuId":"dd22d7e8-edd4-4db6-82e4-44b5c4a8f2cf","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"18681947299","phoneStatusTypeItem":{"phoneOwnerType":10,"phoneType":999,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"其他","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"},"phoneGuId":"329533c4-3cab-409d-b598-defdee4a57a3","isDel":false,"callCount":0,"remark":"","creator":"cs024","creatDate":1561953481246,"lastFollowDate":0,"sameDayCounts":0}],"genderText":"其他","addressItems":[],"personStatusItem":{"endBeginDate":1561953481246,"personStatus":10,"personStatusRemark":"正常","personStatusText":"正常","personStatusTime":1561953481246,"beginDate":1561953481246},"cidOfDebtor":"432522197109076981","age":0,"cidNo":"432522197109076981","contactGuId":"28e0eb7d-e7d7-412a-a0db-76ea68b5723c","cidNoExt":null,"unconnectDays":0,"lastValidFollowDate":0,"lastFollowDate":0},{"cidTypeText":null,"relationText":"夫妻","gender":0,"name":"fdsgfds","cidType":0,"emailItems":null,"companyItems":[],"relation":10,"phoneItems":[],"genderText":null,"addressItems":[{"addressStatusRemark":null,"address2":"案件地址2","addressTypeText":"住宅地址","country":null,"addressStatusText":"有效","city":null,"address1":"案件地址1","postCode":"442580","addressType":1,"province":null,"addressStatus":1,"addressGuId":"0b2fa1e7-8906-4526-a8e1-437f740639f9","creator":"szadmin","createDate":1563871808100,"isDel":false,"remark":"备注信息test","isVisited":true,"isLetter":false,"address1Ext":null,"address2Ext":null}],"personStatusItem":null,"cidOfDebtor":null,"age":0,"cidNo":null,"contactGuId":"50c68edc-03eb-4ff1-993f-a8febb78d7c4","cidNoExt":null,"unconnectDays":null,"lastValidFollowDate":0,"lastFollowDate":0},{"cidTypeText":null,"relationText":"夫妻","gender":0,"name":"朱娇娇","cidType":0,"emailItems":null,"companyItems":[],"relation":10,"phoneItems":[],"genderText":null,"addressItems":[{"addressStatusRemark":null,"address2":"未知地址2","addressTypeText":"未知地址","country":null,"addressStatusText":"有效","city":null,"address1":"未知地址1","postCode":"4455","addressType":10,"province":null,"addressStatus":1,"addressGuId":"35862a46-ccf7-4abd-a118-4e7bd2cb8e14","creator":"szadmin","createDate":1563957925112,"isDel":false,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"其他地址2","addressTypeText":"其他","country":null,"addressStatusText":"有效","city":null,"address1":"其他地址1","postCode":"4455","addressType":999,"province":null,"addressStatus":1,"addressGuId":"f4ed3f33-d6f8-4b58-988a-64b4f1aaccb1","creator":"szadmin","createDate":1563957948803,"isDel":false,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"户籍地址2","addressTypeText":"户籍地址","country":null,"addressStatusText":"有效","city":null,"address1":"户籍地址1","postCode":"4455","addressType":0,"province":null,"addressStatus":1,"addressGuId":"95d10a2b-610c-4a20-94e8-234c0d4bb391","creator":"szadmin","createDate":1563960134757,"isDel":true,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"personStatusItem":null,"cidOfDebtor":null,"age":0,"cidNo":null,"contactGuId":"81485b20-2f0c-413c-b440-66e5a0d85a76","cidNoExt":null,"unconnectDays":null,"lastValidFollowDate":0,"lastFollowDate":0}]
         * debtorItems : [{"debtorNo":"","iM":"","cidTypeText":"其他","gender":999,"name":"朱姣姣","cidType":999,"emailItems":null,"companyItems":[{"companyAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"},"companyName":"西安市唐朝商贸有限公司","resumeStatus":10,"position":"","resumeEndBeginDate":1561953481246,"resumeStatusText":"在职","resumeStatusRemark":"在职","resumeBeginDate":1561953481246,"companyPhone":{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"c194ce48-601e-4cf7-9f7e-82d7fd448ce5","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":{"phoneOwnerType":20,"phoneType":30,"phoneNumberTypeText":"固话","phoneOwnerTypeText":"非本人","phoneTypeText":"单位","connectSummaryStatusText":"无","phoneNumberType":10,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}},"companyGuId":"93fcabe5-2a31-469c-a6b4-2721efbac2d4"}],"socialNo":"","phoneItems":[{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"全省","address1":"","postCode":"","addressType":999,"province":"全国","addressStatus":1,"addressGuId":"af0e6d02-d3dc-4704-8a89-d881ec6533e0","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"18681947299","phoneStatusTypeItem":{"phoneOwnerType":10,"phoneType":10,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"手机","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"},"phoneGuId":"0b196d0a-4dd7-4236-ad08-aa724c1708f8","isDel":false,"callCount":0,"remark":"","creator":"cs024","creatDate":1561953481246,"lastFollowDate":0,"sameDayCounts":0}],"genderText":"其他","addressItems":[{"addressStatusRemark":null,"address2":"户籍地址测试2","addressTypeText":"户籍地址","country":null,"addressStatusText":"有效","city":null,"address1":"户籍地址测试2","postCode":"7878","addressType":0,"province":null,"addressStatus":1,"addressGuId":"3d619528-c29c-427a-965f-fa4c5de7db9c","creator":"szadmin","createDate":1563956613057,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"公司地址2","addressTypeText":"公司地址","country":null,"addressStatusText":"有效","city":null,"address1":"公司地址1","postCode":"7878","addressType":3,"province":null,"addressStatus":1,"addressGuId":"c8639cc3-773b-41c4-96ec-aad2c07456db","creator":"szadmin","createDate":1563957188846,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"personStatusItem":{"endBeginDate":1561953481246,"personStatus":10,"personStatusRemark":"正常","personStatusText":"正常","personStatusTime":1561953481246,"beginDate":1561953481246},"age":0,"cidNo":"432522197109076981","unconnectDays":0,"lastValidFollowDate":0,"lastFollowDate":0,"cidNoExt":null,"im":""}]
         * caseOperateItem : {"caseOfAgencyName":"深圳万乘","caseOfOperateID":36,"caseOfOperateName":"深圳系统管理员","caseOfDepartmentID":24,"caseOfDepartmentName":"总经理室","caseOfAgencyID":3,"caseAssistOfOperateName":"","caseAssistOfOperateID":0,"updateUserName":null,"updateUserId":0,"isOfAgDist":true,"caseOfDispatchItems":[{"caseDispatchId":3901,"caseDispatchName":"黄旦丽"}]}
         * caseCardRows : 1
         * caseId : 0
         * caseCode : BNJ-20190701-002-000001
         * caseTotalReceiptAmount : 0
         * urgeItems : [{"urgeVisitItems":[{"visitGuid":"02f25893-6b03-4d75-9e36-fb8b5387a888","taskGuid":"c555aee1-a184-24d5-8ffd-cf14fff0ae2f","applyOrgId":3,"applyOrgName":"深圳万乘","visitOrgId":3,"visitOrgName":"深圳万乘","visitObjectName":"fdsgfds","relationText":"夫妻","relation":10,"addressGuid":"0b2fa1e7-8906-4526-a8e1-437f740639f9","addressType":0,"addressTypeText":"户籍地址","address":"fbhfdhgfd","postCode":null,"province":"内蒙古","city":"鄂尔多斯市","county":"杭锦旗","visitArea":"内蒙古 . 鄂尔多斯市 . 杭锦旗","visitTimes":0,"applicantId":36,"applicantName":"szadmin","applyTime":1563871818296,"visitors":"szadmin","visitorsName":"深圳系统管理员,","visitBeginTime":1563408000000,"visitEndTime":1566518400000,"visitCompleteTime":0,"effectBackDay":0,"clerkId":36,"clerkName":"szadmin","visitStatus":30,"visitStatusText":"已排程","visitStatusRemark":null,"visitStatusTime":1563871818296,"visitBackAmount":0,"visitReason":"1","visitGoal":"fgf","remark":null,"isArchived":false,"isDel":false,"isPrint":false,"visitRecordItems":[{"recordGuid":"6f111d18-3c2a-477f-bdd4-2e6be5e602e3","operateTypeText":"审核","operateContent":"操作前：已申请/待审核修改，操作后：已审核/待排程","operateId":36,"operatorName":"szadmin","operateTime":1563871885771,"isDel":false},{"recordGuid":"5bdc9771-5e3a-48ba-bc0c-09061d3a0593","operateTypeText":"排程","operateContent":"操作前：已审核/待排程，操作后：已排程/待打印","operateId":36,"operatorName":"szadmin","operateTime":1563871971050,"isDel":false}]},{"visitGuid":"b096b21d-b5fc-402d-8eb1-48dc683de07a","taskGuid":null,"applyOrgId":3,"applyOrgName":"深圳万乘","visitOrgId":3,"visitOrgName":"深圳万乘","visitObjectName":"朱姣姣","relationText":"本人","relation":60,"addressGuid":"c722e05f-f0dc-4f88-8aea-39429c19fae1","addressType":7,"addressTypeText":"开卡地址","address":"案件地址1test","postCode":"787899875555","province":"山西省","city":"晋城市","county":"陵川县","visitArea":"山西省 . 晋城市 . 陵川县","visitTimes":0,"applicantId":36,"applicantName":"szadmin","applyTime":1563956396259,"visitors":null,"visitorsName":null,"visitBeginTime":0,"visitEndTime":0,"visitCompleteTime":0,"effectBackDay":0,"clerkId":36,"clerkName":"szadmin","visitStatus":10,"visitStatusText":"已申请","visitStatusRemark":null,"visitStatusTime":1563956396259,"visitBackAmount":0,"visitReason":"2","visitGoal":"tedsdsasa","remark":"fdfgggg","isArchived":false,"isDel":false,"isPrint":false,"visitRecordItems":[]}],"urgeLetterItems":[],"urgeAssistItems":[],"urgeSmsItems":[],"urgeRepairItems":[],"urgePhoneItems":[{"phoneUrgeTag":"280fca13-5586-4990-9c9d-a7a49a43d909","name":"test","phone":"1212333","relation":60,"urgeTypeName":"电催","callRecords":"催记test","contactSummary":1,"contactSummaryText":"未接通","contactResult":11,"contactResultText":"通话中","remark":"备注test","isDel":false,"createDate":1563872455591,"creator":"szadmin","urgeType":0,"promisePaymentItems":[{"cardNo":"9900000000163882","collectAmount":0,"promiseStatus":30,"promiseStatusText":"已付款","promisePaymentDate":1564012800000,"promisePaymentAmount":2000,"confirmAmount":2000,"confirmDate":1563875432623,"confirmPerson":"36","checkAmount":2000,"checkDate":1563811200000,"checkPerson":"36","applicationCheckAccountDate":0,"applicationPerson":null,"promiseDate":1563872455591,"remark":null,"isDel":false,"promisePaymentGuid":"6bdcbbc2-63f2-47c4-8931-657daf2ec822","isExport":null,"operator":"szadmin","operatorName":"深圳系统管理员","confirmPersonName":"深圳系统管理员","checkPersonName":"深圳系统管理员","applicationPersonName":null}]},{"phoneUrgeTag":"19bdecd6-4054-4660-8756-3973caa58680","name":"test","phone":"12233333","relation":60,"urgeTypeName":"电催","callRecords":"ddddd","contactSummary":2,"contactSummaryText":"联系到本人","contactResult":7,"contactResultText":"无人接听","remark":"teed","isDel":false,"createDate":1563935825957,"creator":"szadmin","urgeType":0,"promisePaymentItems":[{"cardNo":"9900000000163882","collectAmount":0,"promiseStatus":10,"promiseStatusText":"承诺还款","promisePaymentDate":1563926400000,"promisePaymentAmount":2000,"confirmAmount":0,"confirmDate":0,"confirmPerson":null,"checkAmount":0,"checkDate":0,"checkPerson":null,"applicationCheckAccountDate":0,"applicationPerson":null,"promiseDate":1563935825957,"remark":null,"isDel":false,"promisePaymentGuid":"45783318-cdd9-4881-b603-adb9b4800eb1","isExport":null,"operator":"szadmin","operatorName":"深圳系统管理员","confirmPersonName":null,"checkPersonName":null,"applicationPersonName":null}]}]}]
         * caseTotalUrgeAmount : 22560.88
         * cardItems : [{"verificationDate":1561953481246,"createAccountDate":1561953481246,"branchesBank":"","creditLine":0,"stagingPeriods":0,"caseAmount":22560.88,"collectAmount":22560.88,"paymentAmount":0,"arrearsAmount":22560.88,"masterCard":"","cardStatusItem":{"cardUrgeStatus":10,"cardRepaymenStatusRemark":"未还","cardRepaymentStatus":10,"cardUrgeStatusText":"在催","cardUrgeStatusTime":1561953481246,"cardRepaymenStatusText":"未还","cardRepaymenStatusTime":1561953481246,"cardUrgeStatusRemark":"在催"},"defaultRatings":"0-30","overdueDays":"15","reconciliationAddress":[{"addressStatusRemark":null,"address2":"对账地址2","addressTypeText":"对账单地址","country":null,"addressStatusText":"有效","city":null,"address1":"对账地址1","postCode":"7878","addressType":5,"province":null,"addressStatus":1,"addressGuId":"8ccae8e3-417f-4493-8689-0f3faf52ccc6","creator":"szadmin","createDate":1563957312411,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"对账地址22","addressTypeText":"对账单地址","country":null,"addressStatusText":"有效","city":null,"address1":"对账地址11","postCode":"4455","addressType":5,"province":null,"addressStatus":1,"addressGuId":"10185388-8f86-43a3-aafe-d3e6efb2fe72","creator":"szadmin","createDate":1563957838587,"isDel":true,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"interest":0,"overdueInstallments":"个人经营贷","currency":"RMB","carItem":{"carModel":"","carEngineNo":null,"carNo":"","carFrameNo":"","isGPS":0},"collectFee":0,"mortgageAddressItems":[{"addressStatusRemark":null,"address2":"抵押物地址2","addressTypeText":"抵押物地址","country":null,"addressStatusText":"有效","city":null,"address1":"抵押物地址1","postCode":"7878","addressType":6,"province":null,"addressStatus":1,"addressGuId":"6a735ec7-b969-4672-b169-1b2b37f407eb","creator":"szadmin","createDate":1563957421380,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}],"repaymentAmountPerPeriod":0,"accountNo":"9900000000163882","rate":0,"reconciliationDate":1561953481246,"branches":"","lastPaymentDate":0,"hand":"0-30","latestArrearsAmount":22560.88,"currencyAmount":0,"minRepaymentAmount":0,"latestArrearsDate":0,"cardNo":"9900000000163882","cardGuid":"f882dac8-9da3-4946-bb2c-2c0fe378601b","repaymentsPeriods":"","forfeitPenalty":0,"otherFee":0,"lastPaymentAmount":0,"principal":0,"cardDescription":null,"cardAddress":{"addressStatusRemark":"有效","address2":"案件地址2test","addressTypeText":"开卡地址","country":"中国","addressStatusText":"有效","city":"全省","address1":"案件地址1test","postCode":"787899875555","addressType":7,"province":"全国","addressStatus":1,"addressAsString":"全国全省","addressGuId":"c722e05f-f0dc-4f88-8aea-39429c19fae1","creator":"cs024","createDate":1561953481246,"isDel":false,"remark":"备注测试数据","isVisited":true,"isLetter":false,"address1Ext":null,"address2Ext":null},"billDate":"0","repaymentLogItems":[],"customersLatestArrears":null,"cardNoExt":null}]
         * batchItem : {"pauseTime":"1561952839873","pauseOfOperateName":"","customerCode":"BNJ","batchId":20,"pauseRemark":"","appointCaseQuantity":0,"customerId":1022,"batchType":20,"repaymentRate":1,"batchOperateItem":{"importAgencyID":1,"returnOfOperateName":"","importOperateName":"黄旦丽","importDate":1561952839873,"returnOfOperateID":0,"destroyOfOperateName":"","returnOfDate":1561952839873,"destroyOfOperateID":0,"importAgencyName":"集团","destroyOfDate":1564502400000,"importOperateID":3901},"returnRate":1,"batchCode":"BNJ-20190701-002","batchStatusItem":{"batchVerifyBillStatusRemark":"未生成对帐","batchVerifyBillStatus":10,"batchVerifyBillStatusText":"未生成对帐","batchVerifyBillStatusTime":1561953481246,"batchReceiptStatus":10,"batchAssignationStatusText":"分派到法务","batchAssignationStatusTime":1563625225764,"batchBillingStatusRemark":"未开","batchUrgeStatusRemark":"正常","batchReceiptStatusText":"未收","batchReceiptStatusTime":1561953481246,"batchAssignationStatus":40,"batchUrgeStatus":10,"batchStatusTime":1561953481246,"batchStatus":10,"batchUrgeStatusText":"正常","batchUrgeStatusTime":1561953481246,"batchAssignationStatusRemark":"分派到法务","batchReceiptStatusRemark":"未收","batchBillingStatus":10,"batchBillingStatusText":"未开","batchBillingStatusTime":1561953481246},"isPause":false,"appointCaseAmount":0,"pauseOfOperateID":0,"appointItem":{"appointEndDate":1561952839873,"appointEndBeginDate":1564502400000,"appointBeginDate":1561910400000,"appointDestroyDate":1564502400000,"keepDate":0},"customerName":"微众银行","commissionRate":1,"caseQuantity":0}
         * caseStatusItem : {"caseAssignationStatus":20,"caseAssignationStatusText":"已分配","caseAssignationStatusTime":1561953481246,"caseAssignationStatusRemark":"已分配","caseUrgeStatus":10,"caseUrgeStatusRemark":"在催","caseUrgeStatusText":"在催","caseUrgeStatusTime":1561953481246,"caseReturnStatus":10,"caseReturnStatusText":"未退案","caseReturnStatusTime":1561953481246,"caseReturnStatusRemark":"未退案","caseVerifyBillStatus":10,"caseVerifyBillStatusText":"未生成对帐","caseVerifyBillStatusTime":1561953481246,"caseVerifyBillStatusRemark":"未生成对帐","caseRepaymentStatus":10,"caseRepaymentStatusRemark":"未还","caseRepaymentStatusText":"未还","caseRepaymentStatusTime":1561953481246,"caseAssistStatus":0,"caseAssistStatusRemark":null,"caseAssistStatusText":null,"caseAssistStatusTime":0,"caseKeepStatus":0,"caseKeepStatusText":null,"caseKeepStatusRemark":null,"caseKeepStatusTime":0,"caseDisputeStatus":0,"caseDisputeStatusRemark":"无争议","caseDisputeStatusText":"无争议","caseDisputeStatusTime":1561953481246,"contactResultStatus":7,"contactResultStatusText":"无人接听"}
         * caseTotalAppointAmount : 22560.88
         * caseType : 1
         * caseNewRepayment : 0
         * latestFollowUpTime : 1563960363277
         * reportTime : 0
         * debtorDataItems : []
         * originalJson : ["[{\"省份\":\"全国\",\"城市\":\"全省\",\"案件类型\":\"0-30\",\"催收机构\":\"江门分公司\",\"统计日期\":\"2019-07-01\",\"客户编码\":\"9900000000163882\",\"企业名称\":\"西安市唐朝商贸有限公司\",\"法人姓名\":\"朱姣姣\",\"产品类型\":\"个人经营贷\",\"T1\":\"1\",\"T2\":\"1\",\"逾期天数\":\"15\",\"逾期阶段\":\"1\",\"委托金额\":\"22560.88\",\"结清金额\":\"130027.60\",\"逾期本金\":\"20416.66\",\"逾期利息\":\"1914.71\",\"罚息\":\"229.51\",\"借据笔数\":\"2\",\"委托日期\":\"2019-07-01\",\"委托到期日\":\"2019-07-31\",\"委外公司\":\"深圳万乘联合投资有限公司\",\"客户身份证号\":\"432522197109076981\",\"客户绑卡手机号\":\"18681947299\",\"客户号码1\":\"18681947299\",\"客户号码2\":\"02968775126\",\"客户号码3\":\"02984155322\",\"通讯地址\":\"陕西省西安市长安区樱花北路１号１０号楼２单元６０１室\",\"户籍地址\":\"陕西省西安市长安区樱花北路1号10号楼2单元601室\",\"还款帐户户名\":\"朱姣姣\",\"还款账户银行名\":\"微众银行\",\"还款账户号码\":\"6236330070166805703\",\"已绑定他行银行名称\":\"兴业银行;光大银行\",\"已绑定他行账户\":\"622908453023426013;6226662504099229\",\"34\":null,\"CaseCode\":\"BNJ-20190701-002-000001\"}]"]
         * assistCheckItems : []
         * caseFollowMessageItems : [{"caseFollowMessageGuid":"107043b6-6fb6-4c8e-83d5-a58673b42963","caseFollowMessageType":2,"caseFollowMessageTypeText":"催收小结","contents":"跟进test","createDate":1563872134106,"remindDate":0,"operatorName":"深圳系统管理员","operatorId":36,"isRemind":false,"isDel":false}]
         * latestFollowTime : 1563935826736
         */

        private CaseOperateItemBean caseOperateItem;
        private int caseCardRows;
        private int caseId;
        private String caseCode;
        private double caseTotalReceiptAmount;
        private double caseTotalUrgeAmount;
        private BatchItemBean batchItem;
        private CaseStatusItemBean caseStatusItem;
        private double caseTotalAppointAmount;
        private int caseType;
        private Object caseNewRepayment;
        private long latestFollowUpTime;
        private long reportTime;
        private long latestFollowTime;
        private List<ContactItemsBean> contactItems;
        private List<DebtorItemsBean> debtorItems;
        private List<UrgeItemsBean> urgeItems;
        private List<CardItemsBean> cardItems;
        private List<?> debtorDataItems;
        private List<String> originalJson;
        private List<?> assistCheckItems;
        private List<CaseFollowMessageItemsBean> caseFollowMessageItems;
        private List<OperateLogsBean> operateLogs;

        public List<OperateLogsBean> getOperateLogs() {
            return operateLogs;
        }

        public void setOperateLogs(List<OperateLogsBean> operateLogs) {
            this.operateLogs = operateLogs;
        }

        public CaseOperateItemBean getCaseOperateItem() {
            return caseOperateItem;
        }

        public void setCaseOperateItem(CaseOperateItemBean caseOperateItem) {
            this.caseOperateItem = caseOperateItem;
        }

        public int getCaseCardRows() {
            return caseCardRows;
        }

        public void setCaseCardRows(int caseCardRows) {
            this.caseCardRows = caseCardRows;
        }

        public int getCaseId() {
            return caseId;
        }

        public void setCaseId(int caseId) {
            this.caseId = caseId;
        }

        public String getCaseCode() {
            return caseCode;
        }

        public void setCaseCode(String caseCode) {
            this.caseCode = caseCode;
        }

        public double getCaseTotalReceiptAmount() {
            return caseTotalReceiptAmount;
        }

        public void setCaseTotalReceiptAmount(double caseTotalReceiptAmount) {
            this.caseTotalReceiptAmount = caseTotalReceiptAmount;
        }

        public double getCaseTotalUrgeAmount() {
            return caseTotalUrgeAmount;
        }

        public void setCaseTotalUrgeAmount(double caseTotalUrgeAmount) {
            this.caseTotalUrgeAmount = caseTotalUrgeAmount;
        }

        public BatchItemBean getBatchItem() {
            return batchItem;
        }

        public void setBatchItem(BatchItemBean batchItem) {
            this.batchItem = batchItem;
        }

        public CaseStatusItemBean getCaseStatusItem() {
            return caseStatusItem;
        }

        public void setCaseStatusItem(CaseStatusItemBean caseStatusItem) {
            this.caseStatusItem = caseStatusItem;
        }

        public double getCaseTotalAppointAmount() {
            return caseTotalAppointAmount;
        }

        public void setCaseTotalAppointAmount(double caseTotalAppointAmount) {
            this.caseTotalAppointAmount = caseTotalAppointAmount;
        }

        public int getCaseType() {
            return caseType;
        }

        public void setCaseType(int caseType) {
            this.caseType = caseType;
        }

        public Object getCaseNewRepayment() {
            return caseNewRepayment;
        }

        public void setCaseNewRepayment(Object caseNewRepayment) {
            this.caseNewRepayment = caseNewRepayment;
        }

        public long getLatestFollowUpTime() {
            return latestFollowUpTime;
        }

        public void setLatestFollowUpTime(long latestFollowUpTime) {
            this.latestFollowUpTime = latestFollowUpTime;
        }

        public long getReportTime() {
            return reportTime;
        }

        public void setReportTime(long reportTime) {
            this.reportTime = reportTime;
        }

        public long getLatestFollowTime() {
            return latestFollowTime;
        }

        public void setLatestFollowTime(long latestFollowTime) {
            this.latestFollowTime = latestFollowTime;
        }

        public List<ContactItemsBean> getContactItems() {
            return contactItems;
        }

        public void setContactItems(List<ContactItemsBean> contactItems) {
            this.contactItems = contactItems;
        }

        public List<DebtorItemsBean> getDebtorItems() {
            return debtorItems;
        }

        public void setDebtorItems(List<DebtorItemsBean> debtorItems) {
            this.debtorItems = debtorItems;
        }

        public List<UrgeItemsBean> getUrgeItems() {
            return urgeItems;
        }

        public void setUrgeItems(List<UrgeItemsBean> urgeItems) {
            this.urgeItems = urgeItems;
        }

        public List<CardItemsBean> getCardItems() {
            return cardItems;
        }

        public void setCardItems(List<CardItemsBean> cardItems) {
            this.cardItems = cardItems;
        }

        public List<?> getDebtorDataItems() {
            return debtorDataItems;
        }

        public void setDebtorDataItems(List<?> debtorDataItems) {
            this.debtorDataItems = debtorDataItems;
        }

        public List<String> getOriginalJson() {
            return originalJson;
        }

        public void setOriginalJson(List<String> originalJson) {
            this.originalJson = originalJson;
        }

        public List<?> getAssistCheckItems() {
            return assistCheckItems;
        }

        public void setAssistCheckItems(List<?> assistCheckItems) {
            this.assistCheckItems = assistCheckItems;
        }

        public List<CaseFollowMessageItemsBean> getCaseFollowMessageItems() {
            return caseFollowMessageItems;
        }

        public void setCaseFollowMessageItems(List<CaseFollowMessageItemsBean> caseFollowMessageItems) {
            this.caseFollowMessageItems = caseFollowMessageItems;
        }

        public static class CaseOperateItemBean {
            /**
             * caseOfAgencyName : 深圳万乘
             * caseOfOperateID : 36
             * caseOfOperateName : 深圳系统管理员
             * caseOfDepartmentID : 24
             * caseOfDepartmentName : 总经理室
             * caseOfAgencyID : 3
             * caseAssistOfOperateName :
             * caseAssistOfOperateID : 0
             * updateUserName : null
             * updateUserId : 0
             * isOfAgDist : true
             * caseOfDispatchItems : [{"caseDispatchId":3901,"caseDispatchName":"黄旦丽"}]
             */

            private String caseOfAgencyName;
            private int caseOfOperateID;
            private String caseOfOperateName;
            private int caseOfDepartmentID;
            private String caseOfDepartmentName;
            private int caseOfAgencyID;
            private String caseAssistOfOperateName;
            private int caseAssistOfOperateID;
            private Object updateUserName;
            private int updateUserId;
            private boolean isOfAgDist;
            private List<CaseOfDispatchItemsBean> caseOfDispatchItems;

            public String getCaseOfAgencyName() {
                return caseOfAgencyName;
            }

            public void setCaseOfAgencyName(String caseOfAgencyName) {
                this.caseOfAgencyName = caseOfAgencyName;
            }

            public int getCaseOfOperateID() {
                return caseOfOperateID;
            }

            public void setCaseOfOperateID(int caseOfOperateID) {
                this.caseOfOperateID = caseOfOperateID;
            }

            public String getCaseOfOperateName() {
                return caseOfOperateName;
            }

            public void setCaseOfOperateName(String caseOfOperateName) {
                this.caseOfOperateName = caseOfOperateName;
            }

            public int getCaseOfDepartmentID() {
                return caseOfDepartmentID;
            }

            public void setCaseOfDepartmentID(int caseOfDepartmentID) {
                this.caseOfDepartmentID = caseOfDepartmentID;
            }

            public String getCaseOfDepartmentName() {
                return caseOfDepartmentName;
            }

            public void setCaseOfDepartmentName(String caseOfDepartmentName) {
                this.caseOfDepartmentName = caseOfDepartmentName;
            }

            public int getCaseOfAgencyID() {
                return caseOfAgencyID;
            }

            public void setCaseOfAgencyID(int caseOfAgencyID) {
                this.caseOfAgencyID = caseOfAgencyID;
            }

            public String getCaseAssistOfOperateName() {
                return caseAssistOfOperateName;
            }

            public void setCaseAssistOfOperateName(String caseAssistOfOperateName) {
                this.caseAssistOfOperateName = caseAssistOfOperateName;
            }

            public int getCaseAssistOfOperateID() {
                return caseAssistOfOperateID;
            }

            public void setCaseAssistOfOperateID(int caseAssistOfOperateID) {
                this.caseAssistOfOperateID = caseAssistOfOperateID;
            }

            public Object getUpdateUserName() {
                return updateUserName;
            }

            public void setUpdateUserName(Object updateUserName) {
                this.updateUserName = updateUserName;
            }

            public int getUpdateUserId() {
                return updateUserId;
            }

            public void setUpdateUserId(int updateUserId) {
                this.updateUserId = updateUserId;
            }

            public boolean isIsOfAgDist() {
                return isOfAgDist;
            }

            public void setIsOfAgDist(boolean isOfAgDist) {
                this.isOfAgDist = isOfAgDist;
            }

            public List<CaseOfDispatchItemsBean> getCaseOfDispatchItems() {
                return caseOfDispatchItems;
            }

            public void setCaseOfDispatchItems(List<CaseOfDispatchItemsBean> caseOfDispatchItems) {
                this.caseOfDispatchItems = caseOfDispatchItems;
            }

            public static class CaseOfDispatchItemsBean {
                /**
                 * caseDispatchId : 3901
                 * caseDispatchName : 黄旦丽
                 */

                private int caseDispatchId;
                private String caseDispatchName;

                public int getCaseDispatchId() {
                    return caseDispatchId;
                }

                public void setCaseDispatchId(int caseDispatchId) {
                    this.caseDispatchId = caseDispatchId;
                }

                public String getCaseDispatchName() {
                    return caseDispatchName;
                }

                public void setCaseDispatchName(String caseDispatchName) {
                    this.caseDispatchName = caseDispatchName;
                }
            }
        }

        public static class BatchItemBean {
            /**
             * pauseTime : 1561952839873
             * pauseOfOperateName :
             * customerCode : BNJ
             * batchId : 20
             * pauseRemark :
             * appointCaseQuantity : 0
             * customerId : 1022
             * batchType : 20
             * repaymentRate : 1
             * batchOperateItem : {"importAgencyID":1,"returnOfOperateName":"","importOperateName":"黄旦丽","importDate":1561952839873,"returnOfOperateID":0,"destroyOfOperateName":"","returnOfDate":1561952839873,"destroyOfOperateID":0,"importAgencyName":"集团","destroyOfDate":1564502400000,"importOperateID":3901}
             * returnRate : 1
             * batchCode : BNJ-20190701-002
             * batchStatusItem : {"batchVerifyBillStatusRemark":"未生成对帐","batchVerifyBillStatus":10,"batchVerifyBillStatusText":"未生成对帐","batchVerifyBillStatusTime":1561953481246,"batchReceiptStatus":10,"batchAssignationStatusText":"分派到法务","batchAssignationStatusTime":1563625225764,"batchBillingStatusRemark":"未开","batchUrgeStatusRemark":"正常","batchReceiptStatusText":"未收","batchReceiptStatusTime":1561953481246,"batchAssignationStatus":40,"batchUrgeStatus":10,"batchStatusTime":1561953481246,"batchStatus":10,"batchUrgeStatusText":"正常","batchUrgeStatusTime":1561953481246,"batchAssignationStatusRemark":"分派到法务","batchReceiptStatusRemark":"未收","batchBillingStatus":10,"batchBillingStatusText":"未开","batchBillingStatusTime":1561953481246}
             * isPause : false
             * appointCaseAmount : 0
             * pauseOfOperateID : 0
             * appointItem : {"appointEndDate":1561952839873,"appointEndBeginDate":1564502400000,"appointBeginDate":1561910400000,"appointDestroyDate":1564502400000,"keepDate":0}
             * customerName : 微众银行
             * commissionRate : 1
             * caseQuantity : 0
             */

            private long pauseTime;
            private String pauseOfOperateName;
            private String customerCode;
            private int batchId;
            private String pauseRemark;
            private int appointCaseQuantity;
            private int customerId;
            private int batchType;
            private int repaymentRate;
            private BatchOperateItemBean batchOperateItem;
            private int returnRate;
            private String batchCode;
            private BatchStatusItemBean batchStatusItem;
            private boolean isPause;
            private double appointCaseAmount;
            private int pauseOfOperateID;
            private AppointItemBean appointItem;
            private String customerName;
            private int commissionRate;
            private int caseQuantity;

            public long getPauseTime() {
                return pauseTime;
            }

            public void setPauseTime(long pauseTime) {
                this.pauseTime = pauseTime;
            }

            public String getPauseOfOperateName() {
                return pauseOfOperateName;
            }

            public void setPauseOfOperateName(String pauseOfOperateName) {
                this.pauseOfOperateName = pauseOfOperateName;
            }

            public String getCustomerCode() {
                return customerCode;
            }

            public void setCustomerCode(String customerCode) {
                this.customerCode = customerCode;
            }

            public int getBatchId() {
                return batchId;
            }

            public void setBatchId(int batchId) {
                this.batchId = batchId;
            }

            public String getPauseRemark() {
                return pauseRemark;
            }

            public void setPauseRemark(String pauseRemark) {
                this.pauseRemark = pauseRemark;
            }

            public int getAppointCaseQuantity() {
                return appointCaseQuantity;
            }

            public void setAppointCaseQuantity(int appointCaseQuantity) {
                this.appointCaseQuantity = appointCaseQuantity;
            }

            public int getCustomerId() {
                return customerId;
            }

            public void setCustomerId(int customerId) {
                this.customerId = customerId;
            }

            public int getBatchType() {
                return batchType;
            }

            public void setBatchType(int batchType) {
                this.batchType = batchType;
            }

            public int getRepaymentRate() {
                return repaymentRate;
            }

            public void setRepaymentRate(int repaymentRate) {
                this.repaymentRate = repaymentRate;
            }

            public BatchOperateItemBean getBatchOperateItem() {
                return batchOperateItem;
            }

            public void setBatchOperateItem(BatchOperateItemBean batchOperateItem) {
                this.batchOperateItem = batchOperateItem;
            }

            public int getReturnRate() {
                return returnRate;
            }

            public void setReturnRate(int returnRate) {
                this.returnRate = returnRate;
            }

            public String getBatchCode() {
                return batchCode;
            }

            public void setBatchCode(String batchCode) {
                this.batchCode = batchCode;
            }

            public BatchStatusItemBean getBatchStatusItem() {
                return batchStatusItem;
            }

            public void setBatchStatusItem(BatchStatusItemBean batchStatusItem) {
                this.batchStatusItem = batchStatusItem;
            }

            public boolean isIsPause() {
                return isPause;
            }

            public void setIsPause(boolean isPause) {
                this.isPause = isPause;
            }

            public double getAppointCaseAmount() {
                return appointCaseAmount;
            }

            public void setAppointCaseAmount(double appointCaseAmount) {
                this.appointCaseAmount = appointCaseAmount;
            }

            public int getPauseOfOperateID() {
                return pauseOfOperateID;
            }

            public void setPauseOfOperateID(int pauseOfOperateID) {
                this.pauseOfOperateID = pauseOfOperateID;
            }

            public AppointItemBean getAppointItem() {
                return appointItem;
            }

            public void setAppointItem(AppointItemBean appointItem) {
                this.appointItem = appointItem;
            }

            public String getCustomerName() {
                return customerName;
            }

            public void setCustomerName(String customerName) {
                this.customerName = customerName;
            }

            public int getCommissionRate() {
                return commissionRate;
            }

            public void setCommissionRate(int commissionRate) {
                this.commissionRate = commissionRate;
            }

            public int getCaseQuantity() {
                return caseQuantity;
            }

            public void setCaseQuantity(int caseQuantity) {
                this.caseQuantity = caseQuantity;
            }

            public static class BatchOperateItemBean {
                /**
                 * importAgencyID : 1
                 * returnOfOperateName :
                 * importOperateName : 黄旦丽
                 * importDate : 1561952839873
                 * returnOfOperateID : 0
                 * destroyOfOperateName :
                 * returnOfDate : 1561952839873
                 * destroyOfOperateID : 0
                 * importAgencyName : 集团
                 * destroyOfDate : 1564502400000
                 * importOperateID : 3901
                 */

                private int importAgencyID;
                private String returnOfOperateName;
                private String importOperateName;
                private long importDate;
                private int returnOfOperateID;
                private String destroyOfOperateName;
                private long returnOfDate;
                private int destroyOfOperateID;
                private String importAgencyName;
                private long destroyOfDate;
                private int importOperateID;

                public int getImportAgencyID() {
                    return importAgencyID;
                }

                public void setImportAgencyID(int importAgencyID) {
                    this.importAgencyID = importAgencyID;
                }

                public String getReturnOfOperateName() {
                    return returnOfOperateName;
                }

                public void setReturnOfOperateName(String returnOfOperateName) {
                    this.returnOfOperateName = returnOfOperateName;
                }

                public String getImportOperateName() {
                    return importOperateName;
                }

                public void setImportOperateName(String importOperateName) {
                    this.importOperateName = importOperateName;
                }

                public long getImportDate() {
                    return importDate;
                }

                public void setImportDate(long importDate) {
                    this.importDate = importDate;
                }

                public int getReturnOfOperateID() {
                    return returnOfOperateID;
                }

                public void setReturnOfOperateID(int returnOfOperateID) {
                    this.returnOfOperateID = returnOfOperateID;
                }

                public String getDestroyOfOperateName() {
                    return destroyOfOperateName;
                }

                public void setDestroyOfOperateName(String destroyOfOperateName) {
                    this.destroyOfOperateName = destroyOfOperateName;
                }

                public long getReturnOfDate() {
                    return returnOfDate;
                }

                public void setReturnOfDate(long returnOfDate) {
                    this.returnOfDate = returnOfDate;
                }

                public int getDestroyOfOperateID() {
                    return destroyOfOperateID;
                }

                public void setDestroyOfOperateID(int destroyOfOperateID) {
                    this.destroyOfOperateID = destroyOfOperateID;
                }

                public String getImportAgencyName() {
                    return importAgencyName;
                }

                public void setImportAgencyName(String importAgencyName) {
                    this.importAgencyName = importAgencyName;
                }

                public long getDestroyOfDate() {
                    return destroyOfDate;
                }

                public void setDestroyOfDate(long destroyOfDate) {
                    this.destroyOfDate = destroyOfDate;
                }

                public int getImportOperateID() {
                    return importOperateID;
                }

                public void setImportOperateID(int importOperateID) {
                    this.importOperateID = importOperateID;
                }
            }

            public static class BatchStatusItemBean {
                /**
                 * batchVerifyBillStatusRemark : 未生成对帐
                 * batchVerifyBillStatus : 10
                 * batchVerifyBillStatusText : 未生成对帐
                 * batchVerifyBillStatusTime : 1561953481246
                 * batchReceiptStatus : 10
                 * batchAssignationStatusText : 分派到法务
                 * batchAssignationStatusTime : 1563625225764
                 * batchBillingStatusRemark : 未开
                 * batchUrgeStatusRemark : 正常
                 * batchReceiptStatusText : 未收
                 * batchReceiptStatusTime : 1561953481246
                 * batchAssignationStatus : 40
                 * batchUrgeStatus : 10
                 * batchStatusTime : 1561953481246
                 * batchStatus : 10
                 * batchUrgeStatusText : 正常
                 * batchUrgeStatusTime : 1561953481246
                 * batchAssignationStatusRemark : 分派到法务
                 * batchReceiptStatusRemark : 未收
                 * batchBillingStatus : 10
                 * batchBillingStatusText : 未开
                 * batchBillingStatusTime : 1561953481246
                 */

                private String batchVerifyBillStatusRemark;
                private int batchVerifyBillStatus;
                private String batchVerifyBillStatusText;
                private long batchVerifyBillStatusTime;
                private int batchReceiptStatus;
                private String batchAssignationStatusText;
                private long batchAssignationStatusTime;
                private String batchBillingStatusRemark;
                private String batchUrgeStatusRemark;
                private String batchReceiptStatusText;
                private long batchReceiptStatusTime;
                private int batchAssignationStatus;
                private int batchUrgeStatus;
                private long batchStatusTime;
                private int batchStatus;
                private String batchUrgeStatusText;
                private long batchUrgeStatusTime;
                private String batchAssignationStatusRemark;
                private String batchReceiptStatusRemark;
                private int batchBillingStatus;
                private String batchBillingStatusText;
                private long batchBillingStatusTime;

                public String getBatchVerifyBillStatusRemark() {
                    return batchVerifyBillStatusRemark;
                }

                public void setBatchVerifyBillStatusRemark(String batchVerifyBillStatusRemark) {
                    this.batchVerifyBillStatusRemark = batchVerifyBillStatusRemark;
                }

                public int getBatchVerifyBillStatus() {
                    return batchVerifyBillStatus;
                }

                public void setBatchVerifyBillStatus(int batchVerifyBillStatus) {
                    this.batchVerifyBillStatus = batchVerifyBillStatus;
                }

                public String getBatchVerifyBillStatusText() {
                    return batchVerifyBillStatusText;
                }

                public void setBatchVerifyBillStatusText(String batchVerifyBillStatusText) {
                    this.batchVerifyBillStatusText = batchVerifyBillStatusText;
                }

                public long getBatchVerifyBillStatusTime() {
                    return batchVerifyBillStatusTime;
                }

                public void setBatchVerifyBillStatusTime(long batchVerifyBillStatusTime) {
                    this.batchVerifyBillStatusTime = batchVerifyBillStatusTime;
                }

                public int getBatchReceiptStatus() {
                    return batchReceiptStatus;
                }

                public void setBatchReceiptStatus(int batchReceiptStatus) {
                    this.batchReceiptStatus = batchReceiptStatus;
                }

                public String getBatchAssignationStatusText() {
                    return batchAssignationStatusText;
                }

                public void setBatchAssignationStatusText(String batchAssignationStatusText) {
                    this.batchAssignationStatusText = batchAssignationStatusText;
                }

                public long getBatchAssignationStatusTime() {
                    return batchAssignationStatusTime;
                }

                public void setBatchAssignationStatusTime(long batchAssignationStatusTime) {
                    this.batchAssignationStatusTime = batchAssignationStatusTime;
                }

                public String getBatchBillingStatusRemark() {
                    return batchBillingStatusRemark;
                }

                public void setBatchBillingStatusRemark(String batchBillingStatusRemark) {
                    this.batchBillingStatusRemark = batchBillingStatusRemark;
                }

                public String getBatchUrgeStatusRemark() {
                    return batchUrgeStatusRemark;
                }

                public void setBatchUrgeStatusRemark(String batchUrgeStatusRemark) {
                    this.batchUrgeStatusRemark = batchUrgeStatusRemark;
                }

                public String getBatchReceiptStatusText() {
                    return batchReceiptStatusText;
                }

                public void setBatchReceiptStatusText(String batchReceiptStatusText) {
                    this.batchReceiptStatusText = batchReceiptStatusText;
                }

                public long getBatchReceiptStatusTime() {
                    return batchReceiptStatusTime;
                }

                public void setBatchReceiptStatusTime(long batchReceiptStatusTime) {
                    this.batchReceiptStatusTime = batchReceiptStatusTime;
                }

                public int getBatchAssignationStatus() {
                    return batchAssignationStatus;
                }

                public void setBatchAssignationStatus(int batchAssignationStatus) {
                    this.batchAssignationStatus = batchAssignationStatus;
                }

                public int getBatchUrgeStatus() {
                    return batchUrgeStatus;
                }

                public void setBatchUrgeStatus(int batchUrgeStatus) {
                    this.batchUrgeStatus = batchUrgeStatus;
                }

                public long getBatchStatusTime() {
                    return batchStatusTime;
                }

                public void setBatchStatusTime(long batchStatusTime) {
                    this.batchStatusTime = batchStatusTime;
                }

                public int getBatchStatus() {
                    return batchStatus;
                }

                public void setBatchStatus(int batchStatus) {
                    this.batchStatus = batchStatus;
                }

                public String getBatchUrgeStatusText() {
                    return batchUrgeStatusText;
                }

                public void setBatchUrgeStatusText(String batchUrgeStatusText) {
                    this.batchUrgeStatusText = batchUrgeStatusText;
                }

                public long getBatchUrgeStatusTime() {
                    return batchUrgeStatusTime;
                }

                public void setBatchUrgeStatusTime(long batchUrgeStatusTime) {
                    this.batchUrgeStatusTime = batchUrgeStatusTime;
                }

                public String getBatchAssignationStatusRemark() {
                    return batchAssignationStatusRemark;
                }

                public void setBatchAssignationStatusRemark(String batchAssignationStatusRemark) {
                    this.batchAssignationStatusRemark = batchAssignationStatusRemark;
                }

                public String getBatchReceiptStatusRemark() {
                    return batchReceiptStatusRemark;
                }

                public void setBatchReceiptStatusRemark(String batchReceiptStatusRemark) {
                    this.batchReceiptStatusRemark = batchReceiptStatusRemark;
                }

                public int getBatchBillingStatus() {
                    return batchBillingStatus;
                }

                public void setBatchBillingStatus(int batchBillingStatus) {
                    this.batchBillingStatus = batchBillingStatus;
                }

                public String getBatchBillingStatusText() {
                    return batchBillingStatusText;
                }

                public void setBatchBillingStatusText(String batchBillingStatusText) {
                    this.batchBillingStatusText = batchBillingStatusText;
                }

                public long getBatchBillingStatusTime() {
                    return batchBillingStatusTime;
                }

                public void setBatchBillingStatusTime(long batchBillingStatusTime) {
                    this.batchBillingStatusTime = batchBillingStatusTime;
                }
            }

            public static class AppointItemBean {
                /**
                 * appointEndDate : 1561952839873
                 * appointEndBeginDate : 1564502400000
                 * appointBeginDate : 1561910400000
                 * appointDestroyDate : 1564502400000
                 * keepDate : 0
                 */

                private long appointEndDate;
                private long appointEndBeginDate;
                private long appointBeginDate;
                private long appointDestroyDate;
                private long keepDate;

                public long getAppointEndDate() {
                    return appointEndDate;
                }

                public void setAppointEndDate(long appointEndDate) {
                    this.appointEndDate = appointEndDate;
                }

                public long getAppointEndBeginDate() {
                    return appointEndBeginDate;
                }

                public void setAppointEndBeginDate(long appointEndBeginDate) {
                    this.appointEndBeginDate = appointEndBeginDate;
                }

                public long getAppointBeginDate() {
                    return appointBeginDate;
                }

                public void setAppointBeginDate(long appointBeginDate) {
                    this.appointBeginDate = appointBeginDate;
                }

                public long getAppointDestroyDate() {
                    return appointDestroyDate;
                }

                public void setAppointDestroyDate(long appointDestroyDate) {
                    this.appointDestroyDate = appointDestroyDate;
                }

                public long getKeepDate() {
                    return keepDate;
                }

                public void setKeepDate(long keepDate) {
                    this.keepDate = keepDate;
                }
            }
        }

        public static class CaseStatusItemBean {
            /**
             * caseAssignationStatus : 20
             * caseAssignationStatusText : 已分配
             * caseAssignationStatusTime : 1561953481246
             * caseAssignationStatusRemark : 已分配
             * caseUrgeStatus : 10
             * caseUrgeStatusRemark : 在催
             * caseUrgeStatusText : 在催
             * caseUrgeStatusTime : 1561953481246
             * caseReturnStatus : 10
             * caseReturnStatusText : 未退案
             * caseReturnStatusTime : 1561953481246
             * caseReturnStatusRemark : 未退案
             * caseVerifyBillStatus : 10
             * caseVerifyBillStatusText : 未生成对帐
             * caseVerifyBillStatusTime : 1561953481246
             * caseVerifyBillStatusRemark : 未生成对帐
             * caseRepaymentStatus : 10
             * caseRepaymentStatusRemark : 未还
             * caseRepaymentStatusText : 未还
             * caseRepaymentStatusTime : 1561953481246
             * caseAssistStatus : 0
             * caseAssistStatusRemark : null
             * caseAssistStatusText : null
             * caseAssistStatusTime : 0
             * caseKeepStatus : 0
             * caseKeepStatusText : null
             * caseKeepStatusRemark : null
             * caseKeepStatusTime : 0
             * caseDisputeStatus : 0
             * caseDisputeStatusRemark : 无争议
             * caseDisputeStatusText : 无争议
             * caseDisputeStatusTime : 1561953481246
             * contactResultStatus : 7
             * contactResultStatusText : 无人接听
             */

            private int caseAssignationStatus;
            private String caseAssignationStatusText;
            private long caseAssignationStatusTime;
            private String caseAssignationStatusRemark;
            private int caseUrgeStatus;
            private String caseUrgeStatusRemark;
            private String caseUrgeStatusText;
            private long caseUrgeStatusTime;
            private int caseReturnStatus;
            private String caseReturnStatusText;
            private long caseReturnStatusTime;
            private String caseReturnStatusRemark;
            private int caseVerifyBillStatus;
            private String caseVerifyBillStatusText;
            private long caseVerifyBillStatusTime;
            private String caseVerifyBillStatusRemark;
            private int caseRepaymentStatus;
            private String caseRepaymentStatusRemark;
            private String caseRepaymentStatusText;
            private long caseRepaymentStatusTime;
            private int caseAssistStatus;
            private Object caseAssistStatusRemark;
            private Object caseAssistStatusText;
            private long caseAssistStatusTime;
            private int caseKeepStatus;
            private Object caseKeepStatusText;
            private Object caseKeepStatusRemark;
            private long caseKeepStatusTime;
            private int caseDisputeStatus;
            private String caseDisputeStatusRemark;
            private String caseDisputeStatusText;
            private long caseDisputeStatusTime;
            private int contactResultStatus;
            private String contactResultStatusText;

            public int getCaseAssignationStatus() {
                return caseAssignationStatus;
            }

            public void setCaseAssignationStatus(int caseAssignationStatus) {
                this.caseAssignationStatus = caseAssignationStatus;
            }

            public String getCaseAssignationStatusText() {
                return caseAssignationStatusText;
            }

            public void setCaseAssignationStatusText(String caseAssignationStatusText) {
                this.caseAssignationStatusText = caseAssignationStatusText;
            }

            public long getCaseAssignationStatusTime() {
                return caseAssignationStatusTime;
            }

            public void setCaseAssignationStatusTime(long caseAssignationStatusTime) {
                this.caseAssignationStatusTime = caseAssignationStatusTime;
            }

            public String getCaseAssignationStatusRemark() {
                return caseAssignationStatusRemark;
            }

            public void setCaseAssignationStatusRemark(String caseAssignationStatusRemark) {
                this.caseAssignationStatusRemark = caseAssignationStatusRemark;
            }

            public int getCaseUrgeStatus() {
                return caseUrgeStatus;
            }

            public void setCaseUrgeStatus(int caseUrgeStatus) {
                this.caseUrgeStatus = caseUrgeStatus;
            }

            public String getCaseUrgeStatusRemark() {
                return caseUrgeStatusRemark;
            }

            public void setCaseUrgeStatusRemark(String caseUrgeStatusRemark) {
                this.caseUrgeStatusRemark = caseUrgeStatusRemark;
            }

            public String getCaseUrgeStatusText() {
                return caseUrgeStatusText;
            }

            public void setCaseUrgeStatusText(String caseUrgeStatusText) {
                this.caseUrgeStatusText = caseUrgeStatusText;
            }

            public long getCaseUrgeStatusTime() {
                return caseUrgeStatusTime;
            }

            public void setCaseUrgeStatusTime(long caseUrgeStatusTime) {
                this.caseUrgeStatusTime = caseUrgeStatusTime;
            }

            public int getCaseReturnStatus() {
                return caseReturnStatus;
            }

            public void setCaseReturnStatus(int caseReturnStatus) {
                this.caseReturnStatus = caseReturnStatus;
            }

            public String getCaseReturnStatusText() {
                return caseReturnStatusText;
            }

            public void setCaseReturnStatusText(String caseReturnStatusText) {
                this.caseReturnStatusText = caseReturnStatusText;
            }

            public long getCaseReturnStatusTime() {
                return caseReturnStatusTime;
            }

            public void setCaseReturnStatusTime(long caseReturnStatusTime) {
                this.caseReturnStatusTime = caseReturnStatusTime;
            }

            public String getCaseReturnStatusRemark() {
                return caseReturnStatusRemark;
            }

            public void setCaseReturnStatusRemark(String caseReturnStatusRemark) {
                this.caseReturnStatusRemark = caseReturnStatusRemark;
            }

            public int getCaseVerifyBillStatus() {
                return caseVerifyBillStatus;
            }

            public void setCaseVerifyBillStatus(int caseVerifyBillStatus) {
                this.caseVerifyBillStatus = caseVerifyBillStatus;
            }

            public String getCaseVerifyBillStatusText() {
                return caseVerifyBillStatusText;
            }

            public void setCaseVerifyBillStatusText(String caseVerifyBillStatusText) {
                this.caseVerifyBillStatusText = caseVerifyBillStatusText;
            }

            public long getCaseVerifyBillStatusTime() {
                return caseVerifyBillStatusTime;
            }

            public void setCaseVerifyBillStatusTime(long caseVerifyBillStatusTime) {
                this.caseVerifyBillStatusTime = caseVerifyBillStatusTime;
            }

            public String getCaseVerifyBillStatusRemark() {
                return caseVerifyBillStatusRemark;
            }

            public void setCaseVerifyBillStatusRemark(String caseVerifyBillStatusRemark) {
                this.caseVerifyBillStatusRemark = caseVerifyBillStatusRemark;
            }

            public int getCaseRepaymentStatus() {
                return caseRepaymentStatus;
            }

            public void setCaseRepaymentStatus(int caseRepaymentStatus) {
                this.caseRepaymentStatus = caseRepaymentStatus;
            }

            public String getCaseRepaymentStatusRemark() {
                return caseRepaymentStatusRemark;
            }

            public void setCaseRepaymentStatusRemark(String caseRepaymentStatusRemark) {
                this.caseRepaymentStatusRemark = caseRepaymentStatusRemark;
            }

            public String getCaseRepaymentStatusText() {
                return caseRepaymentStatusText;
            }

            public void setCaseRepaymentStatusText(String caseRepaymentStatusText) {
                this.caseRepaymentStatusText = caseRepaymentStatusText;
            }

            public long getCaseRepaymentStatusTime() {
                return caseRepaymentStatusTime;
            }

            public void setCaseRepaymentStatusTime(long caseRepaymentStatusTime) {
                this.caseRepaymentStatusTime = caseRepaymentStatusTime;
            }

            public int getCaseAssistStatus() {
                return caseAssistStatus;
            }

            public void setCaseAssistStatus(int caseAssistStatus) {
                this.caseAssistStatus = caseAssistStatus;
            }

            public Object getCaseAssistStatusRemark() {
                return caseAssistStatusRemark;
            }

            public void setCaseAssistStatusRemark(Object caseAssistStatusRemark) {
                this.caseAssistStatusRemark = caseAssistStatusRemark;
            }

            public Object getCaseAssistStatusText() {
                return caseAssistStatusText;
            }

            public void setCaseAssistStatusText(Object caseAssistStatusText) {
                this.caseAssistStatusText = caseAssistStatusText;
            }

            public long getCaseAssistStatusTime() {
                return caseAssistStatusTime;
            }

            public void setCaseAssistStatusTime(long caseAssistStatusTime) {
                this.caseAssistStatusTime = caseAssistStatusTime;
            }

            public int getCaseKeepStatus() {
                return caseKeepStatus;
            }

            public void setCaseKeepStatus(int caseKeepStatus) {
                this.caseKeepStatus = caseKeepStatus;
            }

            public Object getCaseKeepStatusText() {
                return caseKeepStatusText;
            }

            public void setCaseKeepStatusText(Object caseKeepStatusText) {
                this.caseKeepStatusText = caseKeepStatusText;
            }

            public Object getCaseKeepStatusRemark() {
                return caseKeepStatusRemark;
            }

            public void setCaseKeepStatusRemark(Object caseKeepStatusRemark) {
                this.caseKeepStatusRemark = caseKeepStatusRemark;
            }

            public long getCaseKeepStatusTime() {
                return caseKeepStatusTime;
            }

            public void setCaseKeepStatusTime(long caseKeepStatusTime) {
                this.caseKeepStatusTime = caseKeepStatusTime;
            }

            public int getCaseDisputeStatus() {
                return caseDisputeStatus;
            }

            public void setCaseDisputeStatus(int caseDisputeStatus) {
                this.caseDisputeStatus = caseDisputeStatus;
            }

            public String getCaseDisputeStatusRemark() {
                return caseDisputeStatusRemark;
            }

            public void setCaseDisputeStatusRemark(String caseDisputeStatusRemark) {
                this.caseDisputeStatusRemark = caseDisputeStatusRemark;
            }

            public String getCaseDisputeStatusText() {
                return caseDisputeStatusText;
            }

            public void setCaseDisputeStatusText(String caseDisputeStatusText) {
                this.caseDisputeStatusText = caseDisputeStatusText;
            }

            public long getCaseDisputeStatusTime() {
                return caseDisputeStatusTime;
            }

            public void setCaseDisputeStatusTime(long caseDisputeStatusTime) {
                this.caseDisputeStatusTime = caseDisputeStatusTime;
            }

            public int getContactResultStatus() {
                return contactResultStatus;
            }

            public void setContactResultStatus(int contactResultStatus) {
                this.contactResultStatus = contactResultStatus;
            }

            public String getContactResultStatusText() {
                return contactResultStatusText;
            }

            public void setContactResultStatusText(String contactResultStatusText) {
                this.contactResultStatusText = contactResultStatusText;
            }
        }

        public static class ContactItemsBean {
            /**
             * cidTypeText : 其他
             * relationText : 其他
             * gender : 999
             * name : 朱姣姣
             * cidType : 999
             * emailItems : null
             * companyItems : [{"companyAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"},"companyName":"西安市唐朝商贸有限公司","resumeStatus":10,"position":"","resumeEndBeginDate":1561953481246,"resumeStatusText":"在职","resumeStatusRemark":"在职","resumeBeginDate":1561953481246,"companyPhone":{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"ecb0ea0b-824e-4350-ae6f-944bdebc1ea1","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":null},"companyGuId":"bd645a14-cdaf-4d7c-811b-3a9a8e309689"}]
             * relation : 999
             * phoneItems : [{"phoneNumberExt":"02968775126","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":999,"province":"","addressStatus":1,"addressGuId":"dd22d7e8-edd4-4db6-82e4-44b5c4a8f2cf","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"18681947299","phoneStatusTypeItem":{"phoneOwnerType":10,"phoneType":999,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"其他","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"},"phoneGuId":"329533c4-3cab-409d-b598-defdee4a57a3","isDel":false,"callCount":0,"remark":"","creator":"cs024","creatDate":1561953481246,"lastFollowDate":0,"sameDayCounts":0}]
             * genderText : 其他
             * addressItems : []
             * personStatusItem : {"endBeginDate":1561953481246,"personStatus":10,"personStatusRemark":"正常","personStatusText":"正常","personStatusTime":1561953481246,"beginDate":1561953481246}
             * cidOfDebtor : 432522197109076981
             * age : 0
             * cidNo : 432522197109076981
             * contactGuId : 28e0eb7d-e7d7-412a-a0db-76ea68b5723c
             * cidNoExt : null
             * unconnectDays : 0
             * lastValidFollowDate : 0
             * lastFollowDate : 0
             */

            private String cidTypeText;
            private String relationText;
            private int gender;
            private String name;
            private int cidType;
            private Object emailItems;
            private int relation;
            private String genderText;
            private PersonStatusItemBean personStatusItem;
            private String cidOfDebtor;
            private int age;
            private String cidNo;
            private String contactGuId;
            private Object cidNoExt;
            private long unconnectDays;
            private long lastValidFollowDate;
            private long lastFollowDate;
            private List<CompanyItemsBean> companyItems;
            private List<PhoneItemsBean> phoneItems;
            private List<AddressItemsBean> addressItems;

            public String getCidTypeText() {
                return cidTypeText;
            }

            public void setCidTypeText(String cidTypeText) {
                this.cidTypeText = cidTypeText;
            }

            public String getRelationText() {
                return relationText;
            }

            public void setRelationText(String relationText) {
                this.relationText = relationText;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCidType() {
                return cidType;
            }

            public void setCidType(int cidType) {
                this.cidType = cidType;
            }

            public Object getEmailItems() {
                return emailItems;
            }

            public void setEmailItems(Object emailItems) {
                this.emailItems = emailItems;
            }

            public int getRelation() {
                return relation;
            }

            public void setRelation(int relation) {
                this.relation = relation;
            }

            public String getGenderText() {
                return genderText;
            }

            public void setGenderText(String genderText) {
                this.genderText = genderText;
            }

            public PersonStatusItemBean getPersonStatusItem() {
                return personStatusItem;
            }

            public void setPersonStatusItem(PersonStatusItemBean personStatusItem) {
                this.personStatusItem = personStatusItem;
            }

            public String getCidOfDebtor() {
                return cidOfDebtor;
            }

            public void setCidOfDebtor(String cidOfDebtor) {
                this.cidOfDebtor = cidOfDebtor;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getCidNo() {
                return cidNo;
            }

            public void setCidNo(String cidNo) {
                this.cidNo = cidNo;
            }

            public String getContactGuId() {
                return contactGuId;
            }

            public void setContactGuId(String contactGuId) {
                this.contactGuId = contactGuId;
            }

            public Object getCidNoExt() {
                return cidNoExt;
            }

            public void setCidNoExt(Object cidNoExt) {
                this.cidNoExt = cidNoExt;
            }

            public long getUnconnectDays() {
                return unconnectDays;
            }

            public void setUnconnectDays(long unconnectDays) {
                this.unconnectDays = unconnectDays;
            }

            public long getLastValidFollowDate() {
                return lastValidFollowDate;
            }

            public void setLastValidFollowDate(long lastValidFollowDate) {
                this.lastValidFollowDate = lastValidFollowDate;
            }

            public long getLastFollowDate() {
                return lastFollowDate;
            }

            public void setLastFollowDate(long lastFollowDate) {
                this.lastFollowDate = lastFollowDate;
            }

            public List<CompanyItemsBean> getCompanyItems() {
                return companyItems;
            }

            public void setCompanyItems(List<CompanyItemsBean> companyItems) {
                this.companyItems = companyItems;
            }

            public List<PhoneItemsBean> getPhoneItems() {
                return phoneItems;
            }

            public void setPhoneItems(List<PhoneItemsBean> phoneItems) {
                this.phoneItems = phoneItems;
            }

            public List<AddressItemsBean> getAddressItems() {
                return addressItems;
            }

            public void setAddressItems(List<AddressItemsBean> addressItems) {
                this.addressItems = addressItems;
            }


            public static class AddressItemsBean implements  Serializable{
                /**
                 * addressStatusRemark : null
                 * address2 : 户籍地址测试2
                 * addressTypeText : 户籍地址
                 * country : null
                 * addressStatusText : 有效
                 * city : null
                 * address1 : 户籍地址测试2
                 * postCode : 7878
                 * addressType : 0
                 * province : null
                 * addressStatus : 1
                 * addressGuId : 3d619528-c29c-427a-965f-fa4c5de7db9c
                 * creator : szadmin
                 * createDate : 1563956613057
                 * isDel : false
                 * remark : 备注测试数据
                 * isVisited : false
                 * isLetter : false
                 * address1Ext : null
                 * address2Ext : null
                 */

                private Object addressStatusRemark;
                private String address2;
                private String addressTypeText;
                private Object country;
                private String addressStatusText;
                private Object city;
                private String address1;
                private String postCode;
                private int addressType;
                private Object province;
                private int addressStatus;
                private String addressGuId;
                private String creator;
                private long createDate;
                private boolean isDel;
                private String remark;
                private boolean isVisited;
                private boolean isLetter;
                private Object address1Ext;
                private Object address2Ext;

                public Object getAddressStatusRemark() {
                    return addressStatusRemark;
                }

                public void setAddressStatusRemark(Object addressStatusRemark) {
                    this.addressStatusRemark = addressStatusRemark;
                }

                public String getAddress2() {
                    return address2;
                }

                public void setAddress2(String address2) {
                    this.address2 = address2;
                }

                public String getAddressTypeText() {
                    return addressTypeText;
                }

                public void setAddressTypeText(String addressTypeText) {
                    this.addressTypeText = addressTypeText;
                }

                public Object getCountry() {
                    return country;
                }

                public void setCountry(Object country) {
                    this.country = country;
                }

                public String getAddressStatusText() {
                    return addressStatusText;
                }

                public void setAddressStatusText(String addressStatusText) {
                    this.addressStatusText = addressStatusText;
                }

                public Object getCity() {
                    return city;
                }

                public void setCity(Object city) {
                    this.city = city;
                }

                public String getAddress1() {
                    return address1;
                }

                public void setAddress1(String address1) {
                    this.address1 = address1;
                }

                public String getPostCode() {
                    return postCode;
                }

                public void setPostCode(String postCode) {
                    this.postCode = postCode;
                }

                public int getAddressType() {
                    return addressType;
                }

                public void setAddressType(int addressType) {
                    this.addressType = addressType;
                }

                public Object getProvince() {
                    return province;
                }

                public void setProvince(Object province) {
                    this.province = province;
                }

                public int getAddressStatus() {
                    return addressStatus;
                }

                public void setAddressStatus(int addressStatus) {
                    this.addressStatus = addressStatus;
                }

                public String getAddressGuId() {
                    return addressGuId;
                }

                public void setAddressGuId(String addressGuId) {
                    this.addressGuId = addressGuId;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public boolean isIsVisited() {
                    return isVisited;
                }

                public void setIsVisited(boolean isVisited) {
                    this.isVisited = isVisited;
                }

                public boolean isIsLetter() {
                    return isLetter;
                }

                public void setIsLetter(boolean isLetter) {
                    this.isLetter = isLetter;
                }

                public Object getAddress1Ext() {
                    return address1Ext;
                }

                public void setAddress1Ext(Object address1Ext) {
                    this.address1Ext = address1Ext;
                }

                public Object getAddress2Ext() {
                    return address2Ext;
                }

                public void setAddress2Ext(Object address2Ext) {
                    this.address2Ext = address2Ext;
                }
            }







            public static class PersonStatusItemBean {
                /**
                 * endBeginDate : 1561953481246
                 * personStatus : 10
                 * personStatusRemark : 正常
                 * personStatusText : 正常
                 * personStatusTime : 1561953481246
                 * beginDate : 1561953481246
                 */

                private long endBeginDate;
                private int personStatus;
                private String personStatusRemark;
                private String personStatusText;
                private long personStatusTime;
                private long beginDate;

                public long getEndBeginDate() {
                    return endBeginDate;
                }

                public void setEndBeginDate(long endBeginDate) {
                    this.endBeginDate = endBeginDate;
                }

                public int getPersonStatus() {
                    return personStatus;
                }

                public void setPersonStatus(int personStatus) {
                    this.personStatus = personStatus;
                }

                public String getPersonStatusRemark() {
                    return personStatusRemark;
                }

                public void setPersonStatusRemark(String personStatusRemark) {
                    this.personStatusRemark = personStatusRemark;
                }

                public String getPersonStatusText() {
                    return personStatusText;
                }

                public void setPersonStatusText(String personStatusText) {
                    this.personStatusText = personStatusText;
                }

                public long getPersonStatusTime() {
                    return personStatusTime;
                }

                public void setPersonStatusTime(long personStatusTime) {
                    this.personStatusTime = personStatusTime;
                }

                public long getBeginDate() {
                    return beginDate;
                }

                public void setBeginDate(long beginDate) {
                    this.beginDate = beginDate;
                }
            }

            public static class CompanyItemsBean {
                /**
                 * companyAddress : {"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"}
                 * companyName : 西安市唐朝商贸有限公司
                 * resumeStatus : 10
                 * position :
                 * resumeEndBeginDate : 1561953481246
                 * resumeStatusText : 在职
                 * resumeStatusRemark : 在职
                 * resumeBeginDate : 1561953481246
                 * companyPhone : {"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"ecb0ea0b-824e-4350-ae6f-944bdebc1ea1","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":null}
                 * companyGuId : bd645a14-cdaf-4d7c-811b-3a9a8e309689
                 */

                private CompanyAddressBean companyAddress;
                private String companyName;
                private int resumeStatus;
                private String position;
                private long resumeEndBeginDate;
                private String resumeStatusText;
                private String resumeStatusRemark;
                private long resumeBeginDate;
                private CompanyPhoneBean companyPhone;
                private String companyGuId;

                public CompanyAddressBean getCompanyAddress() {
                    return companyAddress;
                }

                public void setCompanyAddress(CompanyAddressBean companyAddress) {
                    this.companyAddress = companyAddress;
                }

                public String getCompanyName() {
                    return companyName;
                }

                public void setCompanyName(String companyName) {
                    this.companyName = companyName;
                }

                public int getResumeStatus() {
                    return resumeStatus;
                }

                public void setResumeStatus(int resumeStatus) {
                    this.resumeStatus = resumeStatus;
                }

                public String getPosition() {
                    return position;
                }

                public void setPosition(String position) {
                    this.position = position;
                }

                public long getResumeEndBeginDate() {
                    return resumeEndBeginDate;
                }

                public void setResumeEndBeginDate(long resumeEndBeginDate) {
                    this.resumeEndBeginDate = resumeEndBeginDate;
                }

                public String getResumeStatusText() {
                    return resumeStatusText;
                }

                public void setResumeStatusText(String resumeStatusText) {
                    this.resumeStatusText = resumeStatusText;
                }

                public String getResumeStatusRemark() {
                    return resumeStatusRemark;
                }

                public void setResumeStatusRemark(String resumeStatusRemark) {
                    this.resumeStatusRemark = resumeStatusRemark;
                }

                public long getResumeBeginDate() {
                    return resumeBeginDate;
                }

                public void setResumeBeginDate(long resumeBeginDate) {
                    this.resumeBeginDate = resumeBeginDate;
                }

                public CompanyPhoneBean getCompanyPhone() {
                    return companyPhone;
                }

                public void setCompanyPhone(CompanyPhoneBean companyPhone) {
                    this.companyPhone = companyPhone;
                }

                public String getCompanyGuId() {
                    return companyGuId;
                }

                public void setCompanyGuId(String companyGuId) {
                    this.companyGuId = companyGuId;
                }

                public static class CompanyAddressBean {
                    /**
                     * addressStatusRemark : 有效
                     * address2 :
                     * addressTypeText : 公司地址
                     * country : 中国
                     * addressStatusText : 有效
                     * city :
                     * address1 :
                     * postCode :
                     * addressType : 3
                     * province :
                     * addressStatus : 1
                     * createDate : 1561953481246
                     * creator : cs024
                     */

                    private String addressStatusRemark;
                    private String address2;
                    private String addressTypeText;
                    private String country;
                    private String addressStatusText;
                    private String city;
                    private String address1;
                    private String postCode;
                    private int addressType;
                    private String province;
                    private int addressStatus;
                    private long createDate;
                    private String creator;

                    public String getAddressStatusRemark() {
                        return addressStatusRemark;
                    }

                    public void setAddressStatusRemark(String addressStatusRemark) {
                        this.addressStatusRemark = addressStatusRemark;
                    }

                    public String getAddress2() {
                        return address2;
                    }

                    public void setAddress2(String address2) {
                        this.address2 = address2;
                    }

                    public String getAddressTypeText() {
                        return addressTypeText;
                    }

                    public void setAddressTypeText(String addressTypeText) {
                        this.addressTypeText = addressTypeText;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getAddressStatusText() {
                        return addressStatusText;
                    }

                    public void setAddressStatusText(String addressStatusText) {
                        this.addressStatusText = addressStatusText;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getAddress1() {
                        return address1;
                    }

                    public void setAddress1(String address1) {
                        this.address1 = address1;
                    }

                    public String getPostCode() {
                        return postCode;
                    }

                    public void setPostCode(String postCode) {
                        this.postCode = postCode;
                    }

                    public int getAddressType() {
                        return addressType;
                    }

                    public void setAddressType(int addressType) {
                        this.addressType = addressType;
                    }

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public int getAddressStatus() {
                        return addressStatus;
                    }

                    public void setAddressStatus(int addressStatus) {
                        this.addressStatus = addressStatus;
                    }

                    public long getCreateDate() {
                        return createDate;
                    }

                    public void setCreateDate(long createDate) {
                        this.createDate = createDate;
                    }

                    public String getCreator() {
                        return creator;
                    }

                    public void setCreator(String creator) {
                        this.creator = creator;
                    }
                }

                public static class CompanyPhoneBean {
                    /**
                     * phoneNumberExt :
                     * phoneAddress : {"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"ecb0ea0b-824e-4350-ae6f-944bdebc1ea1","createDate":1561953481246,"creator":"cs024"}
                     * phoneNumber :
                     * phoneStatusTypeItem : null
                     */

                    private String phoneNumberExt;
                    private PhoneAddressBean phoneAddress;
                    private String phoneNumber;
                    private Object phoneStatusTypeItem;

                    public String getPhoneNumberExt() {
                        return phoneNumberExt;
                    }

                    public void setPhoneNumberExt(String phoneNumberExt) {
                        this.phoneNumberExt = phoneNumberExt;
                    }

                    public PhoneAddressBean getPhoneAddress() {
                        return phoneAddress;
                    }

                    public void setPhoneAddress(PhoneAddressBean phoneAddress) {
                        this.phoneAddress = phoneAddress;
                    }

                    public String getPhoneNumber() {
                        return phoneNumber;
                    }

                    public void setPhoneNumber(String phoneNumber) {
                        this.phoneNumber = phoneNumber;
                    }

                    public Object getPhoneStatusTypeItem() {
                        return phoneStatusTypeItem;
                    }

                    public void setPhoneStatusTypeItem(Object phoneStatusTypeItem) {
                        this.phoneStatusTypeItem = phoneStatusTypeItem;
                    }

                    public static class PhoneAddressBean {
                        /**
                         * addressStatusRemark : 有效
                         * address2 :
                         * addressTypeText : 公司地址
                         * country : 中国
                         * addressStatusText : 有效
                         * city :
                         * address1 :
                         * postCode :
                         * addressType : 3
                         * province :
                         * addressStatus : 1
                         * addressGuId : ecb0ea0b-824e-4350-ae6f-944bdebc1ea1
                         * createDate : 1561953481246
                         * creator : cs024
                         */

                        private String addressStatusRemark;
                        private String address2;
                        private String addressTypeText;
                        private String country;
                        private String addressStatusText;
                        private String city;
                        private String address1;
                        private String postCode;
                        private int addressType;
                        private String province;
                        private int addressStatus;
                        private String addressGuId;
                        private long createDate;
                        private String creator;

                        public String getAddressStatusRemark() {
                            return addressStatusRemark;
                        }

                        public void setAddressStatusRemark(String addressStatusRemark) {
                            this.addressStatusRemark = addressStatusRemark;
                        }

                        public String getAddress2() {
                            return address2;
                        }

                        public void setAddress2(String address2) {
                            this.address2 = address2;
                        }

                        public String getAddressTypeText() {
                            return addressTypeText;
                        }

                        public void setAddressTypeText(String addressTypeText) {
                            this.addressTypeText = addressTypeText;
                        }

                        public String getCountry() {
                            return country;
                        }

                        public void setCountry(String country) {
                            this.country = country;
                        }

                        public String getAddressStatusText() {
                            return addressStatusText;
                        }

                        public void setAddressStatusText(String addressStatusText) {
                            this.addressStatusText = addressStatusText;
                        }

                        public String getCity() {
                            return city;
                        }

                        public void setCity(String city) {
                            this.city = city;
                        }

                        public String getAddress1() {
                            return address1;
                        }

                        public void setAddress1(String address1) {
                            this.address1 = address1;
                        }

                        public String getPostCode() {
                            return postCode;
                        }

                        public void setPostCode(String postCode) {
                            this.postCode = postCode;
                        }

                        public int getAddressType() {
                            return addressType;
                        }

                        public void setAddressType(int addressType) {
                            this.addressType = addressType;
                        }

                        public String getProvince() {
                            return province;
                        }

                        public void setProvince(String province) {
                            this.province = province;
                        }

                        public int getAddressStatus() {
                            return addressStatus;
                        }

                        public void setAddressStatus(int addressStatus) {
                            this.addressStatus = addressStatus;
                        }

                        public String getAddressGuId() {
                            return addressGuId;
                        }

                        public void setAddressGuId(String addressGuId) {
                            this.addressGuId = addressGuId;
                        }

                        public long getCreateDate() {
                            return createDate;
                        }

                        public void setCreateDate(long createDate) {
                            this.createDate = createDate;
                        }

                        public String getCreator() {
                            return creator;
                        }

                        public void setCreator(String creator) {
                            this.creator = creator;
                        }
                    }
                }
            }

            public static class PhoneItemsBean {
                /**
                 * phoneNumberExt : 02968775126
                 * phoneAddress : {"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":999,"province":"","addressStatus":1,"addressGuId":"dd22d7e8-edd4-4db6-82e4-44b5c4a8f2cf","createDate":1561953481246,"creator":"cs024"}
                 * phoneNumber : 18681947299
                 * phoneStatusTypeItem : {"phoneOwnerType":10,"phoneType":999,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"其他","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}
                 * phoneGuId : 329533c4-3cab-409d-b598-defdee4a57a3
                 * isDel : false
                 * callCount : 0
                 * remark :
                 * creator : cs024
                 * creatDate : 1561953481246
                 * lastFollowDate : 0
                 * sameDayCounts : 0
                 */

                private String phoneNumberExt;
                private PhoneAddressBeanX phoneAddress;
                private String phoneNumber;
                private PhoneStatusTypeItemBean phoneStatusTypeItem;
                private String phoneGuId;
                private boolean isDel;
                private int callCount;
                private String remark;
                private String creator;
                private long creatDate;
                private long lastFollowDate;
                private int sameDayCounts;

                public String getPhoneNumberExt() {
                    return phoneNumberExt;
                }

                public void setPhoneNumberExt(String phoneNumberExt) {
                    this.phoneNumberExt = phoneNumberExt;
                }

                public PhoneAddressBeanX getPhoneAddress() {
                    return phoneAddress;
                }

                public void setPhoneAddress(PhoneAddressBeanX phoneAddress) {
                    this.phoneAddress = phoneAddress;
                }

                public String getPhoneNumber() {
                    return phoneNumber;
                }

                public void setPhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }

                public PhoneStatusTypeItemBean getPhoneStatusTypeItem() {
                    return phoneStatusTypeItem;
                }

                public void setPhoneStatusTypeItem(PhoneStatusTypeItemBean phoneStatusTypeItem) {
                    this.phoneStatusTypeItem = phoneStatusTypeItem;
                }

                public String getPhoneGuId() {
                    return phoneGuId;
                }

                public void setPhoneGuId(String phoneGuId) {
                    this.phoneGuId = phoneGuId;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public int getCallCount() {
                    return callCount;
                }

                public void setCallCount(int callCount) {
                    this.callCount = callCount;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreatDate() {
                    return creatDate;
                }

                public void setCreatDate(long creatDate) {
                    this.creatDate = creatDate;
                }

                public long getLastFollowDate() {
                    return lastFollowDate;
                }

                public void setLastFollowDate(long lastFollowDate) {
                    this.lastFollowDate = lastFollowDate;
                }

                public int getSameDayCounts() {
                    return sameDayCounts;
                }

                public void setSameDayCounts(int sameDayCounts) {
                    this.sameDayCounts = sameDayCounts;
                }

                public static class PhoneAddressBeanX {
                    /**
                     * addressStatusRemark : 有效
                     * address2 :
                     * addressTypeText : 其他
                     * country : 中国
                     * addressStatusText : 有效
                     * city :
                     * address1 :
                     * postCode :
                     * addressType : 999
                     * province :
                     * addressStatus : 1
                     * addressGuId : dd22d7e8-edd4-4db6-82e4-44b5c4a8f2cf
                     * createDate : 1561953481246
                     * creator : cs024
                     */

                    private String addressStatusRemark;
                    private String address2;
                    private String addressTypeText;
                    private String country;
                    private String addressStatusText;
                    private String city;
                    private String address1;
                    private String postCode;
                    private int addressType;
                    private String province;
                    private int addressStatus;
                    private String addressGuId;
                    private long createDate;
                    private String creator;

                    public String getAddressStatusRemark() {
                        return addressStatusRemark;
                    }

                    public void setAddressStatusRemark(String addressStatusRemark) {
                        this.addressStatusRemark = addressStatusRemark;
                    }

                    public String getAddress2() {
                        return address2;
                    }

                    public void setAddress2(String address2) {
                        this.address2 = address2;
                    }

                    public String getAddressTypeText() {
                        return addressTypeText;
                    }

                    public void setAddressTypeText(String addressTypeText) {
                        this.addressTypeText = addressTypeText;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getAddressStatusText() {
                        return addressStatusText;
                    }

                    public void setAddressStatusText(String addressStatusText) {
                        this.addressStatusText = addressStatusText;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getAddress1() {
                        return address1;
                    }

                    public void setAddress1(String address1) {
                        this.address1 = address1;
                    }

                    public String getPostCode() {
                        return postCode;
                    }

                    public void setPostCode(String postCode) {
                        this.postCode = postCode;
                    }

                    public int getAddressType() {
                        return addressType;
                    }

                    public void setAddressType(int addressType) {
                        this.addressType = addressType;
                    }

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public int getAddressStatus() {
                        return addressStatus;
                    }

                    public void setAddressStatus(int addressStatus) {
                        this.addressStatus = addressStatus;
                    }

                    public String getAddressGuId() {
                        return addressGuId;
                    }

                    public void setAddressGuId(String addressGuId) {
                        this.addressGuId = addressGuId;
                    }

                    public long getCreateDate() {
                        return createDate;
                    }

                    public void setCreateDate(long createDate) {
                        this.createDate = createDate;
                    }

                    public String getCreator() {
                        return creator;
                    }

                    public void setCreator(String creator) {
                        this.creator = creator;
                    }
                }

                public static class PhoneStatusTypeItemBean {
                    /**
                     * phoneOwnerType : 10
                     * phoneType : 999
                     * phoneNumberTypeText : 移动
                     * phoneOwnerTypeText : 本人
                     * phoneTypeText : 其他
                     * connectSummaryStatusText : 无
                     * phoneNumberType : 20
                     * connectSummaryStatus : 0
                     * phoneStatus : 0
                     * phoneStatusText : 未知电话
                     */

                    private int phoneOwnerType;
                    private int phoneType;
                    private String phoneNumberTypeText;
                    private String phoneOwnerTypeText;
                    private String phoneTypeText;
                    private String connectSummaryStatusText;
                    private int phoneNumberType;
                    private int connectSummaryStatus;
                    private int phoneStatus;
                    private String phoneStatusText;

                    public int getPhoneOwnerType() {
                        return phoneOwnerType;
                    }

                    public void setPhoneOwnerType(int phoneOwnerType) {
                        this.phoneOwnerType = phoneOwnerType;
                    }

                    public int getPhoneType() {
                        return phoneType;
                    }

                    public void setPhoneType(int phoneType) {
                        this.phoneType = phoneType;
                    }

                    public String getPhoneNumberTypeText() {
                        return phoneNumberTypeText;
                    }

                    public void setPhoneNumberTypeText(String phoneNumberTypeText) {
                        this.phoneNumberTypeText = phoneNumberTypeText;
                    }

                    public String getPhoneOwnerTypeText() {
                        return phoneOwnerTypeText;
                    }

                    public void setPhoneOwnerTypeText(String phoneOwnerTypeText) {
                        this.phoneOwnerTypeText = phoneOwnerTypeText;
                    }

                    public String getPhoneTypeText() {
                        return phoneTypeText;
                    }

                    public void setPhoneTypeText(String phoneTypeText) {
                        this.phoneTypeText = phoneTypeText;
                    }

                    public String getConnectSummaryStatusText() {
                        return connectSummaryStatusText;
                    }

                    public void setConnectSummaryStatusText(String connectSummaryStatusText) {
                        this.connectSummaryStatusText = connectSummaryStatusText;
                    }

                    public int getPhoneNumberType() {
                        return phoneNumberType;
                    }

                    public void setPhoneNumberType(int phoneNumberType) {
                        this.phoneNumberType = phoneNumberType;
                    }

                    public int getConnectSummaryStatus() {
                        return connectSummaryStatus;
                    }

                    public void setConnectSummaryStatus(int connectSummaryStatus) {
                        this.connectSummaryStatus = connectSummaryStatus;
                    }

                    public int getPhoneStatus() {
                        return phoneStatus;
                    }

                    public void setPhoneStatus(int phoneStatus) {
                        this.phoneStatus = phoneStatus;
                    }

                    public String getPhoneStatusText() {
                        return phoneStatusText;
                    }

                    public void setPhoneStatusText(String phoneStatusText) {
                        this.phoneStatusText = phoneStatusText;
                    }
                }
            }
        }

        public static class DebtorItemsBean {
            /**
             * debtorNo :
             * iM :
             * cidTypeText : 其他
             * gender : 999
             * name : 朱姣姣
             * cidType : 999
             * emailItems : null
             * companyItems : [{"companyAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"},"companyName":"西安市唐朝商贸有限公司","resumeStatus":10,"position":"","resumeEndBeginDate":1561953481246,"resumeStatusText":"在职","resumeStatusRemark":"在职","resumeBeginDate":1561953481246,"companyPhone":{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"c194ce48-601e-4cf7-9f7e-82d7fd448ce5","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":{"phoneOwnerType":20,"phoneType":30,"phoneNumberTypeText":"固话","phoneOwnerTypeText":"非本人","phoneTypeText":"单位","connectSummaryStatusText":"无","phoneNumberType":10,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}},"companyGuId":"93fcabe5-2a31-469c-a6b4-2721efbac2d4"}]
             * socialNo :
             * phoneItems : [{"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"全省","address1":"","postCode":"","addressType":999,"province":"全国","addressStatus":1,"addressGuId":"af0e6d02-d3dc-4704-8a89-d881ec6533e0","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"18681947299","phoneStatusTypeItem":{"phoneOwnerType":10,"phoneType":10,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"手机","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"},"phoneGuId":"0b196d0a-4dd7-4236-ad08-aa724c1708f8","isDel":false,"callCount":0,"remark":"","creator":"cs024","creatDate":1561953481246,"lastFollowDate":0,"sameDayCounts":0}]
             * genderText : 其他
             * addressItems : [{"addressStatusRemark":null,"address2":"户籍地址测试2","addressTypeText":"户籍地址","country":null,"addressStatusText":"有效","city":null,"address1":"户籍地址测试2","postCode":"7878","addressType":0,"province":null,"addressStatus":1,"addressGuId":"3d619528-c29c-427a-965f-fa4c5de7db9c","creator":"szadmin","createDate":1563956613057,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"公司地址2","addressTypeText":"公司地址","country":null,"addressStatusText":"有效","city":null,"address1":"公司地址1","postCode":"7878","addressType":3,"province":null,"addressStatus":1,"addressGuId":"c8639cc3-773b-41c4-96ec-aad2c07456db","creator":"szadmin","createDate":1563957188846,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}]
             * personStatusItem : {"endBeginDate":1561953481246,"personStatus":10,"personStatusRemark":"正常","personStatusText":"正常","personStatusTime":1561953481246,"beginDate":1561953481246}
             * age : 0
             * cidNo : 432522197109076981
             * unconnectDays : 0
             * lastValidFollowDate : 0
             * lastFollowDate : 0
             * cidNoExt : null
             * im :
             */

            private String debtorNo;
            private String iM;
            private String cidTypeText;
            private int gender;
            private String name;
            private int cidType;
            private Object emailItems;
            private String socialNo;
            private String genderText;
            private PersonStatusItemBeanX personStatusItem;
            private int age;
            private String cidNo;
            private int unconnectDays;
            private long lastValidFollowDate;
            private long lastFollowDate;
            private Object cidNoExt;
            private String im;
            private List<CompanyItemsBeanX> companyItems;
            private List<PhoneItemsBeanX> phoneItems;
            private List<AddressItemsBean> addressItems;

            public String getDebtorNo() {
                return debtorNo;
            }

            public void setDebtorNo(String debtorNo) {
                this.debtorNo = debtorNo;
            }

            public String getIM() {
                return iM;
            }

            public void setIM(String iM) {
                this.iM = iM;
            }

            public String getCidTypeText() {
                return cidTypeText;
            }

            public void setCidTypeText(String cidTypeText) {
                this.cidTypeText = cidTypeText;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCidType() {
                return cidType;
            }

            public void setCidType(int cidType) {
                this.cidType = cidType;
            }

            public Object getEmailItems() {
                return emailItems;
            }

            public void setEmailItems(Object emailItems) {
                this.emailItems = emailItems;
            }

            public String getSocialNo() {
                return socialNo;
            }

            public void setSocialNo(String socialNo) {
                this.socialNo = socialNo;
            }

            public String getGenderText() {
                return genderText;
            }

            public void setGenderText(String genderText) {
                this.genderText = genderText;
            }

            public PersonStatusItemBeanX getPersonStatusItem() {
                return personStatusItem;
            }

            public void setPersonStatusItem(PersonStatusItemBeanX personStatusItem) {
                this.personStatusItem = personStatusItem;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getCidNo() {
                return cidNo;
            }

            public void setCidNo(String cidNo) {
                this.cidNo = cidNo;
            }

            public int getUnconnectDays() {
                return unconnectDays;
            }

            public void setUnconnectDays(int unconnectDays) {
                this.unconnectDays = unconnectDays;
            }

            public long getLastValidFollowDate() {
                return lastValidFollowDate;
            }

            public void setLastValidFollowDate(long lastValidFollowDate) {
                this.lastValidFollowDate = lastValidFollowDate;
            }

            public long getLastFollowDate() {
                return lastFollowDate;
            }

            public void setLastFollowDate(long lastFollowDate) {
                this.lastFollowDate = lastFollowDate;
            }

            public Object getCidNoExt() {
                return cidNoExt;
            }

            public void setCidNoExt(Object cidNoExt) {
                this.cidNoExt = cidNoExt;
            }

            public String getIm() {
                return im;
            }

            public void setIm(String im) {
                this.im = im;
            }

            public List<CompanyItemsBeanX> getCompanyItems() {
                return companyItems;
            }

            public void setCompanyItems(List<CompanyItemsBeanX> companyItems) {
                this.companyItems = companyItems;
            }

            public List<PhoneItemsBeanX> getPhoneItems() {
                return phoneItems;
            }

            public void setPhoneItems(List<PhoneItemsBeanX> phoneItems) {
                this.phoneItems = phoneItems;
            }

            public List<AddressItemsBean> getAddressItems() {
                return addressItems;
            }

            public void setAddressItems(List<AddressItemsBean> addressItems) {
                this.addressItems = addressItems;
            }

            public static class PersonStatusItemBeanX {
                /**
                 * endBeginDate : 1561953481246
                 * personStatus : 10
                 * personStatusRemark : 正常
                 * personStatusText : 正常
                 * personStatusTime : 1561953481246
                 * beginDate : 1561953481246
                 */

                private long endBeginDate;
                private int personStatus;
                private String personStatusRemark;
                private String personStatusText;
                private long personStatusTime;
                private long beginDate;

                public long getEndBeginDate() {
                    return endBeginDate;
                }

                public void setEndBeginDate(long endBeginDate) {
                    this.endBeginDate = endBeginDate;
                }

                public int getPersonStatus() {
                    return personStatus;
                }

                public void setPersonStatus(int personStatus) {
                    this.personStatus = personStatus;
                }

                public String getPersonStatusRemark() {
                    return personStatusRemark;
                }

                public void setPersonStatusRemark(String personStatusRemark) {
                    this.personStatusRemark = personStatusRemark;
                }

                public String getPersonStatusText() {
                    return personStatusText;
                }

                public void setPersonStatusText(String personStatusText) {
                    this.personStatusText = personStatusText;
                }

                public long getPersonStatusTime() {
                    return personStatusTime;
                }

                public void setPersonStatusTime(long personStatusTime) {
                    this.personStatusTime = personStatusTime;
                }

                public long getBeginDate() {
                    return beginDate;
                }

                public void setBeginDate(long beginDate) {
                    this.beginDate = beginDate;
                }
            }

            public static class CompanyItemsBeanX {
                /**
                 * companyAddress : {"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"createDate":1561953481246,"creator":"cs024"}
                 * companyName : 西安市唐朝商贸有限公司
                 * resumeStatus : 10
                 * position :
                 * resumeEndBeginDate : 1561953481246
                 * resumeStatusText : 在职
                 * resumeStatusRemark : 在职
                 * resumeBeginDate : 1561953481246
                 * companyPhone : {"phoneNumberExt":"","phoneAddress":{"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"c194ce48-601e-4cf7-9f7e-82d7fd448ce5","createDate":1561953481246,"creator":"cs024"},"phoneNumber":"","phoneStatusTypeItem":{"phoneOwnerType":20,"phoneType":30,"phoneNumberTypeText":"固话","phoneOwnerTypeText":"非本人","phoneTypeText":"单位","connectSummaryStatusText":"无","phoneNumberType":10,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}}
                 * companyGuId : 93fcabe5-2a31-469c-a6b4-2721efbac2d4
                 */

                private CompanyAddressBeanX companyAddress;
                private String companyName;
                private int resumeStatus;
                private String position;
                private long resumeEndBeginDate;
                private String resumeStatusText;
                private String resumeStatusRemark;
                private long resumeBeginDate;
                private CompanyPhoneBeanX companyPhone;
                private String companyGuId;

                public CompanyAddressBeanX getCompanyAddress() {
                    return companyAddress;
                }

                public void setCompanyAddress(CompanyAddressBeanX companyAddress) {
                    this.companyAddress = companyAddress;
                }

                public String getCompanyName() {
                    return companyName;
                }

                public void setCompanyName(String companyName) {
                    this.companyName = companyName;
                }

                public int getResumeStatus() {
                    return resumeStatus;
                }

                public void setResumeStatus(int resumeStatus) {
                    this.resumeStatus = resumeStatus;
                }

                public String getPosition() {
                    return position;
                }

                public void setPosition(String position) {
                    this.position = position;
                }

                public long getResumeEndBeginDate() {
                    return resumeEndBeginDate;
                }

                public void setResumeEndBeginDate(long resumeEndBeginDate) {
                    this.resumeEndBeginDate = resumeEndBeginDate;
                }

                public String getResumeStatusText() {
                    return resumeStatusText;
                }

                public void setResumeStatusText(String resumeStatusText) {
                    this.resumeStatusText = resumeStatusText;
                }

                public String getResumeStatusRemark() {
                    return resumeStatusRemark;
                }

                public void setResumeStatusRemark(String resumeStatusRemark) {
                    this.resumeStatusRemark = resumeStatusRemark;
                }

                public long getResumeBeginDate() {
                    return resumeBeginDate;
                }

                public void setResumeBeginDate(long resumeBeginDate) {
                    this.resumeBeginDate = resumeBeginDate;
                }

                public CompanyPhoneBeanX getCompanyPhone() {
                    return companyPhone;
                }

                public void setCompanyPhone(CompanyPhoneBeanX companyPhone) {
                    this.companyPhone = companyPhone;
                }

                public String getCompanyGuId() {
                    return companyGuId;
                }

                public void setCompanyGuId(String companyGuId) {
                    this.companyGuId = companyGuId;
                }

                public static class CompanyAddressBeanX {
                    /**
                     * addressStatusRemark : 有效
                     * address2 :
                     * addressTypeText : 公司地址
                     * country : 中国
                     * addressStatusText : 有效
                     * city :
                     * address1 :
                     * postCode :
                     * addressType : 3
                     * province :
                     * addressStatus : 1
                     * createDate : 1561953481246
                     * creator : cs024
                     */

                    private String addressStatusRemark;
                    private String address2;
                    private String addressTypeText;
                    private String country;
                    private String addressStatusText;
                    private String city;
                    private String address1;
                    private String postCode;
                    private int addressType;
                    private String province;
                    private int addressStatus;
                    private long createDate;
                    private String creator;

                    public String getAddressStatusRemark() {
                        return addressStatusRemark;
                    }

                    public void setAddressStatusRemark(String addressStatusRemark) {
                        this.addressStatusRemark = addressStatusRemark;
                    }

                    public String getAddress2() {
                        return address2;
                    }

                    public void setAddress2(String address2) {
                        this.address2 = address2;
                    }

                    public String getAddressTypeText() {
                        return addressTypeText;
                    }

                    public void setAddressTypeText(String addressTypeText) {
                        this.addressTypeText = addressTypeText;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getAddressStatusText() {
                        return addressStatusText;
                    }

                    public void setAddressStatusText(String addressStatusText) {
                        this.addressStatusText = addressStatusText;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getAddress1() {
                        return address1;
                    }

                    public void setAddress1(String address1) {
                        this.address1 = address1;
                    }

                    public String getPostCode() {
                        return postCode;
                    }

                    public void setPostCode(String postCode) {
                        this.postCode = postCode;
                    }

                    public int getAddressType() {
                        return addressType;
                    }

                    public void setAddressType(int addressType) {
                        this.addressType = addressType;
                    }

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public int getAddressStatus() {
                        return addressStatus;
                    }

                    public void setAddressStatus(int addressStatus) {
                        this.addressStatus = addressStatus;
                    }

                    public long getCreateDate() {
                        return createDate;
                    }

                    public void setCreateDate(long createDate) {
                        this.createDate = createDate;
                    }

                    public String getCreator() {
                        return creator;
                    }

                    public void setCreator(String creator) {
                        this.creator = creator;
                    }
                }

                public static class CompanyPhoneBeanX {
                    /**
                     * phoneNumberExt :
                     * phoneAddress : {"addressStatusRemark":"有效","address2":"","addressTypeText":"公司地址","country":"中国","addressStatusText":"有效","city":"","address1":"","postCode":"","addressType":3,"province":"","addressStatus":1,"addressGuId":"c194ce48-601e-4cf7-9f7e-82d7fd448ce5","createDate":1561953481246,"creator":"cs024"}
                     * phoneNumber :
                     * phoneStatusTypeItem : {"phoneOwnerType":20,"phoneType":30,"phoneNumberTypeText":"固话","phoneOwnerTypeText":"非本人","phoneTypeText":"单位","connectSummaryStatusText":"无","phoneNumberType":10,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}
                     */

                    private String phoneNumberExt;
                    private PhoneAddressBeanXX phoneAddress;
                    private String phoneNumber;
                    private PhoneStatusTypeItemBeanX phoneStatusTypeItem;

                    public String getPhoneNumberExt() {
                        return phoneNumberExt;
                    }

                    public void setPhoneNumberExt(String phoneNumberExt) {
                        this.phoneNumberExt = phoneNumberExt;
                    }

                    public PhoneAddressBeanXX getPhoneAddress() {
                        return phoneAddress;
                    }

                    public void setPhoneAddress(PhoneAddressBeanXX phoneAddress) {
                        this.phoneAddress = phoneAddress;
                    }

                    public String getPhoneNumber() {
                        return phoneNumber;
                    }

                    public void setPhoneNumber(String phoneNumber) {
                        this.phoneNumber = phoneNumber;
                    }

                    public PhoneStatusTypeItemBeanX getPhoneStatusTypeItem() {
                        return phoneStatusTypeItem;
                    }

                    public void setPhoneStatusTypeItem(PhoneStatusTypeItemBeanX phoneStatusTypeItem) {
                        this.phoneStatusTypeItem = phoneStatusTypeItem;
                    }

                    public static class PhoneAddressBeanXX {
                        /**
                         * addressStatusRemark : 有效
                         * address2 :
                         * addressTypeText : 公司地址
                         * country : 中国
                         * addressStatusText : 有效
                         * city :
                         * address1 :
                         * postCode :
                         * addressType : 3
                         * province :
                         * addressStatus : 1
                         * addressGuId : c194ce48-601e-4cf7-9f7e-82d7fd448ce5
                         * createDate : 1561953481246
                         * creator : cs024
                         */

                        private String addressStatusRemark;
                        private String address2;
                        private String addressTypeText;
                        private String country;
                        private String addressStatusText;
                        private String city;
                        private String address1;
                        private String postCode;
                        private int addressType;
                        private String province;
                        private int addressStatus;
                        private String addressGuId;
                        private long createDate;
                        private String creator;

                        public String getAddressStatusRemark() {
                            return addressStatusRemark;
                        }

                        public void setAddressStatusRemark(String addressStatusRemark) {
                            this.addressStatusRemark = addressStatusRemark;
                        }

                        public String getAddress2() {
                            return address2;
                        }

                        public void setAddress2(String address2) {
                            this.address2 = address2;
                        }

                        public String getAddressTypeText() {
                            return addressTypeText;
                        }

                        public void setAddressTypeText(String addressTypeText) {
                            this.addressTypeText = addressTypeText;
                        }

                        public String getCountry() {
                            return country;
                        }

                        public void setCountry(String country) {
                            this.country = country;
                        }

                        public String getAddressStatusText() {
                            return addressStatusText;
                        }

                        public void setAddressStatusText(String addressStatusText) {
                            this.addressStatusText = addressStatusText;
                        }

                        public String getCity() {
                            return city;
                        }

                        public void setCity(String city) {
                            this.city = city;
                        }

                        public String getAddress1() {
                            return address1;
                        }

                        public void setAddress1(String address1) {
                            this.address1 = address1;
                        }

                        public String getPostCode() {
                            return postCode;
                        }

                        public void setPostCode(String postCode) {
                            this.postCode = postCode;
                        }

                        public int getAddressType() {
                            return addressType;
                        }

                        public void setAddressType(int addressType) {
                            this.addressType = addressType;
                        }

                        public String getProvince() {
                            return province;
                        }

                        public void setProvince(String province) {
                            this.province = province;
                        }

                        public int getAddressStatus() {
                            return addressStatus;
                        }

                        public void setAddressStatus(int addressStatus) {
                            this.addressStatus = addressStatus;
                        }

                        public String getAddressGuId() {
                            return addressGuId;
                        }

                        public void setAddressGuId(String addressGuId) {
                            this.addressGuId = addressGuId;
                        }

                        public long getCreateDate() {
                            return createDate;
                        }

                        public void setCreateDate(long createDate) {
                            this.createDate = createDate;
                        }

                        public String getCreator() {
                            return creator;
                        }

                        public void setCreator(String creator) {
                            this.creator = creator;
                        }
                    }

                    public static class PhoneStatusTypeItemBeanX {
                        /**
                         * phoneOwnerType : 20
                         * phoneType : 30
                         * phoneNumberTypeText : 固话
                         * phoneOwnerTypeText : 非本人
                         * phoneTypeText : 单位
                         * connectSummaryStatusText : 无
                         * phoneNumberType : 10
                         * connectSummaryStatus : 0
                         * phoneStatus : 0
                         * phoneStatusText : 未知电话
                         */

                        private int phoneOwnerType;
                        private int phoneType;
                        private String phoneNumberTypeText;
                        private String phoneOwnerTypeText;
                        private String phoneTypeText;
                        private String connectSummaryStatusText;
                        private int phoneNumberType;
                        private int connectSummaryStatus;
                        private int phoneStatus;
                        private String phoneStatusText;

                        public int getPhoneOwnerType() {
                            return phoneOwnerType;
                        }

                        public void setPhoneOwnerType(int phoneOwnerType) {
                            this.phoneOwnerType = phoneOwnerType;
                        }

                        public int getPhoneType() {
                            return phoneType;
                        }

                        public void setPhoneType(int phoneType) {
                            this.phoneType = phoneType;
                        }

                        public String getPhoneNumberTypeText() {
                            return phoneNumberTypeText;
                        }

                        public void setPhoneNumberTypeText(String phoneNumberTypeText) {
                            this.phoneNumberTypeText = phoneNumberTypeText;
                        }

                        public String getPhoneOwnerTypeText() {
                            return phoneOwnerTypeText;
                        }

                        public void setPhoneOwnerTypeText(String phoneOwnerTypeText) {
                            this.phoneOwnerTypeText = phoneOwnerTypeText;
                        }

                        public String getPhoneTypeText() {
                            return phoneTypeText;
                        }

                        public void setPhoneTypeText(String phoneTypeText) {
                            this.phoneTypeText = phoneTypeText;
                        }

                        public String getConnectSummaryStatusText() {
                            return connectSummaryStatusText;
                        }

                        public void setConnectSummaryStatusText(String connectSummaryStatusText) {
                            this.connectSummaryStatusText = connectSummaryStatusText;
                        }

                        public int getPhoneNumberType() {
                            return phoneNumberType;
                        }

                        public void setPhoneNumberType(int phoneNumberType) {
                            this.phoneNumberType = phoneNumberType;
                        }

                        public int getConnectSummaryStatus() {
                            return connectSummaryStatus;
                        }

                        public void setConnectSummaryStatus(int connectSummaryStatus) {
                            this.connectSummaryStatus = connectSummaryStatus;
                        }

                        public int getPhoneStatus() {
                            return phoneStatus;
                        }

                        public void setPhoneStatus(int phoneStatus) {
                            this.phoneStatus = phoneStatus;
                        }

                        public String getPhoneStatusText() {
                            return phoneStatusText;
                        }

                        public void setPhoneStatusText(String phoneStatusText) {
                            this.phoneStatusText = phoneStatusText;
                        }
                    }
                }
            }

            public static class PhoneItemsBeanX {
                /**
                 * phoneNumberExt :
                 * phoneAddress : {"addressStatusRemark":"有效","address2":"","addressTypeText":"其他","country":"中国","addressStatusText":"有效","city":"全省","address1":"","postCode":"","addressType":999,"province":"全国","addressStatus":1,"addressGuId":"af0e6d02-d3dc-4704-8a89-d881ec6533e0","createDate":1561953481246,"creator":"cs024"}
                 * phoneNumber : 18681947299
                 * phoneStatusTypeItem : {"phoneOwnerType":10,"phoneType":10,"phoneNumberTypeText":"移动","phoneOwnerTypeText":"本人","phoneTypeText":"手机","connectSummaryStatusText":"无","phoneNumberType":20,"connectSummaryStatus":0,"phoneStatus":0,"phoneStatusText":"未知电话"}
                 * phoneGuId : 0b196d0a-4dd7-4236-ad08-aa724c1708f8
                 * isDel : false
                 * callCount : 0
                 * remark :
                 * creator : cs024
                 * creatDate : 1561953481246
                 * lastFollowDate : 0
                 * sameDayCounts : 0
                 */

                private String phoneNumberExt;
                private PhoneAddressBeanXXX phoneAddress;
                private String phoneNumber;
                private PhoneStatusTypeItemBeanXX phoneStatusTypeItem;
                private String phoneGuId;
                private boolean isDel;
                private int callCount;
                private String remark;
                private String creator;
                private long creatDate;
                private long lastFollowDate;
                private int sameDayCounts;

                public String getPhoneNumberExt() {
                    return phoneNumberExt;
                }

                public void setPhoneNumberExt(String phoneNumberExt) {
                    this.phoneNumberExt = phoneNumberExt;
                }

                public PhoneAddressBeanXXX getPhoneAddress() {
                    return phoneAddress;
                }

                public void setPhoneAddress(PhoneAddressBeanXXX phoneAddress) {
                    this.phoneAddress = phoneAddress;
                }

                public String getPhoneNumber() {
                    return phoneNumber;
                }

                public void setPhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }

                public PhoneStatusTypeItemBeanXX getPhoneStatusTypeItem() {
                    return phoneStatusTypeItem;
                }

                public void setPhoneStatusTypeItem(PhoneStatusTypeItemBeanXX phoneStatusTypeItem) {
                    this.phoneStatusTypeItem = phoneStatusTypeItem;
                }

                public String getPhoneGuId() {
                    return phoneGuId;
                }

                public void setPhoneGuId(String phoneGuId) {
                    this.phoneGuId = phoneGuId;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public int getCallCount() {
                    return callCount;
                }

                public void setCallCount(int callCount) {
                    this.callCount = callCount;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreatDate() {
                    return creatDate;
                }

                public void setCreatDate(long creatDate) {
                    this.creatDate = creatDate;
                }

                public long getLastFollowDate() {
                    return lastFollowDate;
                }

                public void setLastFollowDate(long lastFollowDate) {
                    this.lastFollowDate = lastFollowDate;
                }

                public int getSameDayCounts() {
                    return sameDayCounts;
                }

                public void setSameDayCounts(int sameDayCounts) {
                    this.sameDayCounts = sameDayCounts;
                }

                public static class PhoneAddressBeanXXX {
                    /**
                     * addressStatusRemark : 有效
                     * address2 :
                     * addressTypeText : 其他
                     * country : 中国
                     * addressStatusText : 有效
                     * city : 全省
                     * address1 :
                     * postCode :
                     * addressType : 999
                     * province : 全国
                     * addressStatus : 1
                     * addressGuId : af0e6d02-d3dc-4704-8a89-d881ec6533e0
                     * createDate : 1561953481246
                     * creator : cs024
                     */

                    private String addressStatusRemark;
                    private String address2;
                    private String addressTypeText;
                    private String country;
                    private String addressStatusText;
                    private String city;
                    private String address1;
                    private String postCode;
                    private int addressType;
                    private String province;
                    private int addressStatus;
                    private String addressGuId;
                    private long createDate;
                    private String creator;

                    public String getAddressStatusRemark() {
                        return addressStatusRemark;
                    }

                    public void setAddressStatusRemark(String addressStatusRemark) {
                        this.addressStatusRemark = addressStatusRemark;
                    }

                    public String getAddress2() {
                        return address2;
                    }

                    public void setAddress2(String address2) {
                        this.address2 = address2;
                    }

                    public String getAddressTypeText() {
                        return addressTypeText;
                    }

                    public void setAddressTypeText(String addressTypeText) {
                        this.addressTypeText = addressTypeText;
                    }

                    public String getCountry() {
                        return country;
                    }

                    public void setCountry(String country) {
                        this.country = country;
                    }

                    public String getAddressStatusText() {
                        return addressStatusText;
                    }

                    public void setAddressStatusText(String addressStatusText) {
                        this.addressStatusText = addressStatusText;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public String getAddress1() {
                        return address1;
                    }

                    public void setAddress1(String address1) {
                        this.address1 = address1;
                    }

                    public String getPostCode() {
                        return postCode;
                    }

                    public void setPostCode(String postCode) {
                        this.postCode = postCode;
                    }

                    public int getAddressType() {
                        return addressType;
                    }

                    public void setAddressType(int addressType) {
                        this.addressType = addressType;
                    }

                    public String getProvince() {
                        return province;
                    }

                    public void setProvince(String province) {
                        this.province = province;
                    }

                    public int getAddressStatus() {
                        return addressStatus;
                    }

                    public void setAddressStatus(int addressStatus) {
                        this.addressStatus = addressStatus;
                    }

                    public String getAddressGuId() {
                        return addressGuId;
                    }

                    public void setAddressGuId(String addressGuId) {
                        this.addressGuId = addressGuId;
                    }

                    public long getCreateDate() {
                        return createDate;
                    }

                    public void setCreateDate(long createDate) {
                        this.createDate = createDate;
                    }

                    public String getCreator() {
                        return creator;
                    }

                    public void setCreator(String creator) {
                        this.creator = creator;
                    }
                }

                public static class PhoneStatusTypeItemBeanXX {
                    /**
                     * phoneOwnerType : 10
                     * phoneType : 10
                     * phoneNumberTypeText : 移动
                     * phoneOwnerTypeText : 本人
                     * phoneTypeText : 手机
                     * connectSummaryStatusText : 无
                     * phoneNumberType : 20
                     * connectSummaryStatus : 0
                     * phoneStatus : 0
                     * phoneStatusText : 未知电话
                     */

                    private int phoneOwnerType;
                    private int phoneType;
                    private String phoneNumberTypeText;
                    private String phoneOwnerTypeText;
                    private String phoneTypeText;
                    private String connectSummaryStatusText;
                    private int phoneNumberType;
                    private int connectSummaryStatus;
                    private int phoneStatus;
                    private String phoneStatusText;

                    public int getPhoneOwnerType() {
                        return phoneOwnerType;
                    }

                    public void setPhoneOwnerType(int phoneOwnerType) {
                        this.phoneOwnerType = phoneOwnerType;
                    }

                    public int getPhoneType() {
                        return phoneType;
                    }

                    public void setPhoneType(int phoneType) {
                        this.phoneType = phoneType;
                    }

                    public String getPhoneNumberTypeText() {
                        return phoneNumberTypeText;
                    }

                    public void setPhoneNumberTypeText(String phoneNumberTypeText) {
                        this.phoneNumberTypeText = phoneNumberTypeText;
                    }

                    public String getPhoneOwnerTypeText() {
                        return phoneOwnerTypeText;
                    }

                    public void setPhoneOwnerTypeText(String phoneOwnerTypeText) {
                        this.phoneOwnerTypeText = phoneOwnerTypeText;
                    }

                    public String getPhoneTypeText() {
                        return phoneTypeText;
                    }

                    public void setPhoneTypeText(String phoneTypeText) {
                        this.phoneTypeText = phoneTypeText;
                    }

                    public String getConnectSummaryStatusText() {
                        return connectSummaryStatusText;
                    }

                    public void setConnectSummaryStatusText(String connectSummaryStatusText) {
                        this.connectSummaryStatusText = connectSummaryStatusText;
                    }

                    public int getPhoneNumberType() {
                        return phoneNumberType;
                    }

                    public void setPhoneNumberType(int phoneNumberType) {
                        this.phoneNumberType = phoneNumberType;
                    }

                    public int getConnectSummaryStatus() {
                        return connectSummaryStatus;
                    }

                    public void setConnectSummaryStatus(int connectSummaryStatus) {
                        this.connectSummaryStatus = connectSummaryStatus;
                    }

                    public int getPhoneStatus() {
                        return phoneStatus;
                    }

                    public void setPhoneStatus(int phoneStatus) {
                        this.phoneStatus = phoneStatus;
                    }

                    public String getPhoneStatusText() {
                        return phoneStatusText;
                    }

                    public void setPhoneStatusText(String phoneStatusText) {
                        this.phoneStatusText = phoneStatusText;
                    }
                }
            }

            public static class AddressItemsBean implements Serializable {
                /**
                 * addressStatusRemark : null
                 * address2 : 户籍地址测试2
                 * addressTypeText : 户籍地址
                 * country : null
                 * addressStatusText : 有效
                 * city : null
                 * address1 : 户籍地址测试2
                 * postCode : 7878
                 * addressType : 0
                 * province : null
                 * addressStatus : 1
                 * addressGuId : 3d619528-c29c-427a-965f-fa4c5de7db9c
                 * creator : szadmin
                 * createDate : 1563956613057
                 * isDel : false
                 * remark : 备注测试数据
                 * isVisited : false
                 * isLetter : false
                 * address1Ext : null
                 * address2Ext : null
                 */

                private Object addressStatusRemark;
                private String address2;
                private String addressTypeText;
                private Object country;
                private String addressStatusText;
                private Object city;
                private String address1;
                private String postCode;
                private int addressType;
                private Object province;
                private int addressStatus;
                private String addressGuId;
                private String creator;
                private long createDate;
                private boolean isDel;
                private String remark;
                private boolean isVisited;
                private boolean isLetter;
                private Object address1Ext;
                private Object address2Ext;

                public Object getAddressStatusRemark() {
                    return addressStatusRemark;
                }

                public void setAddressStatusRemark(Object addressStatusRemark) {
                    this.addressStatusRemark = addressStatusRemark;
                }

                public String getAddress2() {
                    return address2;
                }

                public void setAddress2(String address2) {
                    this.address2 = address2;
                }

                public String getAddressTypeText() {
                    return addressTypeText;
                }

                public void setAddressTypeText(String addressTypeText) {
                    this.addressTypeText = addressTypeText;
                }

                public Object getCountry() {
                    return country;
                }

                public void setCountry(Object country) {
                    this.country = country;
                }

                public String getAddressStatusText() {
                    return addressStatusText;
                }

                public void setAddressStatusText(String addressStatusText) {
                    this.addressStatusText = addressStatusText;
                }

                public Object getCity() {
                    return city;
                }

                public void setCity(Object city) {
                    this.city = city;
                }

                public String getAddress1() {
                    return address1;
                }

                public void setAddress1(String address1) {
                    this.address1 = address1;
                }

                public String getPostCode() {
                    return postCode;
                }

                public void setPostCode(String postCode) {
                    this.postCode = postCode;
                }

                public int getAddressType() {
                    return addressType;
                }

                public void setAddressType(int addressType) {
                    this.addressType = addressType;
                }

                public Object getProvince() {
                    return province;
                }

                public void setProvince(Object province) {
                    this.province = province;
                }

                public int getAddressStatus() {
                    return addressStatus;
                }

                public void setAddressStatus(int addressStatus) {
                    this.addressStatus = addressStatus;
                }

                public String getAddressGuId() {
                    return addressGuId;
                }

                public void setAddressGuId(String addressGuId) {
                    this.addressGuId = addressGuId;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public boolean isIsVisited() {
                    return isVisited;
                }

                public void setIsVisited(boolean isVisited) {
                    this.isVisited = isVisited;
                }

                public boolean isIsLetter() {
                    return isLetter;
                }

                public void setIsLetter(boolean isLetter) {
                    this.isLetter = isLetter;
                }

                public Object getAddress1Ext() {
                    return address1Ext;
                }

                public void setAddress1Ext(Object address1Ext) {
                    this.address1Ext = address1Ext;
                }

                public Object getAddress2Ext() {
                    return address2Ext;
                }

                public void setAddress2Ext(Object address2Ext) {
                    this.address2Ext = address2Ext;
                }
            }
        }

        public static class UrgeItemsBean implements  Serializable{
            private List<UrgeVisitItemsBean> urgeVisitItems;
            private List<UrgeLetterItemsBean> urgeLetterItems;
            private List<?> urgeAssistItems;
            private List<?> urgeSmsItems;
            private List<?> urgeRepairItems;
            private List<UrgePhoneItemsBean> urgePhoneItems;

            public List<UrgeVisitItemsBean> getUrgeVisitItems() {
                return urgeVisitItems;
            }

            public void setUrgeVisitItems(List<UrgeVisitItemsBean> urgeVisitItems) {
                this.urgeVisitItems = urgeVisitItems;
            }

            public List<UrgeLetterItemsBean> getUrgeLetterItems() {
                return urgeLetterItems;
            }

            public void setUrgeLetterItems(List<UrgeLetterItemsBean> urgeLetterItems) {
                this.urgeLetterItems = urgeLetterItems;
            }

            public List<?> getUrgeAssistItems() {
                return urgeAssistItems;
            }

            public void setUrgeAssistItems(List<?> urgeAssistItems) {
                this.urgeAssistItems = urgeAssistItems;
            }

            public List<?> getUrgeSmsItems() {
                return urgeSmsItems;
            }

            public void setUrgeSmsItems(List<?> urgeSmsItems) {
                this.urgeSmsItems = urgeSmsItems;
            }

            public List<?> getUrgeRepairItems() {
                return urgeRepairItems;
            }

            public void setUrgeRepairItems(List<?> urgeRepairItems) {
                this.urgeRepairItems = urgeRepairItems;
            }

            public List<UrgePhoneItemsBean> getUrgePhoneItems() {
                return urgePhoneItems;
            }

            public void setUrgePhoneItems(List<UrgePhoneItemsBean> urgePhoneItems) {
                this.urgePhoneItems = urgePhoneItems;
            }

            //  UrgeLetterItemsBean

            public static class UrgeLetterItemsBean implements  Serializable{
                private String creator;
                private String letterAddress;
                private String letterAcceptor;
                private long createDate;
                private int letterType;
                private String contact;

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public String getLetterAddress() {
                    return letterAddress;
                }

                public void setLetterAddress(String letterAddress) {
                    this.letterAddress = letterAddress;
                }

                public String getLetterAcceptor() {
                    return letterAcceptor;
                }

                public void setLetterAcceptor(String letterAcceptor) {
                    this.letterAcceptor = letterAcceptor;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public int getLetterType() {
                    return letterType;
                }

                public void setLetterType(int letterType) {
                    this.letterType = letterType;
                }

                public String getContact() {
                    return contact;
                }

                public void setContact(String contact) {
                    this.contact = contact;
                }
            }




            public static class UrgeVisitItemsBean implements  Serializable{
                /**
                 * visitGuid : 02f25893-6b03-4d75-9e36-fb8b5387a888
                 * taskGuid : c555aee1-a184-24d5-8ffd-cf14fff0ae2f
                 * applyOrgId : 3
                 * applyOrgName : 深圳万乘
                 * visitOrgId : 3
                 * visitOrgName : 深圳万乘
                 * visitObjectName : fdsgfds
                 * relationText : 夫妻
                 * relation : 10
                 * addressGuid : 0b2fa1e7-8906-4526-a8e1-437f740639f9
                 * addressType : 0
                 * addressTypeText : 户籍地址
                 * address : fbhfdhgfd
                 * postCode : null
                 * province : 内蒙古
                 * city : 鄂尔多斯市
                 * county : 杭锦旗
                 * visitArea : 内蒙古 . 鄂尔多斯市 . 杭锦旗
                 * visitTimes : 0
                 * applicantId : 36
                 * applicantName : szadmin
                 * applyTime : 1563871818296
                 * visitors : szadmin
                 * visitorsName : 深圳系统管理员,
                 * visitBeginTime : 1563408000000
                 * visitEndTime : 1566518400000
                 * visitCompleteTime : 0
                 * effectBackDay : 0
                 * clerkId : 36
                 * clerkName : szadmin
                 * visitStatus : 30
                 * visitStatusText : 已排程
                 * visitStatusRemark : null
                 * visitStatusTime : 1563871818296
                 * visitBackAmount : 0
                 * visitReason : 1
                 * visitGoal : fgf
                 * remark : null
                 * isArchived : false
                 * isDel : false
                 * isPrint : false
                 * visitRecordItems : [{"recordGuid":"6f111d18-3c2a-477f-bdd4-2e6be5e602e3","operateTypeText":"审核","operateContent":"操作前：已申请/待审核修改，操作后：已审核/待排程","operateId":36,"operatorName":"szadmin","operateTime":1563871885771,"isDel":false},{"recordGuid":"5bdc9771-5e3a-48ba-bc0c-09061d3a0593","operateTypeText":"排程","operateContent":"操作前：已审核/待排程，操作后：已排程/待打印","operateId":36,"operatorName":"szadmin","operateTime":1563871971050,"isDel":false}]
                 */

                private String visitGuid;
                private String taskGuid;
                private int applyOrgId;
                private String applyOrgName;
                private int visitOrgId;
                private String visitOrgName;
                private String visitObjectName;
                private String relationText;
                private int relation;
                private String addressGuid;
                private int addressType;
                private String addressTypeText;
                private String address;
                private Object postCode;
                private String province;
                private String city;
                private String county;
                private String visitArea;
                private long visitTimes;
                private int applicantId;
                private String applicantName;
                private long applyTime;
                private String visitors;
                private String visitorsName;
                private long visitBeginTime;
                private long visitEndTime;
                private long visitCompleteTime;
                private long effectBackDay;
                private int clerkId;
                private String clerkName;
                private int visitStatus;
                private String visitStatusText;
                private Object visitStatusRemark;
                private long visitStatusTime;
                private Object visitBackAmount;
                private String visitReason;
                private String visitGoal;
                private Object remark;
                private boolean isArchived;
                private boolean isDel;
                private boolean isPrint;
                private List<VisitRecordItemsBean> visitRecordItems;

                public String getVisitGuid() {
                    return visitGuid;
                }

                public void setVisitGuid(String visitGuid) {
                    this.visitGuid = visitGuid;
                }

                public String getTaskGuid() {
                    return taskGuid;
                }

                public void setTaskGuid(String taskGuid) {
                    this.taskGuid = taskGuid;
                }

                public int getApplyOrgId() {
                    return applyOrgId;
                }

                public void setApplyOrgId(int applyOrgId) {
                    this.applyOrgId = applyOrgId;
                }

                public String getApplyOrgName() {
                    return applyOrgName;
                }

                public void setApplyOrgName(String applyOrgName) {
                    this.applyOrgName = applyOrgName;
                }

                public int getVisitOrgId() {
                    return visitOrgId;
                }

                public void setVisitOrgId(int visitOrgId) {
                    this.visitOrgId = visitOrgId;
                }

                public String getVisitOrgName() {
                    return visitOrgName;
                }

                public void setVisitOrgName(String visitOrgName) {
                    this.visitOrgName = visitOrgName;
                }

                public String getVisitObjectName() {
                    return visitObjectName;
                }

                public void setVisitObjectName(String visitObjectName) {
                    this.visitObjectName = visitObjectName;
                }

                public String getRelationText() {
                    return relationText;
                }

                public void setRelationText(String relationText) {
                    this.relationText = relationText;
                }

                public int getRelation() {
                    return relation;
                }

                public void setRelation(int relation) {
                    this.relation = relation;
                }

                public String getAddressGuid() {
                    return addressGuid;
                }

                public void setAddressGuid(String addressGuid) {
                    this.addressGuid = addressGuid;
                }

                public int getAddressType() {
                    return addressType;
                }

                public void setAddressType(int addressType) {
                    this.addressType = addressType;
                }

                public String getAddressTypeText() {
                    return addressTypeText;
                }

                public void setAddressTypeText(String addressTypeText) {
                    this.addressTypeText = addressTypeText;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public Object getPostCode() {
                    return postCode;
                }

                public void setPostCode(Object postCode) {
                    this.postCode = postCode;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getCounty() {
                    return county;
                }

                public void setCounty(String county) {
                    this.county = county;
                }

                public String getVisitArea() {
                    return visitArea;
                }

                public void setVisitArea(String visitArea) {
                    this.visitArea = visitArea;
                }

                public long getVisitTimes() {
                    return visitTimes;
                }

                public void setVisitTimes(long visitTimes) {
                    this.visitTimes = visitTimes;
                }

                public int getApplicantId() {
                    return applicantId;
                }

                public void setApplicantId(int applicantId) {
                    this.applicantId = applicantId;
                }

                public String getApplicantName() {
                    return applicantName;
                }

                public void setApplicantName(String applicantName) {
                    this.applicantName = applicantName;
                }

                public long getApplyTime() {
                    return applyTime;
                }

                public void setApplyTime(long applyTime) {
                    this.applyTime = applyTime;
                }

                public String getVisitors() {
                    return visitors;
                }

                public void setVisitors(String visitors) {
                    this.visitors = visitors;
                }

                public String getVisitorsName() {
                    return visitorsName;
                }

                public void setVisitorsName(String visitorsName) {
                    this.visitorsName = visitorsName;
                }

                public long getVisitBeginTime() {
                    return visitBeginTime;
                }

                public void setVisitBeginTime(long visitBeginTime) {
                    this.visitBeginTime = visitBeginTime;
                }

                public long getVisitEndTime() {
                    return visitEndTime;
                }

                public void setVisitEndTime(long visitEndTime) {
                    this.visitEndTime = visitEndTime;
                }

                public long getVisitCompleteTime() {
                    return visitCompleteTime;
                }

                public void setVisitCompleteTime(long visitCompleteTime) {
                    this.visitCompleteTime = visitCompleteTime;
                }

                public long getEffectBackDay() {
                    return effectBackDay;
                }

                public void setEffectBackDay(long effectBackDay) {
                    this.effectBackDay = effectBackDay;
                }

                public int getClerkId() {
                    return clerkId;
                }

                public void setClerkId(int clerkId) {
                    this.clerkId = clerkId;
                }

                public String getClerkName() {
                    return clerkName;
                }

                public void setClerkName(String clerkName) {
                    this.clerkName = clerkName;
                }

                public int getVisitStatus() {
                    return visitStatus;
                }

                public void setVisitStatus(int visitStatus) {
                    this.visitStatus = visitStatus;
                }

                public String getVisitStatusText() {
                    return visitStatusText;
                }

                public void setVisitStatusText(String visitStatusText) {
                    this.visitStatusText = visitStatusText;
                }

                public Object getVisitStatusRemark() {
                    return visitStatusRemark;
                }

                public void setVisitStatusRemark(Object visitStatusRemark) {
                    this.visitStatusRemark = visitStatusRemark;
                }

                public long getVisitStatusTime() {
                    return visitStatusTime;
                }

                public void setVisitStatusTime(long visitStatusTime) {
                    this.visitStatusTime = visitStatusTime;
                }

                public Object getVisitBackAmount() {
                    return visitBackAmount;
                }

                public void setVisitBackAmount(Object visitBackAmount) {
                    this.visitBackAmount = visitBackAmount;
                }

                public String getVisitReason() {
                    return visitReason;
                }

                public void setVisitReason(String visitReason) {
                    this.visitReason = visitReason;
                }

                public String getVisitGoal() {
                    return visitGoal;
                }

                public void setVisitGoal(String visitGoal) {
                    this.visitGoal = visitGoal;
                }

                public Object getRemark() {
                    return remark;
                }

                public void setRemark(Object remark) {
                    this.remark = remark;
                }

                public boolean isIsArchived() {
                    return isArchived;
                }

                public void setIsArchived(boolean isArchived) {
                    this.isArchived = isArchived;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public boolean isIsPrint() {
                    return isPrint;
                }

                public void setIsPrint(boolean isPrint) {
                    this.isPrint = isPrint;
                }

                public List<VisitRecordItemsBean> getVisitRecordItems() {
                    return visitRecordItems;
                }

                public void setVisitRecordItems(List<VisitRecordItemsBean> visitRecordItems) {
                    this.visitRecordItems = visitRecordItems;
                }

                public static class VisitRecordItemsBean implements Serializable{
                    /**
                     * recordGuid : 6f111d18-3c2a-477f-bdd4-2e6be5e602e3
                     * operateTypeText : 审核
                     * operateContent : 操作前：已申请/待审核修改，操作后：已审核/待排程
                     * operateId : 36
                     * operatorName : szadmin
                     * operateTime : 1563871885771
                     * isDel : false
                     */

                    private String recordGuid;
                    private String operateTypeText;
                    private String operateContent;
                    private int operateId;
                    private String operatorName;
                    private long operateTime;
                    private boolean isDel;

                    public String getRecordGuid() {
                        return recordGuid;
                    }

                    public void setRecordGuid(String recordGuid) {
                        this.recordGuid = recordGuid;
                    }

                    public String getOperateTypeText() {
                        return operateTypeText;
                    }

                    public void setOperateTypeText(String operateTypeText) {
                        this.operateTypeText = operateTypeText;
                    }

                    public String getOperateContent() {
                        return operateContent;
                    }

                    public void setOperateContent(String operateContent) {
                        this.operateContent = operateContent;
                    }

                    public int getOperateId() {
                        return operateId;
                    }

                    public void setOperateId(int operateId) {
                        this.operateId = operateId;
                    }

                    public String getOperatorName() {
                        return operatorName;
                    }

                    public void setOperatorName(String operatorName) {
                        this.operatorName = operatorName;
                    }

                    public long getOperateTime() {
                        return operateTime;
                    }

                    public void setOperateTime(long operateTime) {
                        this.operateTime = operateTime;
                    }

                    public boolean isIsDel() {
                        return isDel;
                    }

                    public void setIsDel(boolean isDel) {
                        this.isDel = isDel;
                    }
                }
            }

            public static class UrgePhoneItemsBean {
                /**
                 * phoneUrgeTag : 280fca13-5586-4990-9c9d-a7a49a43d909
                 * name : test
                 * phone : 1212333
                 * relation : 60
                 * urgeTypeName : 电催
                 * callRecords : 催记test
                 * contactSummary : 1
                 * contactSummaryText : 未接通
                 * contactResult : 11
                 * contactResultText : 通话中
                 * remark : 备注test
                 * isDel : false
                 * createDate : 1563872455591
                 * creator : szadmin
                 * urgeType : 0
                 * promisePaymentItems : [{"cardNo":"9900000000163882","collectAmount":0,"promiseStatus":30,"promiseStatusText":"已付款","promisePaymentDate":1564012800000,"promisePaymentAmount":2000,"confirmAmount":2000,"confirmDate":1563875432623,"confirmPerson":"36","checkAmount":2000,"checkDate":1563811200000,"checkPerson":"36","applicationCheckAccountDate":0,"applicationPerson":null,"promiseDate":1563872455591,"remark":null,"isDel":false,"promisePaymentGuid":"6bdcbbc2-63f2-47c4-8931-657daf2ec822","isExport":null,"operator":"szadmin","operatorName":"深圳系统管理员","confirmPersonName":"深圳系统管理员","checkPersonName":"深圳系统管理员","applicationPersonName":null}]
                 */

                private String phoneUrgeTag;
                private String name;
                private String phone;
                private int relation;
                private String urgeTypeName;
                private String callRecords;
                private int contactSummary;
                private String contactSummaryText;
                private int contactResult;
                private String contactResultText;
                private String remark;
                private boolean isDel;
                private long createDate;
                private String creator;
                private int urgeType;
                private List<PromisePaymentItemsBean> promisePaymentItems;

                public String getPhoneUrgeTag() {
                    return phoneUrgeTag;
                }

                public void setPhoneUrgeTag(String phoneUrgeTag) {
                    this.phoneUrgeTag = phoneUrgeTag;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPhone() {
                    return phone;
                }

                public void setPhone(String phone) {
                    this.phone = phone;
                }

                public int getRelation() {
                    return relation;
                }

                public void setRelation(int relation) {
                    this.relation = relation;
                }

                public String getUrgeTypeName() {
                    return urgeTypeName;
                }

                public void setUrgeTypeName(String urgeTypeName) {
                    this.urgeTypeName = urgeTypeName;
                }

                public String getCallRecords() {
                    return callRecords;
                }

                public void setCallRecords(String callRecords) {
                    this.callRecords = callRecords;
                }

                public int getContactSummary() {
                    return contactSummary;
                }

                public void setContactSummary(int contactSummary) {
                    this.contactSummary = contactSummary;
                }

                public String getContactSummaryText() {
                    return contactSummaryText;
                }

                public void setContactSummaryText(String contactSummaryText) {
                    this.contactSummaryText = contactSummaryText;
                }

                public int getContactResult() {
                    return contactResult;
                }

                public void setContactResult(int contactResult) {
                    this.contactResult = contactResult;
                }

                public String getContactResultText() {
                    return contactResultText;
                }

                public void setContactResultText(String contactResultText) {
                    this.contactResultText = contactResultText;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public int getUrgeType() {
                    return urgeType;
                }

                public void setUrgeType(int urgeType) {
                    this.urgeType = urgeType;
                }

                public List<PromisePaymentItemsBean> getPromisePaymentItems() {
                    return promisePaymentItems;
                }

                public void setPromisePaymentItems(List<PromisePaymentItemsBean> promisePaymentItems) {
                    this.promisePaymentItems = promisePaymentItems;
                }

                public static class PromisePaymentItemsBean implements Serializable {
                    /**
                     * cardNo : 9900000000163882
                     * collectAmount : 0
                     * promiseStatus : 30
                     * promiseStatusText : 已付款
                     * promisePaymentDate : 1564012800000
                     * promisePaymentAmount : 2000
                     * confirmAmount : 2000
                     * confirmDate : 1563875432623
                     * confirmPerson : 36
                     * checkAmount : 2000
                     * checkDate : 1563811200000
                     * checkPerson : 36
                     * applicationCheckAccountDate : 0
                     * applicationPerson : null
                     * promiseDate : 1563872455591
                     * remark : null
                     * isDel : false
                     * promisePaymentGuid : 6bdcbbc2-63f2-47c4-8931-657daf2ec822
                     * isExport : null
                     * operator : szadmin
                     * operatorName : 深圳系统管理员
                     * confirmPersonName : 深圳系统管理员
                     * checkPersonName : 深圳系统管理员
                     * applicationPersonName : null
                     */

                    private String cardNo;
                    private double collectAmount;
                    private int promiseStatus;
                    private String promiseStatusText;
                    private long promisePaymentDate;
                    private double promisePaymentAmount;
                    private double confirmAmount;
                    private long confirmDate;
                    private String confirmPerson;
                    private double checkAmount;
                    private long checkDate;
                    private String checkPerson;
                    private long applicationCheckAccountDate;
                    private Object applicationPerson;
                    private long promiseDate;
                    private Object remark;
                    private boolean isDel;
                    private String promisePaymentGuid;
                    private Object isExport;
                    private String operator;
                    private String operatorName;
                    private String confirmPersonName;
                    private String checkPersonName;
                    private Object applicationPersonName;

                    public String getCardNo() {
                        return cardNo;
                    }

                    public void setCardNo(String cardNo) {
                        this.cardNo = cardNo;
                    }

                    public double getCollectAmount() {
                        return collectAmount;
                    }

                    public void setCollectAmount(double collectAmount) {
                        this.collectAmount = collectAmount;
                    }

                    public int getPromiseStatus() {
                        return promiseStatus;
                    }

                    public void setPromiseStatus(int promiseStatus) {
                        this.promiseStatus = promiseStatus;
                    }

                    public String getPromiseStatusText() {
                        return promiseStatusText;
                    }

                    public void setPromiseStatusText(String promiseStatusText) {
                        this.promiseStatusText = promiseStatusText;
                    }

                    public long getPromisePaymentDate() {
                        return promisePaymentDate;
                    }

                    public void setPromisePaymentDate(long promisePaymentDate) {
                        this.promisePaymentDate = promisePaymentDate;
                    }

                    public double getPromisePaymentAmount() {
                        return promisePaymentAmount;
                    }

                    public void setPromisePaymentAmount(double promisePaymentAmount) {
                        this.promisePaymentAmount = promisePaymentAmount;
                    }

                    public double getConfirmAmount() {
                        return confirmAmount;
                    }

                    public void setConfirmAmount(double confirmAmount) {
                        this.confirmAmount = confirmAmount;
                    }

                    public long getConfirmDate() {
                        return confirmDate;
                    }

                    public void setConfirmDate(long confirmDate) {
                        this.confirmDate = confirmDate;
                    }

                    public String getConfirmPerson() {
                        return confirmPerson;
                    }

                    public void setConfirmPerson(String confirmPerson) {
                        this.confirmPerson = confirmPerson;
                    }

                    public double getCheckAmount() {
                        return checkAmount;
                    }

                    public void setCheckAmount(double checkAmount) {
                        this.checkAmount = checkAmount;
                    }

                    public long getCheckDate() {
                        return checkDate;
                    }

                    public void setCheckDate(long checkDate) {
                        this.checkDate = checkDate;
                    }

                    public String getCheckPerson() {
                        return checkPerson;
                    }

                    public void setCheckPerson(String checkPerson) {
                        this.checkPerson = checkPerson;
                    }

                    public long getApplicationCheckAccountDate() {
                        return applicationCheckAccountDate;
                    }

                    public void setApplicationCheckAccountDate(long applicationCheckAccountDate) {
                        this.applicationCheckAccountDate = applicationCheckAccountDate;
                    }

                    public Object getApplicationPerson() {
                        return applicationPerson;
                    }

                    public void setApplicationPerson(Object applicationPerson) {
                        this.applicationPerson = applicationPerson;
                    }

                    public long getPromiseDate() {
                        return promiseDate;
                    }

                    public void setPromiseDate(long promiseDate) {
                        this.promiseDate = promiseDate;
                    }

                    public Object getRemark() {
                        return remark;
                    }

                    public void setRemark(Object remark) {
                        this.remark = remark;
                    }

                    public boolean isIsDel() {
                        return isDel;
                    }

                    public void setIsDel(boolean isDel) {
                        this.isDel = isDel;
                    }

                    public String getPromisePaymentGuid() {
                        return promisePaymentGuid;
                    }

                    public void setPromisePaymentGuid(String promisePaymentGuid) {
                        this.promisePaymentGuid = promisePaymentGuid;
                    }

                    public Object getIsExport() {
                        return isExport;
                    }

                    public void setIsExport(Object isExport) {
                        this.isExport = isExport;
                    }

                    public String getOperator() {
                        return operator;
                    }

                    public void setOperator(String operator) {
                        this.operator = operator;
                    }

                    public String getOperatorName() {
                        return operatorName;
                    }

                    public void setOperatorName(String operatorName) {
                        this.operatorName = operatorName;
                    }

                    public String getConfirmPersonName() {
                        return confirmPersonName;
                    }

                    public void setConfirmPersonName(String confirmPersonName) {
                        this.confirmPersonName = confirmPersonName;
                    }

                    public String getCheckPersonName() {
                        return checkPersonName;
                    }

                    public void setCheckPersonName(String checkPersonName) {
                        this.checkPersonName = checkPersonName;
                    }

                    public Object getApplicationPersonName() {
                        return applicationPersonName;
                    }

                    public void setApplicationPersonName(Object applicationPersonName) {
                        this.applicationPersonName = applicationPersonName;
                    }
                }
            }
        }

        public static class CardItemsBean {
            /**
             * verificationDate : 1561953481246
             * createAccountDate : 1561953481246
             * branchesBank :
             * creditLine : 0
             * stagingPeriods : 0
             * caseAmount : 22560.88
             * collectAmount : 22560.88
             * paymentAmount : 0
             * arrearsAmount : 22560.88
             * masterCard :
             * cardStatusItem : {"cardUrgeStatus":10,"cardRepaymenStatusRemark":"未还","cardRepaymentStatus":10,"cardUrgeStatusText":"在催","cardUrgeStatusTime":1561953481246,"cardRepaymenStatusText":"未还","cardRepaymenStatusTime":1561953481246,"cardUrgeStatusRemark":"在催"}
             * defaultRatings : 0-30
             * overdueDays : 15
             * reconciliationAddress : [{"addressStatusRemark":null,"address2":"对账地址2","addressTypeText":"对账单地址","country":null,"addressStatusText":"有效","city":null,"address1":"对账地址1","postCode":"7878","addressType":5,"province":null,"addressStatus":1,"addressGuId":"8ccae8e3-417f-4493-8689-0f3faf52ccc6","creator":"szadmin","createDate":1563957312411,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null},{"addressStatusRemark":null,"address2":"对账地址22","addressTypeText":"对账单地址","country":null,"addressStatusText":"有效","city":null,"address1":"对账地址11","postCode":"4455","addressType":5,"province":null,"addressStatus":1,"addressGuId":"10185388-8f86-43a3-aafe-d3e6efb2fe72","creator":"szadmin","createDate":1563957838587,"isDel":true,"remark":"备注测试","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}]
             * interest : 0
             * overdueInstallments : 个人经营贷
             * currency : RMB
             * carItem : {"carModel":"","carEngineNo":null,"carNo":"","carFrameNo":"","isGPS":0}
             * collectFee : 0
             * mortgageAddressItems : [{"addressStatusRemark":null,"address2":"抵押物地址2","addressTypeText":"抵押物地址","country":null,"addressStatusText":"有效","city":null,"address1":"抵押物地址1","postCode":"7878","addressType":6,"province":null,"addressStatus":1,"addressGuId":"6a735ec7-b969-4672-b169-1b2b37f407eb","creator":"szadmin","createDate":1563957421380,"isDel":false,"remark":"备注测试数据","isVisited":false,"isLetter":false,"address1Ext":null,"address2Ext":null}]
             * repaymentAmountPerPeriod : 0
             * accountNo : 9900000000163882
             * rate : 0
             * reconciliationDate : 1561953481246
             * branches :
             * lastPaymentDate : 0
             * hand : 0-30
             * latestArrearsAmount : 22560.88
             * currencyAmount : 0
             * minRepaymentAmount : 0
             * latestArrearsDate : 0
             * cardNo : 9900000000163882
             * cardGuid : f882dac8-9da3-4946-bb2c-2c0fe378601b
             * repaymentsPeriods :
             * forfeitPenalty : 0
             * otherFee : 0
             * lastPaymentAmount : 0
             * principal : 0
             * cardDescription : null
             * cardAddress : {"addressStatusRemark":"有效","address2":"案件地址2test","addressTypeText":"开卡地址","country":"中国","addressStatusText":"有效","city":"全省","address1":"案件地址1test","postCode":"787899875555","addressType":7,"province":"全国","addressStatus":1,"addressAsString":"全国全省","addressGuId":"c722e05f-f0dc-4f88-8aea-39429c19fae1","creator":"cs024","createDate":1561953481246,"isDel":false,"remark":"备注测试数据","isVisited":true,"isLetter":false,"address1Ext":null,"address2Ext":null}
             * billDate : 0
             * repaymentLogItems : []
             * customersLatestArrears : null
             * cardNoExt : null
             */

            private long verificationDate;
            private long createAccountDate;
            private String branchesBank;
            private Object creditLine;
            private int stagingPeriods;
            private double caseAmount;
            private double collectAmount;
            private double paymentAmount;
            private double arrearsAmount;
            private String masterCard;
            private CardStatusItemBean cardStatusItem;
            private String defaultRatings;
            private String overdueDays;
            private Object interest;
            private String overdueInstallments;
            private String currency;
            private CarItemBean carItem;
            private Object collectFee;
            private double repaymentAmountPerPeriod;
            private String accountNo;
            private Object rate;
            private long reconciliationDate;
            private String branches;
            private long lastPaymentDate;
            private String hand;
            private double latestArrearsAmount;
            private double currencyAmount;
            private double minRepaymentAmount;
            private long latestArrearsDate;
            private String cardNo;
            private String cardGuid;
            private String repaymentsPeriods;
            private Object forfeitPenalty;
            private Object otherFee;
            private Object lastPaymentAmount;
            private float principal;
            private Object cardDescription;
            private CardAddressBean cardAddress;
            private String billDate;
            private Object customersLatestArrears;
            private Object cardNoExt;
            private List<ReconciliationAddressBean> reconciliationAddress;
            private List<MortgageAddressItemsBean> mortgageAddressItems;
            private List<?> repaymentLogItems;

            public long getVerificationDate() {
                return verificationDate;
            }

            public void setVerificationDate(long verificationDate) {
                this.verificationDate = verificationDate;
            }

            public long getCreateAccountDate() {
                return createAccountDate;
            }

            public void setCreateAccountDate(long createAccountDate) {
                this.createAccountDate = createAccountDate;
            }

            public String getBranchesBank() {
                return branchesBank;
            }

            public void setBranchesBank(String branchesBank) {
                this.branchesBank = branchesBank;
            }

            public Object getCreditLine() {
                return creditLine;
            }

            public void setCreditLine(Object creditLine) {
                this.creditLine = creditLine;
            }

            public int getStagingPeriods() {
                return stagingPeriods;
            }

            public void setStagingPeriods(int stagingPeriods) {
                this.stagingPeriods = stagingPeriods;
            }

            public double getCaseAmount() {
                return caseAmount;
            }

            public void setCaseAmount(double caseAmount) {
                this.caseAmount = caseAmount;
            }

            public double getCollectAmount() {
                return collectAmount;
            }

            public void setCollectAmount(double collectAmount) {
                this.collectAmount = collectAmount;
            }

            public double getPaymentAmount() {
                return paymentAmount;
            }

            public void setPaymentAmount(double paymentAmount) {
                this.paymentAmount = paymentAmount;
            }

            public double getArrearsAmount() {
                return arrearsAmount;
            }

            public void setArrearsAmount(double arrearsAmount) {
                this.arrearsAmount = arrearsAmount;
            }

            public String getMasterCard() {
                return masterCard;
            }

            public void setMasterCard(String masterCard) {
                this.masterCard = masterCard;
            }

            public CardStatusItemBean getCardStatusItem() {
                return cardStatusItem;
            }

            public void setCardStatusItem(CardStatusItemBean cardStatusItem) {
                this.cardStatusItem = cardStatusItem;
            }

            public String getDefaultRatings() {
                return defaultRatings;
            }

            public void setDefaultRatings(String defaultRatings) {
                this.defaultRatings = defaultRatings;
            }

            public String getOverdueDays() {
                return overdueDays;
            }

            public void setOverdueDays(String overdueDays) {
                this.overdueDays = overdueDays;
            }

            public Object getInterest() {
                return interest;
            }

            public void setInterest(Object interest) {
                this.interest = interest;
            }

            public String getOverdueInstallments() {
                return overdueInstallments;
            }

            public void setOverdueInstallments(String overdueInstallments) {
                this.overdueInstallments = overdueInstallments;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public CarItemBean getCarItem() {
                return carItem;
            }

            public void setCarItem(CarItemBean carItem) {
                this.carItem = carItem;
            }

            public Object getCollectFee() {
                return collectFee;
            }

            public void setCollectFee(Object collectFee) {
                this.collectFee = collectFee;
            }

            public double getRepaymentAmountPerPeriod() {
                return repaymentAmountPerPeriod;
            }

            public void setRepaymentAmountPerPeriod(double repaymentAmountPerPeriod) {
                this.repaymentAmountPerPeriod = repaymentAmountPerPeriod;
            }

            public String getAccountNo() {
                return accountNo;
            }

            public void setAccountNo(String accountNo) {
                this.accountNo = accountNo;
            }

            public Object getRate() {
                return rate;
            }

            public void setRate(Object rate) {
                this.rate = rate;
            }

            public long getReconciliationDate() {
                return reconciliationDate;
            }

            public void setReconciliationDate(long reconciliationDate) {
                this.reconciliationDate = reconciliationDate;
            }

            public String getBranches() {
                return branches;
            }

            public void setBranches(String branches) {
                this.branches = branches;
            }

            public long getLastPaymentDate() {
                return lastPaymentDate;
            }

            public void setLastPaymentDate(long lastPaymentDate) {
                this.lastPaymentDate = lastPaymentDate;
            }

            public String getHand() {
                return hand;
            }

            public void setHand(String hand) {
                this.hand = hand;
            }

            public double getLatestArrearsAmount() {
                return latestArrearsAmount;
            }

            public void setLatestArrearsAmount(double latestArrearsAmount) {
                this.latestArrearsAmount = latestArrearsAmount;
            }

            public double getCurrencyAmount() {
                return currencyAmount;
            }

            public void setCurrencyAmount(double currencyAmount) {
                this.currencyAmount = currencyAmount;
            }

            public double getMinRepaymentAmount() {
                return minRepaymentAmount;
            }

            public void setMinRepaymentAmount(double minRepaymentAmount) {
                this.minRepaymentAmount = minRepaymentAmount;
            }

            public long getLatestArrearsDate() {
                return latestArrearsDate;
            }

            public void setLatestArrearsDate(long latestArrearsDate) {
                this.latestArrearsDate = latestArrearsDate;
            }

            public String getCardNo() {
                return cardNo;
            }

            public void setCardNo(String cardNo) {
                this.cardNo = cardNo;
            }

            public String getCardGuid() {
                return cardGuid;
            }

            public void setCardGuid(String cardGuid) {
                this.cardGuid = cardGuid;
            }

            public String getRepaymentsPeriods() {
                return repaymentsPeriods;
            }

            public void setRepaymentsPeriods(String repaymentsPeriods) {
                this.repaymentsPeriods = repaymentsPeriods;
            }

            public Object getForfeitPenalty() {
                return forfeitPenalty;
            }

            public void setForfeitPenalty(Object forfeitPenalty) {
                this.forfeitPenalty = forfeitPenalty;
            }

            public Object getOtherFee() {
                return otherFee;
            }

            public void setOtherFee(Object otherFee) {
                this.otherFee = otherFee;
            }

            public Object getLastPaymentAmount() {
                return lastPaymentAmount;
            }

            public void setLastPaymentAmount(Object lastPaymentAmount) {
                this.lastPaymentAmount = lastPaymentAmount;
            }

            public float getPrincipal() {
                return principal;
            }

            public void setPrincipal(float principal) {
                this.principal = principal;
            }

            public Object getCardDescription() {
                return cardDescription;
            }

            public void setCardDescription(Object cardDescription) {
                this.cardDescription = cardDescription;
            }

            public CardAddressBean getCardAddress() {
                return cardAddress;
            }

            public void setCardAddress(CardAddressBean cardAddress) {
                this.cardAddress = cardAddress;
            }

            public String getBillDate() {
                return billDate;
            }

            public void setBillDate(String billDate) {
                this.billDate = billDate;
            }

            public Object getCustomersLatestArrears() {
                return customersLatestArrears;
            }

            public void setCustomersLatestArrears(Object customersLatestArrears) {
                this.customersLatestArrears = customersLatestArrears;
            }

            public Object getCardNoExt() {
                return cardNoExt;
            }

            public void setCardNoExt(Object cardNoExt) {
                this.cardNoExt = cardNoExt;
            }

            public List<ReconciliationAddressBean> getReconciliationAddress() {
                return reconciliationAddress;
            }

            public void setReconciliationAddress(List<ReconciliationAddressBean> reconciliationAddress) {
                this.reconciliationAddress = reconciliationAddress;
            }

            public List<MortgageAddressItemsBean> getMortgageAddressItems() {
                return mortgageAddressItems;
            }

            public void setMortgageAddressItems(List<MortgageAddressItemsBean> mortgageAddressItems) {
                this.mortgageAddressItems = mortgageAddressItems;
            }

            public List<?> getRepaymentLogItems() {
                return repaymentLogItems;
            }

            public void setRepaymentLogItems(List<?> repaymentLogItems) {
                this.repaymentLogItems = repaymentLogItems;
            }

            public static class CardStatusItemBean {
                /**
                 * cardUrgeStatus : 10
                 * cardRepaymenStatusRemark : 未还
                 * cardRepaymentStatus : 10
                 * cardUrgeStatusText : 在催
                 * cardUrgeStatusTime : 1561953481246
                 * cardRepaymenStatusText : 未还
                 * cardRepaymenStatusTime : 1561953481246
                 * cardUrgeStatusRemark : 在催
                 */

                private int cardUrgeStatus;
                private String cardRepaymenStatusRemark;
                private int cardRepaymentStatus;
                private String cardUrgeStatusText;
                private long cardUrgeStatusTime;
                private String cardRepaymenStatusText;
                private long cardRepaymenStatusTime;
                private String cardUrgeStatusRemark;

                public int getCardUrgeStatus() {
                    return cardUrgeStatus;
                }

                public void setCardUrgeStatus(int cardUrgeStatus) {
                    this.cardUrgeStatus = cardUrgeStatus;
                }

                public String getCardRepaymenStatusRemark() {
                    return cardRepaymenStatusRemark;
                }

                public void setCardRepaymenStatusRemark(String cardRepaymenStatusRemark) {
                    this.cardRepaymenStatusRemark = cardRepaymenStatusRemark;
                }

                public int getCardRepaymentStatus() {
                    return cardRepaymentStatus;
                }

                public void setCardRepaymentStatus(int cardRepaymentStatus) {
                    this.cardRepaymentStatus = cardRepaymentStatus;
                }

                public String getCardUrgeStatusText() {
                    return cardUrgeStatusText;
                }

                public void setCardUrgeStatusText(String cardUrgeStatusText) {
                    this.cardUrgeStatusText = cardUrgeStatusText;
                }

                public long getCardUrgeStatusTime() {
                    return cardUrgeStatusTime;
                }

                public void setCardUrgeStatusTime(long cardUrgeStatusTime) {
                    this.cardUrgeStatusTime = cardUrgeStatusTime;
                }

                public String getCardRepaymenStatusText() {
                    return cardRepaymenStatusText;
                }

                public void setCardRepaymenStatusText(String cardRepaymenStatusText) {
                    this.cardRepaymenStatusText = cardRepaymenStatusText;
                }

                public long getCardRepaymenStatusTime() {
                    return cardRepaymenStatusTime;
                }

                public void setCardRepaymenStatusTime(long cardRepaymenStatusTime) {
                    this.cardRepaymenStatusTime = cardRepaymenStatusTime;
                }

                public String getCardUrgeStatusRemark() {
                    return cardUrgeStatusRemark;
                }

                public void setCardUrgeStatusRemark(String cardUrgeStatusRemark) {
                    this.cardUrgeStatusRemark = cardUrgeStatusRemark;
                }
            }

            public static class CarItemBean {
                /**
                 * carModel :
                 * carEngineNo : null
                 * carNo :
                 * carFrameNo :
                 * isGPS : 0
                 */

                private String carModel;
                private Object carEngineNo;
                private String carNo;
                private String carFrameNo;
                private int isGPS;

                public String getCarModel() {
                    return carModel;
                }

                public void setCarModel(String carModel) {
                    this.carModel = carModel;
                }

                public Object getCarEngineNo() {
                    return carEngineNo;
                }

                public void setCarEngineNo(Object carEngineNo) {
                    this.carEngineNo = carEngineNo;
                }

                public String getCarNo() {
                    return carNo;
                }

                public void setCarNo(String carNo) {
                    this.carNo = carNo;
                }

                public String getCarFrameNo() {
                    return carFrameNo;
                }

                public void setCarFrameNo(String carFrameNo) {
                    this.carFrameNo = carFrameNo;
                }

                public int getIsGPS() {
                    return isGPS;
                }

                public void setIsGPS(int isGPS) {
                    this.isGPS = isGPS;
                }
            }

            public static class CardAddressBean implements  Serializable{
                /**
                 * addressStatusRemark : 有效
                 * address2 : 案件地址2test
                 * addressTypeText : 开卡地址
                 * country : 中国
                 * addressStatusText : 有效
                 * city : 全省
                 * address1 : 案件地址1test
                 * postCode : 787899875555
                 * addressType : 7
                 * province : 全国
                 * addressStatus : 1
                 * addressAsString : 全国全省
                 * addressGuId : c722e05f-f0dc-4f88-8aea-39429c19fae1
                 * creator : cs024
                 * createDate : 1561953481246
                 * isDel : false
                 * remark : 备注测试数据
                 * isVisited : true
                 * isLetter : false
                 * address1Ext : null
                 * address2Ext : null
                 */

                private String addressStatusRemark;
                private String address2;
                private String addressTypeText;
                private String country;
                private String addressStatusText;
                private String city;
                private String address1;
                private String postCode;
                private int addressType;
                private String province;
                private int addressStatus;
                private String addressAsString;
                private String addressGuId;
                private String creator;
                private long createDate;
                private boolean isDel;
                private String remark;
                private boolean isVisited;
                private boolean isLetter;
                private Object address1Ext;
                private Object address2Ext;

                public String getAddressStatusRemark() {
                    return addressStatusRemark;
                }

                public void setAddressStatusRemark(String addressStatusRemark) {
                    this.addressStatusRemark = addressStatusRemark;
                }

                public String getAddress2() {
                    return address2;
                }

                public void setAddress2(String address2) {
                    this.address2 = address2;
                }

                public String getAddressTypeText() {
                    return addressTypeText;
                }

                public void setAddressTypeText(String addressTypeText) {
                    this.addressTypeText = addressTypeText;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public String getAddressStatusText() {
                    return addressStatusText;
                }

                public void setAddressStatusText(String addressStatusText) {
                    this.addressStatusText = addressStatusText;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getAddress1() {
                    return address1;
                }

                public void setAddress1(String address1) {
                    this.address1 = address1;
                }

                public String getPostCode() {
                    return postCode;
                }

                public void setPostCode(String postCode) {
                    this.postCode = postCode;
                }

                public int getAddressType() {
                    return addressType;
                }

                public void setAddressType(int addressType) {
                    this.addressType = addressType;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public int getAddressStatus() {
                    return addressStatus;
                }

                public void setAddressStatus(int addressStatus) {
                    this.addressStatus = addressStatus;
                }

                public String getAddressAsString() {
                    return addressAsString;
                }

                public void setAddressAsString(String addressAsString) {
                    this.addressAsString = addressAsString;
                }

                public String getAddressGuId() {
                    return addressGuId;
                }

                public void setAddressGuId(String addressGuId) {
                    this.addressGuId = addressGuId;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public boolean isIsVisited() {
                    return isVisited;
                }

                public void setIsVisited(boolean isVisited) {
                    this.isVisited = isVisited;
                }

                public boolean isIsLetter() {
                    return isLetter;
                }

                public void setIsLetter(boolean isLetter) {
                    this.isLetter = isLetter;
                }

                public Object getAddress1Ext() {
                    return address1Ext;
                }

                public void setAddress1Ext(Object address1Ext) {
                    this.address1Ext = address1Ext;
                }

                public Object getAddress2Ext() {
                    return address2Ext;
                }

                public void setAddress2Ext(Object address2Ext) {
                    this.address2Ext = address2Ext;
                }
            }

            public static class ReconciliationAddressBean implements Serializable{
                /**
                 * addressStatusRemark : null
                 * address2 : 对账地址2
                 * addressTypeText : 对账单地址
                 * country : null
                 * addressStatusText : 有效
                 * city : null
                 * address1 : 对账地址1
                 * postCode : 7878
                 * addressType : 5
                 * province : null
                 * addressStatus : 1
                 * addressGuId : 8ccae8e3-417f-4493-8689-0f3faf52ccc6
                 * creator : szadmin
                 * createDate : 1563957312411
                 * isDel : false
                 * remark : 备注测试数据
                 * isVisited : false
                 * isLetter : false
                 * address1Ext : null
                 * address2Ext : null
                 */

                private Object addressStatusRemark;
                private String address2;
                private String addressTypeText;
                private Object country;
                private String addressStatusText;
                private Object city;
                private String address1;
                private String postCode;
                private int addressType;
                private Object province;
                private int addressStatus;
                private String addressGuId;
                private String creator;
                private long createDate;
                private boolean isDel;
                private String remark;
                private boolean isVisited;
                private boolean isLetter;
                private Object address1Ext;
                private Object address2Ext;

                public Object getAddressStatusRemark() {
                    return addressStatusRemark;
                }

                public void setAddressStatusRemark(Object addressStatusRemark) {
                    this.addressStatusRemark = addressStatusRemark;
                }

                public String getAddress2() {
                    return address2;
                }

                public void setAddress2(String address2) {
                    this.address2 = address2;
                }

                public String getAddressTypeText() {
                    return addressTypeText;
                }

                public void setAddressTypeText(String addressTypeText) {
                    this.addressTypeText = addressTypeText;
                }

                public Object getCountry() {
                    return country;
                }

                public void setCountry(Object country) {
                    this.country = country;
                }

                public String getAddressStatusText() {
                    return addressStatusText;
                }

                public void setAddressStatusText(String addressStatusText) {
                    this.addressStatusText = addressStatusText;
                }

                public Object getCity() {
                    return city;
                }

                public void setCity(Object city) {
                    this.city = city;
                }

                public String getAddress1() {
                    return address1;
                }

                public void setAddress1(String address1) {
                    this.address1 = address1;
                }

                public String getPostCode() {
                    return postCode;
                }

                public void setPostCode(String postCode) {
                    this.postCode = postCode;
                }

                public int getAddressType() {
                    return addressType;
                }

                public void setAddressType(int addressType) {
                    this.addressType = addressType;
                }

                public Object getProvince() {
                    return province;
                }

                public void setProvince(Object province) {
                    this.province = province;
                }

                public int getAddressStatus() {
                    return addressStatus;
                }

                public void setAddressStatus(int addressStatus) {
                    this.addressStatus = addressStatus;
                }

                public String getAddressGuId() {
                    return addressGuId;
                }

                public void setAddressGuId(String addressGuId) {
                    this.addressGuId = addressGuId;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public boolean isIsVisited() {
                    return isVisited;
                }

                public void setIsVisited(boolean isVisited) {
                    this.isVisited = isVisited;
                }

                public boolean isIsLetter() {
                    return isLetter;
                }

                public void setIsLetter(boolean isLetter) {
                    this.isLetter = isLetter;
                }

                public Object getAddress1Ext() {
                    return address1Ext;
                }

                public void setAddress1Ext(Object address1Ext) {
                    this.address1Ext = address1Ext;
                }

                public Object getAddress2Ext() {
                    return address2Ext;
                }

                public void setAddress2Ext(Object address2Ext) {
                    this.address2Ext = address2Ext;
                }
            }

            public static class MortgageAddressItemsBean implements  Serializable{
                /**
                 * addressStatusRemark : null
                 * address2 : 抵押物地址2
                 * addressTypeText : 抵押物地址
                 * country : null
                 * addressStatusText : 有效
                 * city : null
                 * address1 : 抵押物地址1
                 * postCode : 7878
                 * addressType : 6
                 * province : null
                 * addressStatus : 1
                 * addressGuId : 6a735ec7-b969-4672-b169-1b2b37f407eb
                 * creator : szadmin
                 * createDate : 1563957421380
                 * isDel : false
                 * remark : 备注测试数据
                 * isVisited : false
                 * isLetter : false
                 * address1Ext : null
                 * address2Ext : null
                 */

                private Object addressStatusRemark;
                private String address2;
                private String addressTypeText;
                private Object country;
                private String addressStatusText;
                private Object city;
                private String address1;
                private String postCode;
                private int addressType;
                private Object province;
                private int addressStatus;
                private String addressGuId;
                private String creator;
                private long createDate;
                private boolean isDel;
                private String remark;
                private boolean isVisited;
                private boolean isLetter;
                private Object address1Ext;
                private Object address2Ext;

                public Object getAddressStatusRemark() {
                    return addressStatusRemark;
                }

                public void setAddressStatusRemark(Object addressStatusRemark) {
                    this.addressStatusRemark = addressStatusRemark;
                }

                public String getAddress2() {
                    return address2;
                }

                public void setAddress2(String address2) {
                    this.address2 = address2;
                }

                public String getAddressTypeText() {
                    return addressTypeText;
                }

                public void setAddressTypeText(String addressTypeText) {
                    this.addressTypeText = addressTypeText;
                }

                public Object getCountry() {
                    return country;
                }

                public void setCountry(Object country) {
                    this.country = country;
                }

                public String getAddressStatusText() {
                    return addressStatusText;
                }

                public void setAddressStatusText(String addressStatusText) {
                    this.addressStatusText = addressStatusText;
                }

                public Object getCity() {
                    return city;
                }

                public void setCity(Object city) {
                    this.city = city;
                }

                public String getAddress1() {
                    return address1;
                }

                public void setAddress1(String address1) {
                    this.address1 = address1;
                }

                public String getPostCode() {
                    return postCode;
                }

                public void setPostCode(String postCode) {
                    this.postCode = postCode;
                }

                public int getAddressType() {
                    return addressType;
                }

                public void setAddressType(int addressType) {
                    this.addressType = addressType;
                }

                public Object getProvince() {
                    return province;
                }

                public void setProvince(Object province) {
                    this.province = province;
                }

                public int getAddressStatus() {
                    return addressStatus;
                }

                public void setAddressStatus(int addressStatus) {
                    this.addressStatus = addressStatus;
                }

                public String getAddressGuId() {
                    return addressGuId;
                }

                public void setAddressGuId(String addressGuId) {
                    this.addressGuId = addressGuId;
                }

                public String getCreator() {
                    return creator;
                }

                public void setCreator(String creator) {
                    this.creator = creator;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public boolean isIsDel() {
                    return isDel;
                }

                public void setIsDel(boolean isDel) {
                    this.isDel = isDel;
                }

                public String getRemark() {
                    return remark;
                }

                public void setRemark(String remark) {
                    this.remark = remark;
                }

                public boolean isIsVisited() {
                    return isVisited;
                }

                public void setIsVisited(boolean isVisited) {
                    this.isVisited = isVisited;
                }

                public boolean isIsLetter() {
                    return isLetter;
                }

                public void setIsLetter(boolean isLetter) {
                    this.isLetter = isLetter;
                }

                public Object getAddress1Ext() {
                    return address1Ext;
                }

                public void setAddress1Ext(Object address1Ext) {
                    this.address1Ext = address1Ext;
                }

                public Object getAddress2Ext() {
                    return address2Ext;
                }

                public void setAddress2Ext(Object address2Ext) {
                    this.address2Ext = address2Ext;
                }
            }
        }

        public static class CaseFollowMessageItemsBean implements Serializable {
            /**
             * caseFollowMessageGuid : 107043b6-6fb6-4c8e-83d5-a58673b42963
             * caseFollowMessageType : 2
             * caseFollowMessageTypeText : 催收小结
             * contents : 跟进test
             * createDate : 1563872134106
             * remindDate : 0
             * operatorName : 深圳系统管理员
             * operatorId : 36
             * isRemind : false
             * isDel : false
             */

            private String caseFollowMessageGuid;
            private int caseFollowMessageType;
            private String caseFollowMessageTypeText;
            private String contents;
            private long createDate;
            private long remindDate;
            private String operatorName;
            private int operatorId;
            private boolean isRemind;
            private boolean isDel;

            public String getCaseFollowMessageGuid() {
                return caseFollowMessageGuid;
            }

            public void setCaseFollowMessageGuid(String caseFollowMessageGuid) {
                this.caseFollowMessageGuid = caseFollowMessageGuid;
            }

            public int getCaseFollowMessageType() {
                return caseFollowMessageType;
            }

            public void setCaseFollowMessageType(int caseFollowMessageType) {
                this.caseFollowMessageType = caseFollowMessageType;
            }

            public String getCaseFollowMessageTypeText() {
                return caseFollowMessageTypeText;
            }

            public void setCaseFollowMessageTypeText(String caseFollowMessageTypeText) {
                this.caseFollowMessageTypeText = caseFollowMessageTypeText;
            }

            public String getContents() {
                return contents;
            }

            public void setContents(String contents) {
                this.contents = contents;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public long getRemindDate() {
                return remindDate;
            }

            public void setRemindDate(long remindDate) {
                this.remindDate = remindDate;
            }

            public String getOperatorName() {
                return operatorName;
            }

            public void setOperatorName(String operatorName) {
                this.operatorName = operatorName;
            }

            public int getOperatorId() {
                return operatorId;
            }

            public void setOperatorId(int operatorId) {
                this.operatorId = operatorId;
            }

            public boolean isIsRemind() {
                return isRemind;
            }

            public void setIsRemind(boolean isRemind) {
                this.isRemind = isRemind;
            }

            public boolean isIsDel() {
                return isDel;
            }

            public void setIsDel(boolean isDel) {
                this.isDel = isDel;
            }
        }
        public static class OperateLogsBean implements Serializable {
        /*                  "bathCode": "BNJ-20190701-002",
                           "caseCode": "BNJ-20190701-002-000001",
                           "caseOperateLogGuid": "130ca482-0389-4872-b127-d721d67f512e",
                           "caseOperateType": 2,
                           "caseOperateTypeText": "打回案件",
                           "contents": "梁文诗: 在   [1561954048381] 时间打回案件",
                           "createDate": 1561954048381,
                           "operatorName": "梁文诗",
                           "operatorId": 3904,
                           "isDel": false,
                           "isSuccess": true*/
            private String bathCode;
            private String caseCode;
            private String caseOperateLogGuid;
            private int caseOperateType;
            private String caseOperateTypeText;
            private String contents;
            private long createDate;
            private String operatorName;

            public String getBathCode() {
                return bathCode;
            }

            public void setBathCode(String bathCode) {
                this.bathCode = bathCode;
            }

            public String getCaseCode() {
                return caseCode;
            }

            public void setCaseCode(String caseCode) {
                this.caseCode = caseCode;
            }

            public String getCaseOperateLogGuid() {
                return caseOperateLogGuid;
            }

            public void setCaseOperateLogGuid(String caseOperateLogGuid) {
                this.caseOperateLogGuid = caseOperateLogGuid;
            }

            public int getCaseOperateType() {
                return caseOperateType;
            }

            public void setCaseOperateType(int caseOperateType) {
                this.caseOperateType = caseOperateType;
            }

            public String getCaseOperateTypeText() {
                return caseOperateTypeText;
            }

            public void setCaseOperateTypeText(String caseOperateTypeText) {
                this.caseOperateTypeText = caseOperateTypeText;
            }

            public String getContents() {
                return contents;
            }

            public void setContents(String contents) {
                this.contents = contents;
            }

            public long getCreateDate() {
                return createDate;
            }

            public void setCreateDate(long createDate) {
                this.createDate = createDate;
            }

            public String getOperatorName() {
                return operatorName;
            }

            public void setOperatorName(String operatorName) {
                this.operatorName = operatorName;
            }
        }
    }

}
