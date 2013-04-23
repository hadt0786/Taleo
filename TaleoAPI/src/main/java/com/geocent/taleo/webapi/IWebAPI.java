/**
 * IWebAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.geocent.taleo.webapi;

public interface IWebAPI extends java.rmi.Remote {
    public long createTask(java.lang.String in0, com.geocent.taleo.webapi.TaskBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createReference(java.lang.String in0, com.geocent.taleo.webapi.ReferenceBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createEvent(java.lang.String in0, com.geocent.taleo.webapi.CalendarEventBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void logout(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.lang.String getEnabledServices(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.lang.String getLoginToken(java.lang.String sessionId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.SearchResultArr searchAccount(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.AccountBean getAccountById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createAccount(java.lang.String in0, com.geocent.taleo.webapi.AccountBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateAccount(java.lang.String in0, com.geocent.taleo.webapi.AccountBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteAccount(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getBackgroundChecksByCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.BackgroundCheckBean getBackgroundCheckById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createBackgroundCheck(java.lang.String in0, com.geocent.taleo.webapi.BackgroundCheckBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateBackgroundCheck(java.lang.String in0, com.geocent.taleo.webapi.BackgroundCheckBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteBackgroundCheck(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getEventByEntity(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getPublicEvents(java.lang.String in0, java.util.Calendar in1, java.util.Calendar in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.CalendarEventBean getEventById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateEvent(java.lang.String in0, com.geocent.taleo.webapi.CalendarEventBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteEvent(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.SearchResultArr searchCandidate(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.CandidateBean getCandidateById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getRequisitions(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getOffers(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createCandidate(java.lang.String in0, com.geocent.taleo.webapi.CandidateBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateCandidate(java.lang.String in0, com.geocent.taleo.webapi.CandidateBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void setBinaryResume(java.lang.String in0, long in1, java.lang.String in2, com.geocent.taleo.webapi.ByteArr in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.ByteArr getBinaryResume(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void submitCandidate(java.lang.String in0, long in1, com.geocent.taleo.webapi.LongArr in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void removeCandidate(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.SearchResultArr searchContact(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.ContactBean getContactById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createContact(java.lang.String in0, com.geocent.taleo.webapi.ContactBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateContact(java.lang.String in0, com.geocent.taleo.webapi.ContactBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteContact(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.HistoryBeanArr getCandidateHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.HistoryBeanArr getRequisitionHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.HistoryBeanArr getAccountHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.HistoryBeanArr getContactHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.HistoryBeanArr getUserHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getInterviewsByCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.InterviewBean getInterviewById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createInterview(java.lang.String in0, com.geocent.taleo.webapi.InterviewBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateInterview(java.lang.String in0, com.geocent.taleo.webapi.InterviewBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteInterview(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.OfferBean getOfferById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createOffer(java.lang.String in0, com.geocent.taleo.webapi.OfferBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateOffer(java.lang.String in0, com.geocent.taleo.webapi.OfferBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void setBinaryOffer(java.lang.String in0, long in1, java.lang.String in2, com.geocent.taleo.webapi.ByteArr in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.ByteArr getBinaryOffer(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteOffer(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getReferencesByCandidate(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.ReferenceBean getReferenceById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateReference(java.lang.String in0, com.geocent.taleo.webapi.ReferenceBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteReference(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.SearchResultArr searchRequisition(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.RequisitionBean getRequisitionById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getCandidatesByRequisition(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getAssociatedUsers(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createRequisition(java.lang.String in0, com.geocent.taleo.webapi.RequisitionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateRequisition(java.lang.String in0, com.geocent.taleo.webapi.RequisitionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void setAssociatedUser(java.lang.String in0, long in1, java.lang.String in2, long in3, int in4) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void removeAssociatedUser(java.lang.String in0, long in1, java.lang.String in2, long in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteRequisition(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getTaskByEntity(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getTaskByUser(java.lang.String in0, long in1, java.util.Calendar in2, java.util.Calendar in3) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.TaskBean getTaskById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateTask(java.lang.String in0, com.geocent.taleo.webapi.TaskBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteTask(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.SearchResultArr searchUser(java.lang.String in0, java.util.HashMap in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.UserBean getUserById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createUser(java.lang.String in0, com.geocent.taleo.webapi.UserBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createUserWithPermissions(java.lang.String sessionId, com.geocent.taleo.webapi.UserBean userBeanToCreate, java.util.HashMap additionalEntities) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateUser(java.lang.String in0, com.geocent.taleo.webapi.UserBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteUser(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getContactLogsByEntity(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.ContactLogBean getContactLogById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createContactLog(java.lang.String in0, com.geocent.taleo.webapi.ContactLogBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createEmailLog(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.util.Calendar in4) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createEmailSentLog(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.util.Calendar in4) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateContactLog(java.lang.String in0, com.geocent.taleo.webapi.ContactLogBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteContactLog(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.util.HashMap getSystemProps(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.lang.String getCandReqStatus(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.lang.String parseResume(java.lang.String in0, com.geocent.taleo.webapi.ByteArr in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.CandidateInsertResultBean parseResumeIntoCandidate(java.lang.String in0, com.geocent.taleo.webapi.ByteArr in1, java.lang.String referredBy, java.lang.String fileName) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.MetadataArr getMetadata(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LookupArr getLookup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void createLink(java.lang.String sessionId, java.lang.String entityType1, long entityId1, java.lang.String entityType2, long entityId2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void removeLink(java.lang.String sessionId, java.lang.String entityType1, long entityId1, java.lang.String entityType2, long entityId2) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createAttachment(java.lang.String in0, long in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.geocent.taleo.webapi.ByteArr in5) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createEntityAttachment(java.lang.String sessionId, java.lang.String entityType, long entityId, java.lang.String description, java.lang.String fileName, java.lang.String contentType, com.geocent.taleo.webapi.ByteArr data) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateAttachment(java.lang.String in0, long in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, com.geocent.taleo.webapi.ByteArr in5) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteAttachment(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getAttachments(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LongArr getEntityAttachments(java.lang.String sessionId, java.lang.String entityType, long entityId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.AttachmentBean getAttachment(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.ByteArr getAttachmentData(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.CandidateDetailsBean getCandidateDetailsById(java.lang.String in0, long in1, boolean in2, boolean in3, boolean in4, boolean in5, boolean in6, boolean in7) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createRequisitionTemplate(java.lang.String in0, com.geocent.taleo.webapi.RequisitionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void postRequisition(java.lang.String sessionId, long requisitionId, long posterId, int formVersion) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void unpostRequisition(java.lang.String sessionId, long requisitionId, long posterId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void upsertCandidateToRequisitions(java.lang.String sessionId, long candidateId, com.geocent.taleo.webapi.LongArr requisitionIds, long statusId, long reasonId, boolean doRanking) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.SearchResultArr searchEmployee(java.lang.String sessionId, java.util.HashMap searchParams) throws java.rmi.RemoteException;
    public void deleteEmployee(java.lang.String sessionId, long employeeId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteEmployeeByNumber(java.lang.String sessionId, java.lang.String employeeNumber) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long upsertEmployee(java.lang.String sessionId, java.lang.String employeeNumber, com.geocent.taleo.webapi.EmployeeBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.EmployeeBean getEmployeeByNumber(java.lang.String sessionId, java.lang.String employeeNumber, java.util.Vector additionalEntities) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.EmployeeBean getEmployeeById(java.lang.String sessionId, long employeeId, java.util.Vector additionalEntities) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createEmployee(java.lang.String sessionId, com.geocent.taleo.webapi.EmployeeBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void updateEmployee(java.lang.String sessionId, com.geocent.taleo.webapi.EmployeeBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.WorkHistoryArr getCandidateWorkHistory(java.lang.String sessionId, long candidateId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.FlexRollingEntityBeanArr getRollingEntities(java.lang.String sessionId, java.lang.String rollingEntityType, java.lang.String entityType, long entityId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long upsertRollingEntity(java.lang.String sessionId, com.geocent.taleo.webapi.FlexRollingEntityBean rollingEntityBean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteRollingEntity(java.lang.String sessionId, long rollingEntityId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public java.lang.String loginPartner(java.lang.String orgCode, java.lang.String partnerCode, long currentTimeMillis, java.lang.String digest) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createRegion(java.lang.String in0, com.geocent.taleo.webapi.RegionBean in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createLocation(java.lang.String sessionId, com.geocent.taleo.webapi.LocationBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long createDepartment(java.lang.String sessionId, com.geocent.taleo.webapi.DepartmentBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.RegionBean getRegionById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.DepartmentBean getDepartmentById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LocationBean getLocationById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.RegionBean getRegionByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.DepartmentBean getDepartmentByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LocationBean getLocationByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteRegion(java.lang.String in0, long regionId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteLocation(java.lang.String sessionId, long locationId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public void deleteDepartment(java.lang.String sessionId, long departmentId) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.RegionArr getRegions(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.DepartmentArr getDepartments(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public com.geocent.taleo.webapi.LocationArr getLocations(java.lang.String in0) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long upsertRegion(java.lang.String sessionId, com.geocent.taleo.webapi.RegionBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long upsertLocation(java.lang.String sessionId, com.geocent.taleo.webapi.LocationBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
    public long upsertDepartment(java.lang.String sessionId, com.geocent.taleo.webapi.DepartmentBean bean) throws java.rmi.RemoteException, com.geocent.taleo.webapi.WebServicesException;
}