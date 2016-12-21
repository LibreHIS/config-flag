package ims.configuration.gen;


import ims.configuration.AFlag;
import ims.configuration.IFlag;
import ims.framework.utils.Color;

public class ConfigFlag extends ims.configuration.ConfigFlag
{

	public static final class UI extends ims.configuration.ConfigFlag.UI
	{
		public static final StringFlag REPORT_SERVER = new StringFlag(new StringInternalFlag("REPORT_SERVER", "localhost/Reports", "Host Name of Crystal Reports Server"));
		public static final StringFlag REPORTS_DSN = new StringFlag(new StringInternalFlag("REPORTS_DSN", "", "ODBC Data Source Name used by Report ASP pages"));
		public static final StringFlag REPORTS_HOST = new StringFlag(new StringInternalFlag("REPORTS_HOST", "localhost", "Host Name DB Server"));
		public static final StringFlag REPORTS_USER = new StringFlag(new StringInternalFlag("REPORTS_USER", "", "DB Username for Report ASP pages to use"));
		public static final StringFlag REPORTS_PASS = new StringFlag(new StringInternalFlag("REPORTS_PASS", "", "DB Password for Report ASP pages to use"));
		public static final StringFlag STALE_OBJECT_MESSAGE = new StringFlag(new StringInternalFlag("STALE_OBJECT_MESSAGE", "The data has been changed by another user. The screen will be refreshed.", "Message displayed to user when Stale Object Exception occurs.", true));
		public static final StringFlag DISPLAY_NAME_LOCATION = new StringFlag(new StringInternalFlag("DISPLAY_NAME_LOCATION","Location", "Preferred term to use for Location entity. Allowed values are 'Location' and 'Hospital'.", new String[]{"Location", "Hospital"}));
		public static final StringFlag DISPLAY_NAME_SERVICE = new StringFlag(new StringInternalFlag("DISPLAY_NAME_SERVICE", "Service", "Preferred term to use for Service entity. Allowed values are 'Service', 'Specialty' and 'Discipline/Department'.", new String[]{"Service", "Specialty", "Discipline/Department"}));
		public static final StringFlag DISPLAY_NAME_FUNCTION = new StringFlag(new StringInternalFlag("DISPLAY_NAME_FUNCTION","Function", "Preferred term to use for Function entity. Allowed values are 'Function', 'Clinic Type' and 'Not Applicable'.", new String[]{"Function", "Clinic Type", "Not Applicable"}));
		public static final StringFlag DISPLAY_NAME_ACTIVITY = new StringFlag(new StringInternalFlag("DISPLAY_NAME_ACTIVITY", "Activity", "Preferred term to use for Activity entity. Allowed values are 'Activity' and 'Procedure'.", new String[]{"Activity", "Procedure"}));
		public static final StringFlag LOC_SERVICE_TABS = new StringFlag(new StringInternalFlag("LOC_SERVICE_TABS",  "ACT", "Which tab(s) to show in LocationServiceActivity", new String[]{"NONE", "ALL", "ACT","ACT-FUNC","CON","CON-ACT","CON-FUNC","FUNC"}, true));
		public static final StringFlag SERVICE_TABS = new StringFlag(new StringInternalFlag("SERVICE_TABS", "ACT", "Which tab(s) to show in ServiceActivity", new String[]{"NONE", "ALL", "ACT","FUNC"}, true));
		public static final StringFlag ACTIVITY_VIEW = new StringFlag(new StringInternalFlag("ACTIVITY_VIEW", "SCHED", "Activity Screen Functionality is NTPF or Scheduling specific.", new String[]{"SCHED", "NTPF"}, true));
		public static final StringFlag PAT_SEARCH_OPTIONAL_COL_TYPE = new StringFlag(new StringInternalFlag("PAT_SEARCH_OPTIONAL_COL_TYPE", "Ward", "The last column in the patient search needs to be configured to either display the patient's ward (COE) or the patient's contact No (NTPF) ", new String[]{"Ward", "Contact"}, true));
		public static final StringFlag CCI_ADMIN_DEFAULT_TYPE  = new StringFlag(new StringInternalFlag("CCI_ADMIN_DEFAULT_TYPE ", "Allergen", "The default selection for the CCI type", new String[]{"Allergen","Medication","Diagnosis","Problem","Procedure","Vaccine","Cancer Image","Treatment/Intervention","Presenting Issue"}, true));//WDEV-17741
		public static final StringFlag ORDER_ENTRY_UI_TYPE = new StringFlag(new StringInternalFlag("ORDER_ENTRY_UI_TYPE", "Standard", "User Interface used for Order Entry", new String[] {"Standard","CARE_UK","CCO","UKSH"},true));
		public static final StringFlag CAPSCAN_DIST_SEARCH_RADIUS = new StringFlag(new StringInternalFlag("CAPSCAN_DIST_SEARCH_RADIUS", "11", "CAPSCAN Distance Search Radius.",false));
		public static final StringFlag CAPSCAN_DIST_MAX_RECORDS = new StringFlag(new StringInternalFlag("CAPSCAN_DIST_MAX_RECORDS", "10", "CAPSCAN Maximum result records from Distance search.",false));
		public static final BooleanFlag DISPLAY_PCT_CODE  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_PCT_CODE", false, "Displays the Primary Care Group/Trust.", false));
		public static final StringFlag BOOKAPPT_UI_TYPE = new StringFlag(new StringInternalFlag("BOOKAPPT_UI_TYPE", "Standard", "User Interface used for Book Appointment ", new String[] {"Standard", "CARE_UK"}, true));  // FWB-136
		public static final StringFlag HL7_FORMAT_EXPRESSION = new StringFlag(new StringInternalFlag("HL7_FORMAT_EXPRESSION", "EVN|PID|NK1|PV1|PV2|PD1|MRG|MSA|ERR|ORC|OBX|OBX|NTE|MFI|STF|ORG|PRA|LOC|LDP|GOL|PTH", "Regular Expression used to format messages in the test harness"));  // FWB-136
		public static final StringFlag OIT_UPLOAD_URL = new StringFlag(new StringInternalFlag("OIT_UPLOAD_URL", "", "OIT Upload Url",true));
		public static final StringFlag OIT_DOWNLOAD_URL = new StringFlag(new StringInternalFlag("OIT_DOWNLOAD_URL", "", "OIT DownLoad Url",true));
		public static final StringFlag EPRES_URL = new StringFlag(new StringInternalFlag("EPRES_URL", "", "Eprecribing Url",true));
		public static final StringFlag EPRES_MESSAGE_URL = new StringFlag(new StringInternalFlag("EPRES_MESSAGE_URL", "", "Eprecribing Message",true));
		public static final BooleanFlag EPRES_LAUNCH_IE = new BooleanFlag(new BooleanInternalFlag("EPRES_LAUNCH_IE", true, "Launch E-Prescribing in IE."));
		public static final StringFlag OIT_USERKEY6 = new StringFlag(new StringInternalFlag("OIT_USERKEY6", "", "OIT User Key 6",true));
		public static final StringFlag URL_ENCRYPT_TYPE = new StringFlag(new StringInternalFlag("URL_ENCRYPT_TYPE", "UTF-8", "URL encryption type",true));
		public static final StringFlag SOFTCO_PATIENT_SURVEY_URL = new StringFlag(new StringInternalFlag("SOFTCO_PATIENT_SURVEY_URL", "", "URL for Patient Surveys. Used on Discharge Summary screen."));
		public static final StringFlag DEFAULT_ORDER_CATEGORY = new StringFlag(new StringInternalFlag("DEFAULT_ORDER_CATEGORY", "None", "Configures how the default order category is populated",new String[]{"None","Default selected value","Patient Financial Class"})); //FWB-587
				
		public static final StringFlag JAC_APPLICATION_EXECUTABLE_PATH = new StringFlag(new StringInternalFlag("JAC_APPLICATION_EXECUTABLE_PATH", "c:\\jac\\jacrxws.exe", "Specifies the full path for the JAC executable."));
		public static final StringFlag JAC_APPLICATION_FUNCTION = new StringFlag(new StringInternalFlag("JAC_APPLICATION_FUNCTION", "POE", "Specifies the function to be performed when JAC is launched from MAXIMS"));
		
		// Removed as part of FWB-462
//		public static final StringFlag CENTRICITY_SERVER = new StringFlag(new StringInternalFlag("CENTRICITY_SERVER", "", "Specifies the name of the Centricity server."));
//		public static final StringFlag CENTRICITY_USERNAME = new StringFlag(new StringInternalFlag("CENTRICITY_USERNAME", "", "Centricity Username."));
//		public static final StringFlag CENTRICITY_PASSWORD = new StringFlag(new StringInternalFlag("CENTRICITY_PASSWORD", "", "Centricity Password."));
		
		public static final BooleanFlag USE_PACS_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("USE_PACS_FUNCTIONALITY", false, "Set to TRUE if PACS is used on site. If TRUE details of the sites PACS solution should be entered on the PACS Configuration form.", true));  // FWB-462
		
		public static final BooleanFlag DEFAULT_PATIENT_MOBILE_PHONE_AT_REGISTRATION = new BooleanFlag(new BooleanInternalFlag("DEFAULT_PATIENT_MOBILE_PHONE_AT_REGISTRATION", false, "Controls if a Mobile phone number is mandatory during registration of a Patient", true));  // FWB-467
		
		public static final StringFlag MAXIMS_WEBPAS_URL = new StringFlag(new StringInternalFlag("MAXIMS_WEBPAS_URL", "", "Specify URL to launch WebPas "));
		public static final StringFlag SCHEDULING_PATIENT_APPTS_CONSULTANT_DISPLAY  = new StringFlag(new StringInternalFlag("SCHEDULING_PATIENT_APPTS_CONSULTANT_DISPLAY", "Booking Consultant", "Display Listowner or Booking Consultant on patient appointment.",new String[]{"Booking Consultant","Listowner"}));
		public static final StringFlag DISPLAY_AUTHORINGHCP_OR_RESPHCP_ON_DOCUMENT_WORKLIST = new StringFlag(new StringInternalFlag("DISPLAY_AUTHORINGHCP_OR_RESPHCP_ON_DOCUMENT_WORKLIST", "Authoring HCP", "HCP to display on document worklist",new String[]{"Authoring HCP","Responsible HCP"}));
		public static final StringFlag SECONDARY_RESULT_MATCHING_WARNING_MESSAGE = new StringFlag(new StringInternalFlag("SECONDARY_RESULT_MATCHING_WARNING_MESSAGE","Result matched on NHS number - no Hospital number available","Message displayed on result details when patient is matched by secondary identifier"));
		public static final StringFlag BED_INFO_UI_TYPE  = new StringFlag(new StringInternalFlag("BED_INFO_UI_TYPE","WST","Show site specific fields on the Bed Info dialog",new String[]{"WST","CCO","MAXIMS"},true));
		public static final StringFlag DISPLAYED_HCP_ON_PATIENT_DOCUMENT_FORM  = new StringFlag(new StringInternalFlag("DISPLAYED_HCP_ON_PATIENT_DOCUMENT_FORM","Authoring HCP","HCP displayed on the Patient Document Form",new String[]{"Authoring HCP","Responsible HCP "}));
		public static final StringFlag PATIENT_DOCUMENT_DISPLAY_STATUS_COLUMN = new StringFlag(new StringInternalFlag("PATIENT_DOCUMENT_DISPLAY_STATUS_COLUMN","Source","Controls what is displayed in the status column for patient documents",new String[]{"Source","Status"}));//FWB-338
		public static final StringFlag PATIENT_ASSESSMENT_SEARCH_DISPLAY_HCP_COLUMN_TYPE = new StringFlag(new StringInternalFlag("PATIENT_ASSESSMENT_SEARCH_DISPLAY_HCP_COLUMN_TYPE","Authoring HCP","Allows a customer pick which data field is displayed in the HCP column and the column text header(Authoring HCP or Responsible HCP)",new String[]{"Authoring HCP","Responsible HCP"}));//FWB-354
		public static final StringFlag CORRESPONDENCE_SPECIALTY_LIST_ALL_BY = new StringFlag(new StringInternalFlag("CORRESPONDENCE_SPECIALTY_LIST_ALL_BY","Template","Allows a customer control how the correspondence speciality combo is populated",new String[]{"Template","All"}));//FWB-368 
		public static final StringFlag APPLY_SAFETY_QUESTIONNAIRE_VALIDATION_FROM = new StringFlag(new StringInternalFlag("APPLY_SAFETY_QUESTIONNAIRE_VALIDATION_FROM","","Sets the date from which the Safety Questionnaire is mandatory when booking a clinical imaging appointment. Must be formatted as DD/MM/YYYY",true));//FWB-369
		public static final StringFlag CUSTOM_PATIENT_LIST_ACCESS_TYPE = new StringFlag(new StringInternalFlag("CUSTOM_PATIENT_LIST_ACCESS_TYPE","MOS","Controls access to the custom patient list",new String[]{"MOS","HCP"}));//FWB-377
		public static final StringFlag PATIENT_REGISTRATION_DEFAULT_CASEFOLDER_LOCATION = new StringFlag(new StringInternalFlag("PATIENT_REGISTRATION_DEFAULT_CASEFOLDER_LOCATION","CXX","Allows a customer set the default casefolder location for PAS registrations"));//FWB-387
		public static final StringFlag NEURO_MOTOR_DATA_ENTRY = new StringFlag(new StringInternalFlag("NEURO_MOTOR_DATA_ENTRY","MOS","Controls level at which the Neurological Examination Motor is recorded",new String[]{"CareContext","ClinicalContact"}));//FWB-397
		public static final StringFlag CATEGORIES_MANDATORY_ORDER_PRIORITY = new StringFlag(new StringInternalFlag("CATEGORIES_MANDATORY_ORDER_PRIORITY","None","Controls ordering categories where order priority is mandatory",new String[]{"None","ClinicalImaging","Pathology","ClinicalImagingAndPathology"}));//FWB-447
		public static final StringFlag PATIENT_DOCUMENTS_VIEW_DRAFT_WARNING_MESSAGE = new StringFlag(new StringInternalFlag("PATIENT_DOCUMENTS_VIEW_DRAFT_WARNING_MESSAGE","","Warning message when viewing a draft patient document"));//FWB-492
		public static final StringFlag WARD_VIEW_RHS_TYPE = new StringFlag(new StringInternalFlag("WARD_VIEW_RHS_TYPE", "Ward Summary", "Controls what is displayed on the Ward View RHS", new String[] {"Ward Summary", "Patients Summary"}));//FWB-554
		public static final StringFlag DIAGNOSIS_SEARCHING_MECHANISM = new StringFlag(new StringInternalFlag("DIAGNOSIS_SEARCHING_MECHANISM", "Query", "Controls how diagnosis search is implemented", new String[] {"Query", "Live"}));//FWB-592
		
		public static final BooleanFlag SEARCH_REQ_FORENAME = new BooleanFlag(new BooleanInternalFlag("SEARCH_REQ_FORENAME", true, "Determines whether Forename is required on Patient Search."));
		public static final BooleanFlag DEMOGRAPHICS_USE_POSTCODE = new BooleanFlag(new BooleanInternalFlag("DEMOGRAPHICS_USE_POSTCODE", true, "Determines if POSTCODE or COUNTY will be used on Demographics screen.", true));
		public static final BooleanFlag CAREPLAN_CONFIRMED_BY_DETAILS = new BooleanFlag(new BooleanInternalFlag("CAREPLAN_CONFIRMED_BY_DETAILS", true, "Determines whether evaluation time on Care Plan is displayed or not."));
		public static final BooleanFlag CAREPLAN_CARE_AS_PLANNED = new BooleanFlag(new BooleanInternalFlag("CAREPLAN_CARE_AS_PLANNED", false, "Determines whether Care As Planned checkbox is displayed or not."));
		public static final BooleanFlag DISPLAY_CAREPLAN_NOTE_LINK = new BooleanFlag(new BooleanInternalFlag("DISPLAY_CAREPLAN_NOTE_LINK", true, "Determines whether Clinical Notes hyper link on Care Plan Details is displayed or not."));
		public static final BooleanFlag SVC_FCN_LOC_USE  = new BooleanFlag(new BooleanInternalFlag("SVC_FCN_LOC_USE", true, "Determines whether the configured set of functions for a service will be used when that service is associated with a Location.", true));
		public static final BooleanFlag SVC_FCN_HCP_USE  = new BooleanFlag(new BooleanInternalFlag("SVC_FCN_HCP_USE", true, "Determines whether the configured set of functions for a service will be used when that service is associated with a HCP.", true));
		public static final BooleanFlag DISCHARGE_LETTERS_SUPPLEMENTARY_BUTTON = new BooleanFlag(new BooleanInternalFlag("DISCHARGE_LETTERS_SUPPLEMENTARY_BUTTON", true, "Specifies whether to display the Supplementary Button."));
		public static final BooleanFlag LOC_SERVICE_LOCATIONS  = new BooleanFlag(new BooleanInternalFlag("LOC_SERVICE_LOCATIONS", false, "Determines whether to show Locations under a LocationSite when configuring Location Services ."));		
		public static final BooleanFlag DISABLE_EXTERNAL_CODE_TYPE = new BooleanFlag(new BooleanInternalFlag("DISABLE_EXTERNAL_CODE_TYPE", true, "This will disable the external code type on the Taxonomy Search dialog when used by clinical users to add to hotlists, as in the Past Medical History and Medication on Admission"));
		public static final BooleanFlag ROOT_CLIN_CONTACT_USE_MENU = new BooleanFlag(new BooleanInternalFlag("ROOT_CLIN_CONTACT_USE_MENU", false, "Controls how New Root Clinical Contact is done on Episode List Form. Using 'NEW' Button, or right click menu.", true));
		public static final BooleanFlag SHOW_LOOKUP_POS  = new BooleanFlag(new BooleanInternalFlag("SHOW_LOOKUP_POS", false, "Determines whether to show the lookup instance position in the Lookup Admin form."));
		public static final BooleanFlag ROOT_CLIN_CONTACT_ALLOW_END_DATE  = new BooleanFlag(new BooleanInternalFlag("ROOT_CLIN_CONTACT_ALLOW_END_DATE", false, "Determines whether to enable the End Date functionality on the Clinical Contact Dialog.", true));
		public static final BooleanFlag NOK_MULTIPLE_COMMUNICATION_CHANNELS = new BooleanFlag(new BooleanInternalFlag("NOK_MULTIPLE_COMMUNICATION_CHANNELS", true, "If this is set to false the NOK contact communication details will only consist of 'phone'. If true the NOK can have a collection of communication channels", true));
		public static final BooleanFlag CONFIRM_FOR_STUDENT_NURSE = new BooleanFlag(new BooleanInternalFlag("CONFIRM_FOR_STUDENT_NURSE", true, "CarePlan Confirmation required for Student Nurse", true));
		public static final BooleanFlag PATIENT_SUMMARY_CDI_DISPLAY = new BooleanFlag(new BooleanInternalFlag("PATIENT_SUMMARY_CDI_DISPLAY", true, "Determines whether the CDI Information is displayed on the patient summary screen", true));
		public static final BooleanFlag MEDEXAMGEN_DISPLAY_PROBLEMS_GRID = new BooleanFlag(new BooleanInternalFlag("MEDEXAMGEN_DISPLAY_PROBLEMS_GRID", true, "Show/Hide Med Exam General problems grid ", true));
		public static final BooleanFlag CSP_AUTOSET_RECIPIENT_TO_GP = new BooleanFlag(new BooleanInternalFlag("CSP_AUTOSET_RECIPIENT_TO_GP", false, "Automatically set correspondence recipient to the patient's GP", true));
		public static final BooleanFlag OCS_ONE_ROW_SPECIMEN = new BooleanFlag(new BooleanInternalFlag("OCS_ONE_ROW_SPECIMEN", false, "If true, on lists of Pathology Results, if specimen has only one investigation it will be shown on one line of the grid"));
		public static final BooleanFlag ORG_LOC_SHOW_CHECKS = new BooleanFlag(new BooleanInternalFlag("ORG_LOC_SHOW_CHECKS", false, "If true, shows check boxes on OrgLoc Admin to set NTPF attributes of Orgs and Loc. (e.g Referring Hospial etc.)", true));
		public static final BooleanFlag HIDE_VS_SECS_EDIT = new BooleanFlag(new BooleanInternalFlag("HIDE_VS_SECS_EDIT", true, "Show/Hide 'SECS Action taken' edit control.)", true));
		public static final BooleanFlag SOCIAL_HIS_DISPLAY_MARR_DATE = new BooleanFlag(new BooleanInternalFlag("SOCIAL_HIS_DISPLAY_MARR_DATE", true, "Display Marital Status Date on Social History Screen.)"));
		public static final BooleanFlag AUTHORING_INFO_COMPONENT_ISREADONLY = new BooleanFlag(new BooleanInternalFlag("AUTHORING_INFO_COMPONENT_ISREADONLY", false, "Sets if the authoring information component is to appear always as read only. If False then the component will allow data entry.", true));		
		public static final BooleanFlag ENABLE_PRICING_CONTEXT_CHECK  = new BooleanFlag(new BooleanInternalFlag("ENABLE_PRICING_CONTEXT_CHECK", true, "Enables/Disables the Pricing Context check functionality.", true));		
		public static final BooleanFlag ENABLE_CREATE_LOCALL_BUTTON  = new BooleanFlag(new BooleanInternalFlag("ENABLE_CREATE_LOCALL_BUTTON", true, "Enables/Disables the Create Locall button on the Waiting List screen.", true));		
		public static final BooleanFlag DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCH  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_ADDRESS_AND_COUNTY_PATIENT_SEARCH", false, "Displays the Address and County within Patient Search criteria.", true));		
		public static final BooleanFlag DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCH  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_OPTIONAL_COLUMN_PATIENT_SEARCH", false, "Displays the optional column (ward or contact) within the results grid on Patient Search.", true));		
		public static final BooleanFlag OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME  = new BooleanFlag(new BooleanInternalFlag("OCRR_APPEND_PROVER_SERVICE_NAME_TO_INVESTIGATION_NAME", true, "Appends the Provider Service Name to the Investigation name.", true));		
		public static final BooleanFlag INPAT_CREATE_CORRESPONDENCE_DETAILS  = new BooleanFlag(new BooleanInternalFlag("INPAT_CREATE_CORRESPONDENCE_DETAILS", false, "Indicates if the context menu for creating correspondence details is shown on selecting an Inpatient List item", true));		
		public static final BooleanFlag OUTPAT_CREATE_CORRESPONDENCE_DETAILS  = new BooleanFlag(new BooleanInternalFlag("OUTPAT_CREATE_CORRESPONDENCE_DETAILS ", false, "Indicates if the context menu for creating correspondence details is shown on selecting an Outpatient List item", true));
		public static final BooleanFlag INPATIENT_LIST_SHOW_ADT_MENU  = new BooleanFlag(new BooleanInternalFlag("INPATIENT_LIST_SHOW_ADT_MENU ", false, "To control the visibility of the ADT menu on the Core.Inpatient list form", true));
		public static final BooleanFlag USE_CANCER_IMAGING = new BooleanFlag(new BooleanInternalFlag("USE_CANCER_IMAGING ", false, "Allows the use of Cancer Imaging Event objects", true));
		public static final BooleanFlag USE_PAS_CONTACT_FOR_CORRESPONDENCE = new BooleanFlag(new BooleanInternalFlag("USE_PAS_CONTACT_FOR_CORRESPONDENCE  ", false, "Set to true for Correspondence to list by PAS_CONTACT. Set to false to list by PASEVENT.", true));
		public static final BooleanFlag MANDATORY_MOS_ACCREDITATION_STATUS  = new BooleanFlag(new BooleanInternalFlag("MANDATORY_MOS_ACCREDITATION_STATUS   ", false, "Set to TRUE to ensure MOS locations have an accreditation status.", false));
		public static final BooleanFlag STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED = new BooleanFlag(new BooleanInternalFlag("STOP_CLINICAL_DATACREATION_IFENDDATE_SUPPLIED", false, "Discontune creation of episodes,carespells etc. if end date supplied at parent level.", true));
		public static final BooleanFlag DISPLAY_BED_NUMBER_FOR_CARECONTEXT  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_BED_NUMBER_FOR_CARECONTEXT ", false, "To be used on the CareSpell dialog to control if the bed number field and label gets displayed.", true));
		public static final BooleanFlag CARE_SPELL_ALLOW_FUTURE_DATES  = new BooleanFlag(new BooleanInternalFlag("CARE_SPELL_ALLOW_FUTURE_DATES ", true, "Allow/Disallow Future Dates on the Care Spell Dialog.", true));  // FWB-101
		public static final BooleanFlag CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWID  = new BooleanFlag(new BooleanInternalFlag("CARE_SPELL_CREATE_PAS_EVENT_FROM_WORKFLOWID", false, "Creates a PAS event from workflow ID. Used for data import.", true));
		public static final BooleanFlag DISABLE_NO_SUITABLE_TERM_FOUND_ITEM  = new BooleanFlag(new BooleanInternalFlag("DISABLE_NO_SUITABLE_TERM_FOUND_ITEM", false, " Disables the display of the \"No Suitable Term Found\" item when searching for taxonomies.", false));
		public static final BooleanFlag POSTCODE_ADDRESS_PROVIDER  = new BooleanFlag(new BooleanInternalFlag("POSTCODE_ADDRESS_PROVIDER   ", false, "Address provider to be used to lookup address based on POSTCODE. Access on Demographics screen.", true));
		public static final BooleanFlag RETRIEVE_PAS_EPISODES_VIA_DTO  = new BooleanFlag(new BooleanInternalFlag("RETRIEVE_PAS_EPISODES_VIA_DTO   ", false, "To be used on the CareSpell dialog to control if Pas Episodes are retrieved from MAXIMS pasevents or via a DTO Call (required for COE)", true));
		public static final BooleanFlag CAN_CHANGE_PROCEDURE_NAME_AFTER_EXPORTED_TO_EXCHEQUER   = new BooleanFlag(new BooleanInternalFlag("CAN_CHANGE_PROCEDURE_NAME_AFTER_EXPORTED_TO_EXCHEQUER", true, "Controls changes to a Procedure Name after it has be exported to the Exchequer.", false));
		public static final BooleanFlag INCLUDE_WILDCARD_CHAR_FOR_DTO_LISTS  = new BooleanFlag(new BooleanInternalFlag("INCLUDE_WILDCARD_CHAR_FOR_DTO_LISTS", false, "To be used within the patient search to include or exclude wildcard character for search on surname and forename (Irish PAS does not do any wildcard searches)", true));
		public static final BooleanFlag RESTRICT_TAXONOMY_ACCESS = new BooleanFlag(new BooleanInternalFlag("RESTRICT_TAXONOMY_ACCESS", false, "Used to Restrict access and functionality on a Site.", false));
		public static final BooleanFlag CONTEXT_SEARCH_ENABLED = new BooleanFlag(new BooleanInternalFlag("CONTEXT_SEARCH_ENABLED", true, "Controls the use of the the Care Context Search Component.", true));
		public static final BooleanFlag USE_EARLY_WARNING_SYSTEM = new BooleanFlag(new BooleanInternalFlag("USE_EARLY_WARNING_SYSTEM", false, "Show Early Warning System controls on VitalSigns screen and configure trigger to Early Warning System ", false));
		public static final BooleanFlag CAPSCAN_ENABLED = new BooleanFlag(new BooleanInternalFlag("CAPSCAN_ENABLED", false, "CAPSCAN adress and poscode verification.", true));
		public static final BooleanFlag DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORM = new BooleanFlag(new BooleanInternalFlag("DISPLAY_HOSPNO_FIELD_ON_RESULTS_FORM", true, "Controls the display of the HOSPNO field on the results dialog", true));
		public static final BooleanFlag ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROP = new BooleanFlag(new BooleanInternalFlag("ORGANISATION_CONFIG_ALLOW_DRAG_AND_DROP",true,"If true allows drag and drop functionality on the organisation and location config screen",true));
		public static final BooleanFlag IS_DNA_JOB_SCHEDULED =new BooleanFlag(new BooleanInternalFlag("IS_DNA_JOB_SCHEDULED",false,"Is there any job for updating the status of the patients scheduled?"));
		public static final BooleanFlag ALLOW_CLINICALNOTES_WHEN_ORDERING = new BooleanFlag(new BooleanInternalFlag("ALLOW_CLINICALNOTES_WHEN_ORDERING",true,"If Lab System doesn't support this data capture hide the 'Addtional Clinical Notes' text box on MyOrder")); 
		public static final BooleanFlag DISPLAY_ASSESSMENT_SPECIALTY_TAB = new BooleanFlag(new BooleanInternalFlag("DISPLAY_ASSESSMENT_SPECIALTY_TAB",false,"Shows the Specialty tab on the Structured Assessment config screen", true));
		public static final BooleanFlag CAN_CONFIGURE_THEATRE_PROFILES = new BooleanFlag(new BooleanInternalFlag("CAN_CONFIGURE_THEATRE_PROFILES",false,"Shows the CAN_CONFIGURE_THEATRE_PROFILES checkbox on the scheduling profiles screen"));
		public static final BooleanFlag ALLOW_ONLY_ONE_CLINICAL_NOTE  = new BooleanFlag(new BooleanInternalFlag("ALLOW_ONLY_ONE_CLINICAL_NOTE",true,"Restricts number of Patient Clinical notes to 1 OR allows any number."));
		public static final BooleanFlag DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARY  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_WORKLIST_CONTACT_TYPE_ON_PATIENT_SUMMARY",false,"Displays Worklist Contact Type on Patient Summary Grid ."));//FWB-198
		public static final BooleanFlag ORDERING_PATIENTMOBILITY_MANDATORY = new BooleanFlag(new BooleanInternalFlag("ORDERING_PATIENTMOBILITY_MANDATORY",false,"Option to mark Patient Mobility as mandatory on MyOrder"));//FWB-226
		public static final BooleanFlag ALLOW_IP_EPISODES_IN_EDISCHARGE_ONLY = new BooleanFlag(new BooleanInternalFlag("ALLOW_IP_EPISODES_IN_EDISCHARGE_ONLY",true,"Option to only allow an eDischarge to be created for In-Patient Episodes if TRUE. When set to FALSE then Out-Patient episodes can also create eDischarges."));//FWB-227
		public static final BooleanFlag LINK_REFERRAL_CODING_TO_PAS_EVENT = new BooleanFlag(new BooleanInternalFlag("LINK_REFERRAL_CODING_TO_PAS_EVENT",true,"Option to link a PAS EVENT with a Referral Coding record. When set to FALSE the PAS Event combo on the Referral Coding will be hidden and no link saved in the Referral Coding screen."));//FWB-232
		public static final BooleanFlag DISABLE_MULTI_SITE_CATS_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("DISABLE_MULTI_SITE_CATS_FUNCTIONALITY",true,"Option to allow multi-site functionality for CATS",true));//FWB-244
		public static final BooleanFlag HIDE_REPORT_TO_FIELD_WHEN_ORDERING = new BooleanFlag(new BooleanInternalFlag("HIDE_REPORT_TO_FIELD_WHEN_ORDERING",false,"Hides the report to field on the Ordering Screen/form"));//FWB-245
		public static final BooleanFlag COPY_LAST_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("COPY_LAST_FUNCTIONALITY",false,"Enable Copy Last functionality on Nursing screens."));//FWB-253 
		public static final BooleanFlag HIDE_APPOINTMENT_TIME_FOR_RADIOLOGY = new BooleanFlag(new BooleanInternalFlag("HIDE_APPOINTMENT_TIME_FOR_RADIOLOGY",false,"Order/Results Lists - Radiology: hides the appointment time on Appt date/Time column but displays the appointment date only.",true));//FWB-256
		public static final BooleanFlag DISPLAY_ANE_BEDMANAGEMENT  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_ANE_BEDMANAGEMENT ",true,"Ability to show/hide A&E tabs/functionality in Bed Mangement Module.",true));//FWD-198
		public static final BooleanFlag DISPLAY_RESULT_PATIENT_DETAILS_LINK  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_RESULT_PATIENT_DETAILS_LINK ",false,"show or hide a link called View Patient Details",true));//FWB-265
		public static final BooleanFlag ORDERING_PATIENTMOBILITY_VISIBLE  = new BooleanFlag(new BooleanInternalFlag("ORDERING_PATIENTMOBILITY_VISIBLE",true,"Option to mark Patient Mobility as invisible on MyOrder.")); // FWD-201
		public static final BooleanFlag ORDERING_ORDERCATEGORY_MANDATORY  = new BooleanFlag(new BooleanInternalFlag("ORDERING_ORDERCATEGORY_MANDATORY",false,"Option to mark Order Category as mandatory on MyOrder.", true)); // FWD-202
		public static final BooleanFlag DISPLAY_PATIENT_IMAGE = new BooleanFlag(new BooleanInternalFlag("DISPLAY_PATIENT_IMAGE",true,"Display/Hide Patient Image in Demographics.",true));//FWD-206 
		public static final BooleanFlag ON_PATIENT_SEARCH_CLEAR_SELECTED_PATIENT_CONTEXTS = new BooleanFlag(new BooleanInternalFlag("ON_PATIENT_SEARCH_CLEAR_SELECTED_PATIENT_CONTEXTS ",false,"Clear selected patient contexts on search.",false));//FWB-282
		public static final BooleanFlag ALLOW_PATIENT_ICP_CREATION_FROM_PATIENT_SUMMARY = new BooleanFlag(new BooleanInternalFlag("ALLOW_PATIENT_ICP_CREATION_FROM_PATIENT_SUMMARY",false,"Allow the creation of a Patient ICP from the Patient Summary.",false));//FWB-282
		public static final BooleanFlag EXTENDED_MEDICATION_DATASET = new BooleanFlag(new BooleanInternalFlag("EXTENDED_MEDICATION_DATASET",false,"Allow the use of the extended Medication dataset.",true));//FWB-287
		public static final BooleanFlag DISPLAY_WARNING_MESSAGE_IF_BOOKING_IN_PAST  = new BooleanFlag(new BooleanInternalFlag("DISPLAY_WARNING_MESSAGE_IF_BOOKING_IN_PAST",true,"If the selected appointment date is in the past a warning message will be displayed - applies to OPD and Theatre Booking."));//FWB-291
		public static final BooleanFlag SHOW_CRITICAL_EVENTS_ON_PATIENT_ICP  = new BooleanFlag(new BooleanInternalFlag("SHOW_CRITICAL_EVENTS_ON_PATIENT_ICP",false,"Show critical events on patients ICP"));//FWB-296
		public static final BooleanFlag USE_GENERIC_CHEMOTHERAPY_CYCLE_AND_DRUG_DETAILS = new BooleanFlag(new BooleanInternalFlag("USE_GENERIC_CHEMOTHERAPY_CYCLE_AND_DRUG_DETAILS",true,"Use generic chemotherapy cycle and drug details."));//FWB-304
		public static final BooleanFlag CORRESPONDENCE_KEEP_PATIENT_SELECTED = new BooleanFlag(new BooleanInternalFlag("CORRESPONDENCE_KEEP_PATIENT_SELECTED",true,"Keep patient selected after correspondence dialogs closed."));//FWB-306
		public static final BooleanFlag OCS_ORDERING_DISPLAY_BLOOD_VOLUMES = new BooleanFlag(new BooleanInternalFlag("OCS_ORDERING_DISPLAY_BLOOD_VOLUMES",false,"When Ordering display the blood volumes for each investigation."));//FWB-305
		public static final BooleanFlag ASSESSMENTS_SET_AUTHORING_AND_COMPLETING_DETAILS_AS_READ_ONLY = new BooleanFlag(new BooleanInternalFlag("ASSESSMENTS_SET_AUTHORING_AND_COMPLETING_DETAILS_AS_READ_ONLY",false,"Assessments set Authoring and Completing details as read only."));//FWB-311		
		public static final BooleanFlag GENERATE_EDISCHARGE_DOCS_FOR_DEAD_PATIENTS = new BooleanFlag(new BooleanInternalFlag("GENERATE_EDISCHARGE_DOCS_FOR_DEAD_PATIENTS",false,"Generate EDischarge Documents for Dead Patients"));//FWB-312
		public static final BooleanFlag PATIENT_DOCUMENTS_FORM_ALLOW_CREATION_OF_NEW_DOCUMENTS = new BooleanFlag(new BooleanInternalFlag("PATIENT_DOCUMENTS_FORM_ALLOW_CREATION_OF_NEW_DOCUMENTS",false,"Flag to control if new documents can or cannot be created from the patient documents form"));//FWB-313
		public static final BooleanFlag PATIENT_DOCUMENTS_DISPLAY_EPISODEOFCARE_IN_SEARCH_CRITERIA  = new BooleanFlag(new BooleanInternalFlag("PATIENT_DOCUMENTS_DISPLAY_EPISODEOFCARE_IN_SEARCH_CRITERIA",true,"Controls the display of the search criteria field 'episode of care' on Patient Documents form"));//FWB-314
		public static final BooleanFlag SHOW_VITAL_SIGNS_METRIC_CONTROLS = new BooleanFlag(new BooleanInternalFlag("SHOW_VITAL_SIGNS_METRIC_CONTROLS",true,"Controls the display of the vital signs metric controls"));//FWB-320
		public static final BooleanFlag SHOW_CASENOTEFOLDER_ON_DEMOGRAPHICS = new BooleanFlag(new BooleanInternalFlag("SHOW_CASENOTEFOLDER_ON_DEMOGRAPHICS",false,"Shows the case note folder on the deomgraphics form"));//FWB-322 
		public static final BooleanFlag ADT_VIEW_ADMISSIONDETAILS_FROM_BED  = new BooleanFlag(new BooleanInternalFlag("ADT_VIEW_ADMISSIONDETAILS_FROM_BED",false,"Shows the admission details from the bed view")); //FWB-328
		public static final BooleanFlag SAVE_PATIENTDOCUMENT_ON_ASSESSMENTCOMPLETED  = new BooleanFlag(new BooleanInternalFlag("SAVE_PATIENTDOCUMENT_ON_ASSESSMENTCOMPLETED",false,"Save completed assssments as PatientDocuments")); //FWB-330
		public static final BooleanFlag DEFAULT_DOCUMENT_TO_CONTEXT_DATE = new BooleanFlag(new BooleanInternalFlag("DEFAULT_DOCUMENT_TO_CONTEXT_DATE",false,"Sets the document event date to the selected care context date, otherwise today.")); //FWB-337
		public static final BooleanFlag PLANNED_PROCEDURES_TO_BE_CREATED_VIA_SFS = new BooleanFlag(new BooleanInternalFlag("PLANNED_PROCEDURES_TO_BE_CREATED_VIA_SFS",false,"Only create planned procedures as part of a suitable for surgery record.",true)); //FWB-341
		public static final BooleanFlag DISPLAY_DEFAULT_VALUES_FOR_MEDICATION_ON_CCI_ADMIN = new BooleanFlag(new BooleanInternalFlag("DISPLAY_DEFAULT_VALUES_FOR_MEDICATION_ON_CCI_ADMIN",false,"Display default values for medication on the CCI admin form")); //FWB-342
		public static final BooleanFlag REFERRAL_DETAILS_DISPLAY_NEAREST_TREATMENT_CENTRE = new BooleanFlag(new BooleanInternalFlag("REFERRAL_DETAILS_DISPLAY_NEAREST_TREATMENT_CENTRE",false,"If TRUE the nearest treatment centre will be displayed when registering a referral.")); //FWB-345
		public static final BooleanFlag CLEAR_PATIENT_CONTEXTS_ON_SELECTION_OF_PATIENT_SEARCH_FORM = new BooleanFlag(new BooleanInternalFlag("CLEAR_PATIENT_CONTEXTS_ON_SELECTION_OF_PATIENT_SEARCH_FORM",false,"If set to TRUE this will clear any selected patient contexts on selection of the patient search form or the search button on the form")); //FWB-347
		public static final BooleanFlag DEFAULT_CONSULTANT_AND_WARD_ON_INPATIENT_ICP_FORM = new BooleanFlag(new BooleanInternalFlag("DEFAULT_CONSULTANT_AND_WARD_ON_INPATIENT_ICP_FORM",true,"Allows the customer to set if the consutlant and ward are to be defaulted on the inpatient list with ICP actions form")); //FWB-350
		public static final BooleanFlag PATIENT_ASSESSMENT_CREATION_REQUIRES_A_CLINICAL_CONTACT_CONTEXT = new BooleanFlag(new BooleanInternalFlag("PATIENT_ASSESSMENT_CREATION_REQUIRES_A_CLINICAL_CONTACT_CONTEXT",false,"If set to TRUE a clinical contact must be selected for a UDA or GRAPHICAL Assessment to be started")); //FWB-352
		public static final BooleanFlag SPECIALTY_MANDATORY_ON_CREATION_OF_A_CLINICAL_CONTACT = new BooleanFlag(new BooleanInternalFlag("SPECIALTY_MANDATORY_ON_CREATION_OF_A_CLINICAL_CONTACT",false,"If set to TRUE the specialty field is to be mandatory on the creation of a clinical contact")); //FWB-353
		public static final BooleanFlag HIDE_MERGED_PATIENTS_ON_PATIENT_SEARCH = new BooleanFlag(new BooleanInternalFlag("HIDE_MERGED_PATIENTS_ON_PATIENT_SEARCH",false,"This flag (when TRUE) will mean that Merged Patients will not be shown on the Patient Search form")); //FWB-585
		
		public static final BooleanFlag DOCUMENT_WORKLIST_DISPLAY_PATIENT_ID_SEARCH_FIELD = new BooleanFlag(new BooleanInternalFlag("DOCUMENT_WORKLIST_DISPLAY_PATIENT_ID_SEARCH_FIELD",false,"If set to TRUE the document worklist displays patient id search")); //FWB-355
		public static final BooleanFlag DOCUMENT_WORKLIST_DISPLAY_VIEW_DOCUMENTS_FOR_PATIENT_CHECKBOX = new BooleanFlag(new BooleanInternalFlag("DOCUMENT_WORKLIST_DISPLAY_VIEW_DOCUMENTS_FOR_PATIENT_CHECKBOX",false,"If set to TRUE View documents for selected patient is visable")); //FWB-356
		public static final BooleanFlag DOCUMENT_WORKLIST_DISPLAY_KEEP_SELECTED_PATIENT_CHECKBOX = new BooleanFlag(new BooleanInternalFlag("DOCUMENT_WORKLIST_DISPLAY_KEEP_SELECTED_PATIENT_CHECKBOX",false,"If set to TRUE the Keep selected Patient Record Open after viewing editing document is visible")); //FWB-357
		public static final BooleanFlag DOCUMENT_WORKLIST_DISPLAY_BATCH_BUTTON = new BooleanFlag(new BooleanInternalFlag("DOCUMENT_WORKLIST_DISPLAY_BATCH_BUTTON",true,"Controls if Batch button is displayed"));//FWB-358
		public static final BooleanFlag CUMULATIVE_RESULTS_DISPLAY_REF_RANGE_COLUMN = new BooleanFlag(new BooleanInternalFlag("CUMULATIVE_RESULTS_DISPLAY_REF_RANGE_COLUMN",true,"Controls if the reference range is to be displayed on the tabular cumulative results"));//FWB-361
		public static final BooleanFlag SHOW_OTHER_NAMES_BUTTON = new BooleanFlag(new BooleanInternalFlag("SHOW_OTHER_NAMES_BUTTON",true,"Controls if the Other Names button is displayed on the demographics form"));//FWB-371
		public static final BooleanFlag OCS_ORDER_DEFAULT_RESPONSIBLE_HCP_TO_LOGGED_ON_USER = new BooleanFlag(new BooleanInternalFlag("OCS_ORDER_DEFAULT_RESPONSIBLE_HCP_TO_LOGGED_ON_USER",false,"Controls if the Responsible Clinican field when ordering is defaulted with the current logged on user details"));//FWB-372
		public static final BooleanFlag CORRESPONDENCE_DISPLAY_PATIENT_SUMMARY_NOTE_COMBO = new BooleanFlag(new BooleanInternalFlag("CORRESPONDENCE_DISPLAY_PATIENT_SUMMARY_NOTE_COMBO",false,"Shows the patient summary combo when creating correspondence"));//FWB-373
		public static final BooleanFlag OCS_ORDERING_DEFAULT_HOSPITAL_AND_OP_DEPT_TO_BLANK = new BooleanFlag(new BooleanInternalFlag("OCS_ORDERING_DEFAULT_HOSPITAL_AND_OP_DEPT_TO_BLANK ",false,"Control the behaviour for defaulting hospital and OP department when ordering. If TRUE then the fields will be blank by default"));//FWB-378
		public static final BooleanFlag PATIENT_SEARCH_CLEAR_ALL_CONTEXTS_ON_SELECTION_OF_CLEAR = new BooleanFlag(new BooleanInternalFlag("PATIENT_SEARCH_CLEAR_ALL_CONTEXTS_ON_SELECTION_OF_CLEAR",false,"Controls if the currently selected patient contexts are cleared when the the clear button is selected on patient search "));//FWB-381
		public static final BooleanFlag DEMOGRAPHICS_ALLOW_CREATION_OF_HISTORICAL_ADDRESS = new BooleanFlag(new BooleanInternalFlag("DEMOGRAPHICS_ALLOW_CREATION_OF_HISTORICAL_ADDRESS",false,"Allows the creation of historical address from the demographics form"));//FWB-389
		public static final BooleanFlag PATIENT_SUMMARY_SHOW_CANCELLED_CONTEXTS_BY_DEFAULT = new BooleanFlag(new BooleanInternalFlag("PATIENT_SUMMARY_SHOW_CANCELLED_CONTEXTS_BY_DEFAULT",false,"On Patient Summary screen cancelled contexts are hidden by default, if set to TRUE they will be shown by default"));//FWB-392
		public static final BooleanFlag SHOW_PREFERRED_LANGUAGE_ON_DEMOGRAPHICS = new BooleanFlag(new BooleanInternalFlag("SHOW_PREFERRED_LANGUAGE_ON_DEMOGRAPHICS",false,"Displays the PreferredCommunicationLanguage combo on the demographics form")); //FWB-400
		public static final BooleanFlag PCT_CODE_VALIDAT_OVERRIDE = new BooleanFlag(new BooleanInternalFlag("PCT_CODE_VALIDAT_OVERRIDE", true, "Override PCT Code validation."));
		public static final BooleanFlag DISPLAY_SPECIMEN_TYPE_AT_INVESTIGATION_LEVEL = new BooleanFlag(new BooleanInternalFlag("DISPLAY_SPECIMEN_TYPE_AT_INVESTIGATION_LEVEL", false, "Controls if the Specimen is displayed at the Specimen or the Investigation level."));//FWB-406
		public static final BooleanFlag ORDERING_DISPLAY_SUMMARY_CLINICAL_INFO = new BooleanFlag(new BooleanInternalFlag("ORDERING_DISPLAY_SUMMARY_CLINICAL_INFO", false, "Display the Summary Clinical Information tab during Ordering."));//FWB-409
		
		public static final BooleanFlag HW_MEASURED_ESTIMATED_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("HW_MEASURED_ESTIMATED_FUNCTIONALITY", false, "Display or Hide Height/Weight Measured/Estimated controls and messages"));//FWB-404
		public static final BooleanFlag DISPLAY_INVESTIGATION_COMMENTS_ON_CUMULATE_RESULTS = new BooleanFlag(new BooleanInternalFlag("DISPLAY_INVESTIGATION_COMMENTS_ON_CUMULATE_RESULTS", false, "Display Investigation comments on cumulate results"));//FWB-410
		public static final BooleanFlag STHK_MODE_RESULT_CHECK = new BooleanFlag(new BooleanInternalFlag("STHK_MODE_RESULT_CHECK", false, "Applies the STHK rules when marking results as checked",true));//FWB-415
		public static final BooleanFlag NEW_RESULTS_ALLOW_RETRIEVAL_BY_THE_CURRENT_RESPONSIBLE_CONSULTANT_FOR_PATIENT = new BooleanFlag(new BooleanInternalFlag("NEW_RESULTS_ALLOW_RETRIEVAL_BY_THE_CURRENT_RESPONSIBLE_CONSULTANT_FOR_PATIENT", true, "On New Results shows the Current Resp. Clinician search option"));//FWB-418
		
		public static final BooleanFlag DISPLAY_EXTENDED_OBS_DATA_SET = new BooleanFlag(new BooleanInternalFlag("DISPLAY_EXTENDED_OBS_DATA_SET", false, "Show extended observation data set"));//FWB-420
		
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_SCHOOL = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_SCHOOL", true, "Show school on ED attendance details"));//FWB-421 
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_OCCUPATION = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_OCCUPATION", true, "Show occupation on ED attendance details"));//FWB-421 
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_OCCUPATION_STATUS  = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_OCCUPATION_STATUS", true, "Show occupation status on ED attendance details"));//FWB-421 
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_EMPLOYER = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_EMPLOYER", true, "Show employer on ED attendance details"));//FWB-421 
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_URGENCY = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_URGENCY", true, "Show urgency on ED attendance details"));//FWB-421 
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_TRIAGE_CATEGORY = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_TRIAGE_CATEGORY", true, "Show triage category on ED attendance details"));//FWB-421 
		public static final BooleanFlag ED_ATTENDANCE_DETAILS_SHOW_CONSULTANT = new BooleanFlag(new BooleanInternalFlag("ED_ATTENDANCE_DETAILS_SHOW_CONSULTANT", true, "Show consultant on ED attendance details"));//FWB-421
		public static final BooleanFlag ED_TRANSFER_TO_OTHER_HOSPITAL = new BooleanFlag(new BooleanInternalFlag("ED_TRANSFER_TO_OTHER_HOSPITAL", false, "In ED shows the external transfer button."));//FWB-451
		public static final BooleanFlag ED_ALLOW_ORDERING = new BooleanFlag(new BooleanInternalFlag("ED_ALLOW_ORDERING", true, "Allows OCS orders to be placed from within ED forms.",true));//FWB-520
		public static final BooleanFlag ED_SHOW_DISCHARGE_LETTER_REQUIRED_INDICATOR = new BooleanFlag(new BooleanInternalFlag("ED_SHOW_DISCHARGE_LETTER_REQUIRED_INDICATOR", false, "Shows the print button on the ED Discharge preview tab"));//FWB-525
		public static final BooleanFlag ED_DISABLE_INTERVENTIONS_DIAGNOSIS_INVESTIGATIONS_CHECKBOXES = new BooleanFlag(new BooleanInternalFlag("ED_DISABLE_INTERVENTIONS_DIAGNOSIS_INVESTIGATIONS_CHECKBOXES", false, "When true disables the Interventions, Diagnosis and Investigations checkboxes."));//FWB-603
		public static final BooleanFlag ED_HIDE_GP_LETTER_STATUS = new BooleanFlag(new BooleanInternalFlag("ED_HIDE_GP_LETTER_STATUS", false, "When true the GP letter status is hidden."));//FWB-604

		public static final BooleanFlag ORDER_ENTRY_USE_ED_DEFAULT_LOCATION = new BooleanFlag(new BooleanInternalFlag("ORDER_ENTRY_USE_ED_DEFAULT_LOCATION", false, "If the user has selected an Emergency Department at login then the ED Radio button and the Patient Location on the General Order details tab will default to the selected value"));  // FWB-426
		public static final BooleanFlag INVESTIGATION_CONFIG_ALLOW_COMPLEX = new BooleanFlag(new BooleanInternalFlag("INVESTIGATION_CONFIG_ALLOW_COMPLEX", false, "Allows the use of complex pathology investigations",true));  // FWB-440
		
		public static final BooleanFlag DISPLAY_GRAPHICAL_VIEW_ON_CUMULATIVE_RESULTS = new BooleanFlag(new BooleanInternalFlag("DISPLAY_GRAPHICAL_VIEW_ON_CUMULATIVE_RESULTS", true, "Allows the graphical view on cumulative results"));  // FWB-443
		public static final BooleanFlag PATIENT_SUMMARY_HIDE_HISTORY_COLUMN = new BooleanFlag(new BooleanInternalFlag("PATIENT_SUMMARY_HIDE_HISTORY_COLUMN", true, "Hides the history column on the patient summary."));  // FWB-442
		public static final BooleanFlag USE_MODALITY_REPORTS_CONFIGURATION = new BooleanFlag(new BooleanInternalFlag("USE_MODALITY_REPORTS_CONFIGURATION", false, "When true the PrintOrder dialog will use the reports configured in Modality Reports Config Form for printing OCS request documents rather than the reports configured as taxonomy mappings."));  // FWB-449
		public static final BooleanFlag REQUEST_REASON_FOR_OVERRIDE_OF_MIN_REORDER_PERIOD = new BooleanFlag(new BooleanInternalFlag("REQUEST_REASON_FOR_OVERRIDE_OF_MIN_REORDER_PERIOD", false, "When true the reason for reordering is required when ordering within the minimum reorder period."));  // WDEV-17080
		public static final BooleanFlag SHOW_ATTENDING_HCP = new BooleanFlag(new BooleanInternalFlag("SHOW_ATTENDING_HCP", false, "When true the attending HCP will be displayed in the attendances."));  // WDEV-15907
		public static final BooleanFlag DISPLAY_PRIMARY_DIAGNOSIS_IN_PID = new BooleanFlag(new BooleanInternalFlag("DISPLAY_PRIMARY_DIAGNOSIS_IN_PID", false, "Controls the display of the primary diagnosis in the PID bar."));  // FWB-460
		public static final BooleanFlag DISPLAY_COMPLETE_FILTER_RESULTS_STATUS = new BooleanFlag(new BooleanInternalFlag("DISPLAY_COMPLETE_FILTER_RESULTS_STATUS", false, "Controls the display of the completed filter."));  // FWB-468
		public static final BooleanFlag PAS_PATIENT_ETHNIC_ORIGIN_MANDATORY = new BooleanFlag(new BooleanInternalFlag("PAS_PATIENT_ETHNIC_ORIGIN_MANDATORY", false, "When TRUE saves the default value for the ethnic origin to PAS if no entry was recorded in the MAXIMS UI "));  // FWB-472
		public static final BooleanFlag SHOW_DEMOGRAPHICS_INSURANCE_DETAILS = new BooleanFlag(new BooleanInternalFlag("SHOW_DEMOGRAPHICS_INSURANCE_DETAILS", false, "Controls the display of insurance details on patient demographics"));  // http://jira/browse/FWB-478
		public static final BooleanFlag APPOINTMENT_OUTCOME_ENABLED = new BooleanFlag(new BooleanInternalFlag("APPOINTMENT_OUTCOME_ENABLED",false,"Displays the Outcome Context menu on the ClinicListWithICPActions form"));//http://jira/browse/FWB-481
		public static final BooleanFlag SHOW_SURGERY_WITH_PRACTICE_DETAILS = new BooleanFlag(new BooleanInternalFlag("SHOW_SURGERY_WITH_PRACTICE_DETAILS",false,"Displays details of the practice when displaying surgeries for selection"));//http://jira/browse/FWB-489
		public static final BooleanFlag PATIENT_CORRESPONDENCE_TEMPLATES_DEFAULT_SPECIALTY_FROM_CARE_CONTEXT = new BooleanFlag(new BooleanInternalFlag("PATIENT_CORRESPONDENCE_TEMPLATES_DEFAULT_SPECIALTY_FROM_CARE_CONTEXT",false,"In correspondence defaults the specialty from the care context."));//http://jira/browse/FWB-493
		public static final BooleanFlag SVUH_MANDATORY_DEMOGRAPHIC_ATTRIBUTES = new BooleanFlag(new BooleanInternalFlag("SVUH_MANDATORY_DEMOGRAPHIC_ATTRIBUTES",false,"When true implement the SVUH mandatory demographics rules.",true));//http://jira/browse/FWB-518
		public static final BooleanFlag SHOW_COPY_LETTERS_TO_PATIENT_CONTROL = new BooleanFlag(new BooleanInternalFlag("SHOW_COPY_LETTERS_TO_PATIENT_CONTROL",false,"When true shows the copy letters to patient control."));//http://jira/browse/FWB-526
		public static final BooleanFlag SHOW_DIAGNOSES_DATABASE = new BooleanFlag(new BooleanInternalFlag("SHOW_DIAGNOSES_DATABASE",true,"Show the Diagnosis Database on the Clinical Diagnosis dialog."));//http://jira/browse/FWB-528
		public static final BooleanFlag PATIENT_PATHOLOGY_FILTERS = new BooleanFlag(new BooleanInternalFlag("PATIENT_PATHOLOGY_FILTERS",false,"Show filters on the Patient Pathology list."));//http://jira/browse/FWB-531
		public static final BooleanFlag PATIENT_RADIOLOGY_FILTERS = new BooleanFlag(new BooleanInternalFlag("PATIENT_RADIOLOGY_FILTERS",false,"Show filters on the Patient Radiology list."));//http://jira/browse/FWB-532
		public static final BooleanFlag VALIDATE_TRIAGE_AND_DISPLAY_PAIN_SCALE_MANDATORY_MESSAGE = new BooleanFlag(new BooleanInternalFlag("VALIDATE_TRIAGE_AND_DISPLAY_PAIN_SCALE_MANDATORY_MESSAGE",false,"Validates the Triage and Display Pain Scale Mandatory Message."));//http://jira/browse/FWB-542
		public static final BooleanFlag REFERRAL_WORKLISTS_HIDE_PROVIDER_CANCELLATION = new BooleanFlag(new BooleanInternalFlag("REFERRAL_WORKLISTS_HIDE_PROVIDER_CANCELLATION",false,"Used to hide the Provider Cancellation context menu on Referral Worklist screen."));//http://jira/browse/FWB-548
		public static final BooleanFlag CLINIC_LOCATION_TYPE_AVAILABLE = new BooleanFlag(new BooleanInternalFlag("CLINIC_LOCATION_TYPE_AVAILABLE",true,"Controls whether 'Clinic' Location type is available on Organisation and Location form."));//http://jira/browse/FWB-551
		public static final BooleanFlag REFERRAL_WORKLIST_CONTRACT_MANDATORY = new BooleanFlag(new BooleanInternalFlag("REFERRAL_WORKLIST_CONTRACT_MANDATORY",true,"Controls whether Contract filter is mandatory on the Referral Worklist"));//http://jira/browse/FWB-552
		public static final BooleanFlag BED_MANAGEMENT_DISPLAY_BREACH_COLOURS_FOR_PENDING_ED_PATIENTS = new BooleanFlag(new BooleanInternalFlag("BED_MANAGEMENT_DISPLAY_BREACH_COLOURS_FOR_PENDING_ED_PATIENTS",false,"Controls if breach colours for pending ED patients are displayed in bed management."));//http://jira/browse/FWB-578
		public static final BooleanFlag INPATIENT_LIST_HIDE_ADT_ACTIONS = new BooleanFlag(new BooleanInternalFlag("INPATIENT_LIST_HIDE_ADT_ACTIONS",false,"When true hides the ADT actions on the Inpatient list form."));//http://jira/browse/FWB-594
		
		public static final IntFlag CAREPLAN_ACTION_TEXT_LENGTH = new IntFlag(new IntInternalFlag("CAREPLAN_ACTION_TEXT_LENGTH", 90, "Controls the allowable length for a CarePlan action name."));
		public static final IntFlag SURVEY_PERIOD_DAYS = new IntFlag(new IntInternalFlag("SURVEY_PERIOD_DAYS", 365, "The period of time that can pass before patient is eligible to be sent a survey again." ));
		public static final IntFlag OCRR_NO_OF_REPORT_TO_ROWS = new IntFlag(new IntInternalFlag("OCRR_NO_OF_REPORT_TO_ROWS", 3, "Configures the number of rows allowed in the report to grid on the My Order Screen", true));
		public static final IntFlag OCRR_NEW_RESULTS_TIMER_REFRESH_RATE = new IntFlag(new IntInternalFlag("OCRR_NEW_RESULTS_TIMER_REFRESH_RATE", 60, "Specifies the interval rate in seconds at which New Results will be refreshed "));
		public static final IntFlag CARE_CONTEXT_SELECT_NO_OF_DAYS = new IntFlag(new IntInternalFlag("CARE_CONTEXT_SELECT_NO_OF_DAYS", 7, "When selecting a CareContext to place and order with - only list back for (today - x no of days)"));
		public static final IntFlag SEARCH_APPOINTMENTS_RANGE_MONTHS  = new IntFlag(new IntInternalFlag("SEARCH_APPOINTMENTS_RANGE_MONTHS", 3, "Search appointments plus and minus X months of today's date."));
		public static final IntFlag MAXIMUM_NUMBER_OF_OTHERADDRESSES = new IntFlag(new IntInternalFlag("MAXIMUM_NUMBER_OF_OTHERADDRESSES", 1, "Maximum number of Other address recordable", true));
		public static final IntFlag EDISCHARGE_RESULTS_NUM_DAYS  = new IntFlag(new IntInternalFlag("EDISCHARGE_RESULTS_NUM_DAYS", 0, "Number of days to find Investigation Results for. Used on the eDischarge Clinical Information screen."));
		public static final IntFlag PENDING_EMERGENCY_TIMER_INTERVAL   = new IntFlag(new IntInternalFlag("PENDING_EMERGENCY_TIMER_INTERVAL", 300, "Configuration of timer interval in seconds for the Pending Emergency form."));
		public static final IntFlag WARDVIEW_TIMER_INTERVAL   = new IntFlag(new IntInternalFlag("WARDVIEW_TIMER_INTERVAL", 300, "Configuration of timer interval in seconds for the Ward View form."));
		public static final IntFlag CARE_UK_MAX_NEW_RESULTS   = new IntFlag(new IntInternalFlag("CARE_UK_MAX_NEW_RESULTS", 200, "Sets the number of New Results to return in a list call on the Referrals New Results Form."));
		public static final IntFlag REFRESH_PHARMACY_TTA_RECORDS_EVERY_N_SECONDS = new IntFlag(new IntInternalFlag("REFRESH_PHARMACY_TTA_RECORDS_EVERY_N_SECONDS", 60, "Refresh Pharmacy TTA Records every N seconds"));
		public static final IntFlag SCHOOL_NURSERY_ON_CLINICAL_INFORMATION_IS_VISIBLE_FOR_PATIENTS_TO_AGE = new IntFlag(new IntInternalFlag("SCHOOL_NURSERY_ON_CLINICAL_INFORMATION_IS_VISIBLE_FOR_PATIENTS_TO_AGE", 16, "This field sets the maximum age that the field school nursery will appear on the clinical information screen for eDischarge."));
		public static final IntFlag THEATRELIST_TIMER_INTERVAL = new IntFlag(new IntInternalFlag("THEATRELIST_TIMER_INTERVAL", 300, "Theatre List configurable refresh time in seconds"));
		public static final IntFlag MAX_NO_OF_PATIENT_JOURNEY_EVENTS_LISTED  = new IntFlag(new IntInternalFlag("MAX_NO_OF_PATIENT_JOURNEY_EVENTS_LISTED", 400, "Maximum number of Patient journey event records listed",true));
		public static final IntFlag CLINICLISTWITHICP_TIMER_INTERVAL = new IntFlag(new IntInternalFlag("CLINICLISTWITHICP_TIMER_INTERVAL", 300, "Specifies the interval in secords the ClinicListWithICPActions screen will refresh"));
		public static final IntFlag CLINICLIST_TIMER_INTERVAL = new IntFlag(new IntInternalFlag("CLINICLIST_TIMER_INTERVAL", 300, "Specifies the interval in secords the ClinicList screen will refresh"));
		public static final IntFlag DOCUMENT_WORKLIST_DEFAULT_EVENT_START_DATE_INTERVAL = new IntFlag(new IntInternalFlag("DOCUMENT_WORKLIST_DEFAULT_EVENT_START_DATE_INTERVAL", 14, "The number of days to subtract from the current date, in order to calculate the default value for the Document Worklist Event Date From field.")); //http://jira/browse/FWB-363
		public static final IntFlag VTE_RISK_ASSESSMENT_KPI_EXCEEDED_PERIOD = new IntFlag(new IntInternalFlag("VTE_RISK_ASSESSMENT_KPI_EXCEEDED_PERIOD", 24, "VTE Risk assessment KPI period in hours"));
		public static final IntFlag VTE_RISK_ASSESSMENT_BREACH_WARNING_PERIOD = new IntFlag(new IntInternalFlag("VTE_RISK_ASSESSMENT_BREACH_WARNING_PERIOD", 6, "Breach warning period, Patients that are due to breach the VTE KPI within a site specified amount of time (hours)"));
		public static final IntFlag VTE_RISK_ASSESSMENT_AUTO_REFRESH_TIME_SECONDS = new IntFlag(new IntInternalFlag("VTE_RISK_ASSESSMENT_AUTO_REFRESH_TIME_SECONDS", 60, "Specifies the refresh interval  in seconds for the VTE worklist"));
		public static final IntFlag ED_WORKLOAD_SUMMARY_AUTO_REFRESH_TIME_MINUTES = new IntFlag(new IntInternalFlag("ED_WORKLOAD_SUMMARY_AUTO_REFRESH_TIME_MINUTES", 1, "Specifies the refresh interval in minutes for the ED workload summary")); //FWB-382
		public static final IntFlag ED_CLINICIAN_WORKLIST_AUTO_REFRESH_TIME_MINUTES = new IntFlag(new IntInternalFlag("ED_CLINICIAN_WORKLIST_AUTO_REFRESH_TIME_MINUTES", 1, "Specifies the refresh interval in minutes for the ED Clinician Assessment Worklist")); //FWB-384
		public static final IntFlag ED_TRIAGE_AUTO_REFRESH_TIME_MINUTES = new IntFlag(new IntInternalFlag("ED_TRIAGE_AUTO_REFRESH_TIME_MINUTES", 1, "Specifies the refresh interval in minutes for the ED Triage form")); //FWB-383
		public static final IntFlag CDS_REPORTS_SPLIT_INTERVAL_DAYS = new IntFlag(new IntInternalFlag("CDS_REPORTS_SPLIT_INTERVAL_DAYS", 30, "For large CDS datasets split into chunks of days")); //http://jira/browse/FWB-398
		public static final IntFlag ED_SHOW_DISCHARGED_TRACKING_RECORDS_PERIOD = new IntFlag(new IntInternalFlag("ED_SHOW_DISCHARGED_TRACKING_RECORDS_PERIOD", 24, "The number of hours that discharged records are displayed on the ED tracking screen.")); //http://jira/browse/FWB-454
		public static final IntFlag DOCUMENT_WORKLIST_DEFAULT_GENERATED_START_DATE_INTERVAL = new IntFlag(new IntInternalFlag("DOCUMENT_WORKLIST_DEFAULT_GENERATED_START_DATE_INTERVAL", 14, "The number of days to subtract from the current date, in order to calculate the default value for the Document Worklist Generated Date From field.")); //http://jira/browse/FWB-491
		
		
		public static final IntFlag ED_ATTENDANCE_DETAILS_TIMER_INTERVAL = new IntFlag(new IntInternalFlag("ED_ATTENDANCE_DETAILS_TIMER_INTERVAL", 120, "ED Attendance Details refresh period in seconds (applies only to the Triage/Registration/Other Problems/Alert/Allergies/Attendence History/Attendence Times details on the form")); //http://jira/browse/FWB-461
		
		public static final ColourFlag MERGED_COLOUR = new ColourFlag(new ColourInternalFlag("MERGED_COLOUR", Color.LightBlue, "Row colour for Merged patients"));
		public static final ColourFlag RIP_COLOUR = new ColourFlag(new ColourInternalFlag("RIP_COLOUR", Color.Red, "Row colour for RIP patients"));
		public static final ColourFlag RIP_INFO_COLOUR = new ColourFlag(new ColourInternalFlag("RIP_INFO_COLOUR", Color.White, "Patient Info text colour for RIP patients"));
		public static final ColourFlag INVASIVE_DEVICE_REMOVAL_ROW_COLOR  = new ColourFlag(new ColourInternalFlag("INVASIVE_DEVICE_REMOVAL_ROW_COLOR ", Color.Bisque, "Setting the row color when the target date is reached for a device."));
		public static final ColourFlag FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR  = new ColourFlag(new ColourInternalFlag("FURTHER_MANAGEMENT_REQUIRED_ROW_COLOUR", Color.Orange, "Sets the row colour for Further Management Required on the referral status list."));
		public static final ColourFlag DISCHARGED_ROW_COLOUR  = new ColourFlag(new ColourInternalFlag("DISCHARGED_ROW_COLOUR", Color.LightGreen , "Sets the row colour for Discharged on the referral status list."));
		public static final ColourFlag CANCELLED_INVESTIGATION_ROW_COLOUR = new ColourFlag(new ColourInternalFlag("CANCELLED_INVESTIGATION_ROW_COLOUR", Color.LightGreen , "Sets the row colour for Cancelled Investigations."));
		public static final ColourFlag CLINIC_LIST_ARRIVED_COLOUR  = new ColourFlag(new ColourInternalFlag("CLINIC_LIST_ARRIVED_COLOUR", Color.White , "Background Colour for arrived patients on clinic list."));
		public static final ColourFlag CONTROLLED_DRUG_COLOR = new ColourFlag(new ColourInternalFlag("CONTROLLED_DRUG_COLOR", Color.LightGreen , "Background Colour to indicate if the medication is controlled."));
		public static final ColourFlag THEATRELIST_ADMITTED_ROWCOLOUR = new ColourFlag(new ColourInternalFlag("THEATRELIST_ADMITTED_ROWCOLOUR", Color.LightBlue , "Row Colour for Admitted Patient on TheatreList."));
		public static final ColourFlag DISPLAY_COLOUR_FOR_CANCELLED_CLINICAL_CONTACTS = new ColourFlag(new ColourInternalFlag("DISPLAY_COLOUR_FOR_CANCELLED_CLINICAL_CONTACTS", Color.Red , "Row Colour for cancelled clinical contacts.")); //FWB-348
		public static final ColourFlag DISPLAY_COLOUR_FOR_CANCELLED_CARE_CONTEXTS = new ColourFlag(new ColourInternalFlag("DISPLAY_COLOUR_FOR_CANCELLED_CARE_CONTEXTS", Color.Red , "Row Colour for cancelled care contexts.")); //FWB-349
		public static final ColourFlag DISPLAY_COLOUR_FOR_CANCELLED_PROBLEM_GROUPS = new ColourFlag(new ColourInternalFlag("DISPLAY_COLOUR_FOR_CANCELLED_PROBLEM_GROUPS", Color.Red , "Row Colour for cancelled problem groups.")); //FWB-366
		public static final ColourFlag DISPLAY_COLOUR_FOR_CANCELLED_EPISODES_OF_CARE = new ColourFlag(new ColourInternalFlag("DISPLAY_COLOUR_FOR_CANCELLED_EPISODES_OF_CARE", Color.Red , "Row Colour for cancelled cancelled episodes of care.")); //FWB-367
		public static final ColourFlag VTE_RISK_ASSESSMENT_EXCEEDED_KPI_COLOR = new ColourFlag(new ColourInternalFlag("VTE_RISK_ASSESSMENT_EXCEEDED_KPI_COLOR", Color.Red, "Row colour for breached patients"));
		public static final ColourFlag VTE_RISK_ASSESSMENT_BREACH_WARNING_COLOR = new ColourFlag(new ColourInternalFlag("VTE_RISK_ASSESSMENT_BREACH_WARNING_COLOR", Color.Yellow, "Row colour for breach warning patients"));
		public static final ColourFlag CAREPLAN_WORKLIST_OVERDUE_COLOUR = new ColourFlag(new ColourInternalFlag("CAREPLAN_WORKLIST_OVERDUE_COLOUR", Color.Red, "Colour used for overdue reviews")); //FWB-394 
		public static final ColourFlag CAREPLAN_WORKLIST_DUE_COLOUR = new ColourFlag(new ColourInternalFlag("CAREPLAN_WORKLIST_DUE_COLOUR", Color.Orange, "Colour used for DUE reviews"));//FWB-394
		
		public static final ColourFlag ALERTS_COMPONENT_TEXT_COLOUR = new ColourFlag(new ColourInternalFlag("ALERTS_COMPONENT_TEXT_COLOUR", Color.Black, "Colour used for text on the Alerts component"));//FWB-423 
		public static final ColourFlag ALLERGIES_COMPONENT_TEXT_COLOUR = new ColourFlag(new ColourInternalFlag("ALLERGIES_COMPONENT_TEXT_COLOUR", Color.Black, "Colour used for text on the Allergies component"));//FWB-423`
		
		public static final ColourFlag DEMENTIA_BREACHED_ROW_COLOUR = new ColourFlag(new ColourInternalFlag("DEMENTIA_BREACHED_ROW_COLOUR", Color.Orange, "Colour used for breached dementia worklist entries"));//FWB-431//FWB-437
		public static final ColourFlag OCS_EXPECTED_RESULT_DATETIME_BREACH_COLOUR = new ColourFlag(new ColourInternalFlag("OCS_EXPECTED_RESULT_DATETIME_BREACH_COLOUR", Color.Orange, "Background colour of the Expected DateTime when breached")); // FWB-439
		
		public static final ColourFlag CORRECTION_ROW_COLOUR = new ColourFlag(new ColourInternalFlag("CORRECTION_ROW_COLOUR", Color.LightGreen, "Background colour of corrected notes")); // http://jira/browse/FWB-455
		public static final ColourFlag INTERNAL_REFERRALS_URGENT_STATUS_ROW_COLOUR = new ColourFlag(new ColourInternalFlag("INTERNAL_REFERRALS_URGENT_STATUS_ROW_COLOUR", Color.Orange, "Row colour for urgent internal referrals")); // http://jira/browse/FWB-496
		public static final ColourFlag REQUIRES_DISCHARGE_DIAGNOSIS_COLOUR = new ColourFlag(new ColourInternalFlag("REQUIRES_DISCHARGE_DIAGNOSIS_COLOUR", Color.Orange, "Tracking row colour for attendances marked as Requires Discharge Diagnosis")); // http://jira/browse/FWB-564
		
		
		public static final BooleanFlag ENABLE_AWAITING_CLINICAL_INFO_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("ENABLE_AWAITING_CLINICAL_INFO_FUNCTIONALITY",true,"Enable/disable Awaiting Clinical Information functionality on Referral Details Form."));//FWB-255
		public static final BooleanFlag CAPSCAN_USE_OLDPCT_CODE  = new BooleanFlag(new BooleanInternalFlag("CAPSCAN_USE_OLDPCT_CODE", false, "Use old PCT 6 character codes", false));
		public static final BooleanFlag VTE_RISK_ASSESSMENT_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("VTE_RISK_ASSESSMENT_FUNCTIONALITY", false, "Enables the use of the VTE Assessment functionality", true));//http://jira/browse/FWB-396
		public static final BooleanFlag CORRESPONDENCE_ARCHIVE_RTF_FILES = new BooleanFlag(new BooleanInternalFlag("CORRESPONDENCE_ARCHIVE_RTF_FILES", false, "In Correspondence the RTF file will be archived after it is converted to a PDF ", true));		
		
		public static final BooleanFlag MAXIMS_ADT_NO_INTERFACE = new BooleanFlag(new BooleanInternalFlag("MAXIMS_ADT_NO_INTERFACE", false, "Enables standalone MAXIMS ADT functionality where there is no interface to an external PAS system.", true));
		
		public static final BooleanFlag USE_HEARTS_CONTRACTING = new BooleanFlag(new BooleanInternalFlag("USE_HEARTS_CONTRACTING", false, "When TRUE HEARTS contracting will be used on site. ", true));
		
		public static final BooleanFlag SHOW_ABNORMAL_RESULTS_SEARCH_FILTER = new BooleanFlag(new BooleanInternalFlag("SHOW_ABNORMAL_RESULTS_SEARCH_FILTER", true, "When TRUE the Abnormal Pathology Results only checkbox will be visible on the new results screen ")); // FWB-475
		public static final BooleanFlag WHITEBOARD_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("WHITEBOARD_FUNCTIONALITY", false, "When TRUE the whiteboard will be visible from within Tracking ")); // FWB-476
		public static final BooleanFlag REFERRAL_DETAILS_USE_REFERRAL_TRIAGE = new BooleanFlag(new BooleanInternalFlag("REFERRAL_DETAILS_USE_REFERRAL_TRIAGE", true, "When TRUE the [Accept], [Reject] and [Second Opinion] buttons will be hidden on the referral Details dialog.")); // FWB-575
	}
	
	

	public static final class FW extends ims.configuration.ConfigFlag.FW
	{
		public static final StringFlag PASSWD_ENCRYPT_METHOD = new StringFlag(new StringInternalFlag("PASSWD_ENCRYPT_METHOD",  "HASH", "Which encryption algorithm to use for user passwords.", new String[] {"HASH", "PRIME"}, true));
		//public static final StringFlag CLUSTER_NODES = new StringFlag(new StringInternalFlag("CLUSTER_NODES", "", "Comma seperated list of host-names/ip-addresses + ports of hosts in appserver cluster for particular application instance. e.g. bhr-prod-app-1:8080,bhr-prod-app-2:8080"));
		public static final StringFlag POP_SERVER = new StringFlag(new StringInternalFlag("POP_SERVER", "", "Specify the email POP server"));
		public static final StringFlag DICTIONARY_FILE = new StringFlag(new StringInternalFlag("DICTIONARY_PATH", "", "Specify the full path to the dictionary file.", true));
		public static final StringFlag SCHEDULE_SERVLET_URL  = new StringFlag(new StringInternalFlag("SCHEDULE_SERVLET_URL", "", "Specify the url where DischargeSummarySchedule servlet should running"));
		public static final StringFlag DOCUMENT_CONVERSION_ENGINE = new StringFlag(new StringInternalFlag("DOCUMENT_CONVERSION_ENGINE",  "OpenOffice", "Conversion engine to be use for document conversion.", new String[] {"OpenOffice", "Microsoft Office"}, true));
		
		public static final BooleanFlag FULL_SCREEN_EDIT = new BooleanFlag(new BooleanInternalFlag("FULL_SCREEN_EDIT", false, "When the screen is being edited it will appear full screen.", true));		
		public static final BooleanFlag DEBUG_WEB_SERVICES = new BooleanFlag(new BooleanInternalFlag("DEBUG_WEB_SERVICES", false, "Verbose output web services call to system log", true));
		
		public static final IntFlag POP_PORT  = new IntFlag(new IntInternalFlag("POP_PORT", 110, "Specify the email POP server port"));
		public static final BooleanFlag USE_REFERRAL_CARECONTEXT = new BooleanFlag(new BooleanInternalFlag("USE_REFERRAL_CARECONTEXT", true, "Always sets the Referral Care Context to the Current Care Context Global Context if available", true));
	}

	public static final class DOM extends ims.configuration.ConfigFlag.DOM
	{
		public static final StringFlag DEMOGRAPHICS_EXT_SYSTEM = new StringFlag(new StringInternalFlag("DEMOGRAPHICS_EXT_SYSTEM", "HEARTS", "External System name to use in Code mapping for Demographics"));
		public static final StringFlag DOCS_URL = new StringFlag(new StringInternalFlag("DOCS_URL","http://localhost/Docs", "URL where Maxims Docs can be accessed."));		
		public static final StringFlag DOCS_LOCATION = new StringFlag(new StringInternalFlag("DOCS_LOCATION", "c:/temp/docs/", "Server Directory where Maxims Docs can be stored."));		
		public static final StringFlag READ_CODES_SEARCH_TYPE = new StringFlag(new StringInternalFlag("READ_CODES_SEARCH_TYPE", "SQL", "Determines how Read Codes engine is searched. Whether local SQL query or DTO call.", new String[] {"SQL", "DTO"}, true));
		public static final StringFlag ANALYTE_UNIQUENESS = new StringFlag(new StringInternalFlag("ANALYTE_UNIQUENESS","PROV_SYS", "Determines whether analyte codes are unique per Provider System, per discipline with a Lab or per discipline regardless of the lab who carried it out.", new String[] {"PROV_SYS", "LOC_SVC", "SVC"}, true));
		public static final StringFlag PATIENT_SEARCH_TYPE = new StringFlag(new StringInternalFlag("PATIENT_SEARCH_TYPE", "LOCAL", "Selects where patient searches are to be performed.", new String[] {"LOCAL", "DTO"}, true));
		public static final StringFlag INPATIENT_SEARCH_TYPE = new StringFlag(new StringInternalFlag("INPATIENT_SEARCH_TYPE", "LOCAL", "Selects where patient searches are to be performed.", new String[] {"LOCAL", "DTO"}, true));
		public static final StringFlag SCHEDULING_SLOTS_CREATION = new StringFlag(new StringInternalFlag("SCHEDULING_SLOTS_CREATION", "Local Only", "Specify how scheduling slots are created",new String[]{ "Local Only","Choose and Book"}, true));
		public static final StringFlag PATIENT_NUMBER_PREFIX = new StringFlag(new StringInternalFlag("PATIENT_NUMBER_PREFIX", "UK", "Specify the patient number prefix, only the first two characters are used. If NONE no prefix or padding is used.", true));//http://jira/browse/WDEV-21512

		public static final StringFlag CDS_DEFAULT_SITE_CODE = new StringFlag(new StringInternalFlag("CDS_DEFAULT_SITE_CODE","NTC02", "Default Site Code to be used within CDS reports for 'OrganisationCode for Provider' and other places where mappings not found"));  // WDEV-12877
		public static final StringFlag THEATRE_SESSION_TYPE = new StringFlag(new StringInternalFlag("THEATRE_SESSION_TYPE","TCI", "Controls Theatre Session Functionality",new String[]{ "TCI","Fixed"}));  // http://jira/browse/FWB-317
		
		public static final StringFlag BATCH_JOB_NOTIFICATION_EMAIL_ADDRESSES = new StringFlag(new StringInternalFlag("BATCH_JOB_NOTIFICATION_EMAIL_ADDRESSES",  "", "Addresses to send Batch Job Notification mails to. Comma seperate if multiple."));
		public static final StringFlag CLINIC_LETTER_BATCH_CREATE_SUMMARY_NOTE_MODE  = new StringFlag(new StringInternalFlag("CLINIC_LETTER_BATCH_CREATE_SUMMARY_NOTE_MODE", "None", "Controls if/how a summary note is included in clinic letters", new String[]{"None","Latest","Select"}));  //http://jira/browse/FWB-376
		public static final StringFlag STARTTIME_FOR_LOS_AND_BREACH_CALCULATIONS = new StringFlag(new StringInternalFlag("STARTTIME_FOR_LOS_AND_BREACH_CALCULATIONS", "RegistrationDateTime", "Controls the starting time used for LOS and breach calculations.", new String[]{"RegistrationDateTime","ArrivalDateTime"},true));  //http://jira/browse/FWB-486
		public static final StringFlag PATIENT_DIARY_SOURCE = new StringFlag(new StringInternalFlag("PATIENT_DIARY_SOURCE", "Patient Event", "Controls the source of the Patient Diary data.", new String[]{"Patient Event","Patient Diary"}));  //http://jira/browse/FWB-495
		public static final StringFlag APPOINTMENT_CONSULTANT_CODE_MAPPING = new StringFlag(new StringInternalFlag("APPOINTMENT_CONSULTANT_CODE_MAPPING", "", "Appointment Consultant code mapping"));		
		// FWB-510
		public static final StringFlag REFERRAL_CODING_SOURCE = new StringFlag(new StringInternalFlag("REFERRAL_CODING_SOURCE", "DischargeSummary", "To determine the source to use for Referral Coding",new String[]{ "DischargeSummary","ReferralAdmissions"}, true));	
		
		public static final StringFlag PROFILE_FLEXIBLE_TYPE = new StringFlag(new StringInternalFlag("PROFILE_FLEXIBLE_TYPE", "WITH_SLOTS", "Controls if flexible profiles can be with slots or without slots.", new String[]{"WITH_SLOTS","WITHOUT_SLOTS"},true));  //http://jira/browse/FWB-533
		public static final StringFlag CREATE_CARE_CONTEXT_AND_REFERRAL_ON_ADMISSION = new StringFlag(new StringInternalFlag("CREATE_CARE_CONTEXT_AND_REFERRAL_ON_ADMISSION", "CareContext and Referral", "Controls what is created when a patient is admitted", new String[]{"None","CareContext Only","CareContext and Referral"},true));  //http://jira/browse/FWB-589
		
		public static final BooleanFlag CLINEPIS_PAS_LINKED = new BooleanFlag(new BooleanInternalFlag("CLINEPIS_PAS_LINKED", true, "Specifies whether a new non Day Hospital Clinical Episode must be associated with a PAS episode or not.", true));
		public static final BooleanFlag EPISTYPE_DH_PAS_LINKED = new BooleanFlag(new BooleanInternalFlag("EPISTYPE_DH_PAS_LINKED", true, "Specifies whether a new Day Hospital Clinical Episode must record a Contact on PAS or not.", true));
		public static final BooleanFlag LOOKUP_MODIFY = new BooleanFlag(new BooleanInternalFlag("LOOKUP_MODIFY", false, "Specifies whether a Lookup instance can be updated or not. Should be FALSE for production environment.", true));
		public static final BooleanFlag EPIS_REQ_HCP = new BooleanFlag(new BooleanInternalFlag("EPIS_REQ_HCP", true, "Specifies whether Responsible HCP is mandatory for Episode Creation.", true));
		public static final BooleanFlag LINK_ACTIVITY_TO_PROCEDURE = new BooleanFlag(new BooleanInternalFlag("LINK_ACTIVITY_TO_PROCEDURE", false, "Specifies whether creation of a Procedure should also create an Activity.", true));
		public static final BooleanFlag CASE_SENSITIVE_PATID = new BooleanFlag(new BooleanInternalFlag("CASE_SENSITIVE_PATID", true, "If this is set to false all PatientId values will be upper cased ", true));
		public static final BooleanFlag LOCAL_PATIENT_REGISTRATION = new BooleanFlag(new BooleanInternalFlag("LOCAL_PATIENT_REGISTRATION", false, "Can demographics be inserted and updated through this application", true));		
		public static final BooleanFlag CLINICAL_APP = new BooleanFlag(new BooleanInternalFlag("CLINICAL_APP",true, "Specfies whether the application is clinical or non-clinical. Effects whether Patient or PatientClinical is created in domain call.", true));
		public static final BooleanFlag GP_USE_SURGERIES = new BooleanFlag(new BooleanInternalFlag("GP_USE_SURGERIES", true, "Determines whether the User must specify a GP Surgery to link a Patient to, or just a GP Practice.", true));
		public static final BooleanFlag ENABLE_EXCHEQUER_CODES_VALIDATION = new BooleanFlag(new BooleanInternalFlag("ENABLE_EXCHEQUER_CODES_VALIDATION", false, "Switch on/off validation of Exchequer codes in Service admin screen.", true));
		public static final BooleanFlag DTO_REPLICATE_APPUSERS = new BooleanFlag(new BooleanInternalFlag("DTO_REPLICATE_APPUSERS", false, "Whether to replicate users created locally to a DTO server aswell. For use only in Mixed Mode projects.", true));
		public static final BooleanFlag OCRR_KEEP_RESULT_HISTORY  = new BooleanFlag(new BooleanInternalFlag("OCRR_KEEP_RESULT_HISTORY", false, "Whether to store a history of Rad and Path Results", true));
		public static final BooleanFlag CREATE_ORDERS_WITH_CARECONTEXT_ONLY = new BooleanFlag(new BooleanInternalFlag("CREATE_ORDERS_WITH_CARECONTEXT_ONLY", false, "Specifies whether an order can be placed at CareContext level(true) or Patient(false).", false));
		public static final BooleanFlag RESTRICT_TAXONOMY_SEARCH_ON_PAST_MEDICAL_HISTORY = new BooleanFlag(new BooleanInternalFlag("RESTRICT_TAXONOMY_SEARCH_ON_PAST_MEDICAL_HISTORY", false, "Flag to enable Taxonomy Search on certain Screens.", false));
		public static final BooleanFlag SCHEDULING_LINKED_TO_PATHWAYS = new BooleanFlag(new BooleanInternalFlag("SCHEDULING_LINKED_TO_PATHWAYS", false, "Maintain a link between Scheduling and Patient Pathways.", true));
		public static final BooleanFlag USE_GHG_SPECIMEN_NUMBERING = new BooleanFlag(new BooleanInternalFlag("USE_GHG_SPECIMEN_NUMBERING", false, "Use the GHG defined Specimen Numbering Scheme.", true));
		public static final BooleanFlag ADT_LINK_ADMISSION_TO_EPISODE = new BooleanFlag(new BooleanInternalFlag("ADT_LINK_ADMISSION_TO_EPISODE", false, "Mandatory episode selection during bed management admission."));
		public static final BooleanFlag USE_ALIAS_SURNAME_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("USE_ALIAS_SURNAME_FUNCTIONALITY",false,"When TRUE Alias surname button will be shown on Demographics form and when searching on the Patient Search screen, using Surname in the search will search both the current Patient Surname and the Alias surname also."));
		public static final BooleanFlag RECORD_INTO_PATIENT_DIARY = new BooleanFlag(new BooleanInternalFlag("RECORD_INTO_PATIENT_DIARY", false, "Switch on or off the recording of Appointments into the Patient Diary", true));  // FWD-215
		public static final BooleanFlag USE_ULNA_TO_ESTIMATE_PATIENT_HEIGHT = new BooleanFlag(new BooleanInternalFlag("USE_ULNA_TO_ESTIMATE_PATIENT_HEIGHT", false, "If TRUE, will enable functionality on the Metrics screen to estimate patients height."));  // FWB-395
		public static final BooleanFlag RTT_STATUS_POINT_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("RTT_STATUS_POINT_FUNCTIONALITY", false, "If TRUE, Referral creation and Appointment Outcomes will set RTT status points based on configuration.",true));  // FWB-484
		public static final BooleanFlag RTT_STANDARD_PATHWAY = new BooleanFlag(new BooleanInternalFlag("RTT_STANDARD_PATHWAY", true, "If TRUE, the standard RTT pathway is used",true));  // FWB-565
		 
		public static final BooleanFlag INSTANTIATE_EVENT_FROM_SCHEDULING = new BooleanFlag(new BooleanInternalFlag("INSTANTIATE_EVENT_FROM_SCHEDULING", false, "Will attempt to instantiate a pathways event for scheduling appt booking, rebooking, cancellations and outcome", true));
		public static final BooleanFlag EROD_SAVE_ONLY_REASONABLE_OFFERS = new BooleanFlag(new BooleanInternalFlag("EROD_SAVE_ONLY_REASONABLE_OFFERS", false, "When true only reasonably offers will be saved.", true));//FWB-530
		public static final BooleanFlag SCHEDULING_ALLOW_MULTIPLE_FIRST_ACTIVITIES_FOR_THE_SAME_SERVICE = new BooleanFlag(new BooleanInternalFlag("SCHEDULING_ALLOW_MULTIPLE_FIRST_ACTIVITIES_FOR_THE_SAME_SERVICE", false, "When true allows users book multiple first activity appoimtments for the same service."));//FWB-590
		
		public static final IntFlag CASE_NOTE_SEARCH_MAX_SIZE = new IntFlag(new IntInternalFlag("CASE_NOTE_SEARCH_MAX_SIZE", 500, "Sets the max number of records returned in the Case Note Request Work List.")); //FWB-600
		public static final IntFlag CODING_RECORDS_RETURNED_MAX_SIZE = new IntFlag(new IntInternalFlag("CODING_RECORDS_RETURNED_MAX_SIZE", 600, "Sets the max number of coding records that can be returned.")); //FWB-599
		public static final IntFlag PAT_SEARCH_MAX_SIZE = new IntFlag(new IntInternalFlag("PAT_SEARCH_MAX_SIZE", 100, "Sets the max size a patient search can reach before user must refine search criteria."));
		public static final IntFlag TAXONOMY_SEARCH_MAX_SIZE = new IntFlag(new IntInternalFlag("TAXONOMY_SEARCH_MAX_SIZE", 500, "Sets the max size a taxonomy search can reach before user must refine search criteria."));
		public static final IntFlag TAXONOMY_SEARCH_CRITERIA_SIZE = new IntFlag(new IntInternalFlag("TAXONOMY_SEARCH_CRITERIA_SIZE", 4, "Sets the max number of characters before user must can initiate search."));
		public static final IntFlag CLINICAL_ADMIN_SEARCH_MAX_SIZE = new IntFlag(new IntInternalFlag("CLINICAL_ADMIN_SEARCH_MAX_SIZE", 100, "Sets the max size that clinical admin screens can reach before user must enter search criteria"));
		public static final IntFlag EXCLUDED_INTERVAL = new IntFlag(new IntInternalFlag("EXCLUDED_INTERVAL", 6, "Exclude from export the invoices approved within the last X hours "));
		public static final IntFlag OCS_NEWRES_DAYS_MAX = new IntFlag(new IntInternalFlag("OCS_NEWRES_DAYS_MAX", 10, "Defines the maximum number of days a user can choose on the New Results screen."));
		public static final IntFlag OCS_NEWRES_DAYS_DEFAULT = new IntFlag(new IntInternalFlag("OCS_NEWRES_DAYS_DEFAULT", 2, "Sets the default value chosen for the number of days back to query for New Results on the New Results screen."));
		public static final IntFlag OCS_NEWRES_UNSEEN_CUTOFF = new IntFlag(new IntInternalFlag("OCS_NEWRES_UNSEEN_CUTOFF", 5, "Determines the number of days beyond which a NEW result is deemed to be UNSEEN."));
		public static final IntFlag DAILY_NOTES_LIST_NO_OF_DAYS = new IntFlag(new IntInternalFlag("DAILY_NOTES_LIST_NO_OF_DAYS", 3, "Determines the number of days back by default to list patient daily notes for."));
		public static final IntFlag CONTACT_SEARCH_MAX_SIZE = new IntFlag(new IntInternalFlag("CONTACT_SEARCH_MAX_SIZE", 100, "Sets the max size an inpatient/outpatient search can reach before user must refine search criteria."));
		public static final IntFlag PTR_OPWL_PERCENTAGE_REJECTS_ACCEPTED = new IntFlag(new IntInternalFlag("PTR_OPWL_PERCENTAGE_REJECTS_ACCEPTED", 4, "Sets the percentage of rejected records an OPWL extract file must contain for the file to be rejected "));
		public static final IntFlag CAREPLAN_WORKLIST_TO_BE_REVIEWED_RANGE = new IntFlag(new IntInternalFlag("CAREPLAN_WORKLIST_TO_BE_REVIEWED_RANGE", 7, "Number of days a Careplan should be reviewed within")); //FWB-394
		public static final IntFlag CAREPLAN_NEXT_EVALUTION_DATE_VALIDATION = new IntFlag(new IntInternalFlag("CAREPLAN_NEXT_EVALUTION_DATE_VALIDATION", 0, "If non-zero, this value will be used to validate the next evaluation date provided by a user is within a certain number of days")); //FWB-393
		public static final IntFlag AUTOMATICALLY_DISCHARGE_PATIENT_FROM_ED_ON_DNA_CALL_NUMBER = new IntFlag(new IntInternalFlag("AUTOMATICALLY_DISCHARGE_PATIENT_FROM_ED_ON_DNA_CALL_NUMBER", 3, "Automatically discharge patient from ED on DNA call number ")); //FWB-419
		public static final IntFlag NEW_RESULTS_SEARCH_MAX_SIZE = new IntFlag(new IntInternalFlag("NEW_RESULTS_SEARCH_MAX_SIZE", 100, "Sets the max size a new results search can reach before user must refine search criteria.")); //http://jira/browse/FWB-480
	
		public static final BooleanFlag DATA_MIGRATION_COMPLETED = new BooleanFlag(new BooleanInternalFlag("DATA_MIGRATION_COMPLETED", false, "Data Migration Completed.", true));
		public static final BooleanFlag HEARTS_REPLICATE_PATIENTS= new BooleanFlag(new BooleanInternalFlag("HEARTS_REPLICATE_PATIENTS",false,"Save updates/inserts on the Patient to Hearts.",true));
		public static final BooleanFlag EXTERNAL_AUTHENTICATION = new BooleanFlag(new BooleanInternalFlag("EXTERNAL_AUTHENTICATION",false,"authenticates users against an external system.",true));
		public static final BooleanFlag USE_PATIENT_NUMBER = new BooleanFlag(new BooleanInternalFlag("USE_PATIENT_NUMBER",false,"When true Maxims creates a Patient Identifier based on the Internal id of the patient record",true));
		public static final BooleanFlag FORENAME1_IS_MANDATORY = new BooleanFlag(new BooleanInternalFlag("FORENAME1_IS_MANDATORY",false,"When true FORENAME 1 is a mandatory field for patient registration."));
		public static final BooleanFlag GENDER_IS_MANDATORY_FOR_REGISTRATION = new BooleanFlag(new BooleanInternalFlag("GENDER_IS_MANDATORY_FOR_REGISTRATION",true,"Makes gender a mandatory field for patient registration"));
		
		public static final BooleanFlag ALLOW_BLOCK_SESSION_WITH_CAB_APPTS = new BooleanFlag(new BooleanInternalFlag("ALLOW_BLOCK_SESSION_WITH_CAB_APPTS",true,"Specify whether a session can be blocked when there is C&B activity associated with it", true)); // FWB-522
		
		public static final IntFlag HEARTS_ADDRESS_LINE_MAXLEN = new IntFlag(new IntInternalFlag( "HEARTS_ADDRESS_LINE_MAXLEN", 30, "Maximum address line length supported in HEARTS", true));
		public static final IntFlag RECODE_ATTENDANCE_UPON_GP_OR_ADDRESS_CHANGE = new IntFlag(new IntInternalFlag("RECODE_ATTENDANCE_UPON_GP_OR_ADDRESS_CHANGE", 14, "Amount of days relative to a patient demographic update to recode attendance."));				
	}
		
	public static final class GEN extends ims.configuration.ConfigFlag.GEN
	{
		public static final StringFlag ED_DASHBOARD_URL = new StringFlag(new StringInternalFlag("ED_DASHBOARD_URL", "", "URL for the ED dashboard."));//FWB-614
		public static final StringFlag THEATRE_CASE_TRACKING_DASHBOARD_URL = new StringFlag(new StringInternalFlag("THEATRE_CASE_TRACKING_DASHBOARD_URL", "", "URL for the Theatre Case Tracking dashboard."));//FWB-609
		public static final StringFlag OUTPATIENT_DASHBOARD_URL = new StringFlag(new StringInternalFlag("OUTPATIENT_DASHBOARD_URL", "", "URL for the Outpatient dashboard."));//FWB-606
		public static final StringFlag CLINICAL_CODING_DASHBOARD_URL = new StringFlag(new StringInternalFlag("CLINICAL_CODING_DASHBOARD_URL", "", "URL for the Clinical Coding dashboard."));//FWB-601
		public static final StringFlag BED_MANAGEMENT_DASHBOARD_URL = new StringFlag(new StringInternalFlag("BED_MANAGEMENT_DASHBOARD_URL", "", "URL for the bed management dashboard."));
		public static final StringFlag CASENOTE_DASHBOARD_URL = new StringFlag(new StringInternalFlag("CASENOTE_DASHBOARD_URL", "", "URL for the case note dashboard.")); //FWB-598
		public static final StringFlag THEATRE_DASHBOARD_URL = new StringFlag(new StringInternalFlag("THEATRE_DASHBOARD_URL", "", "URL for the theatre dashboard."));
		public static final StringFlag PDS_SYNC_GATEWAY_URL = new StringFlag(new StringInternalFlag("PDS_SYNC_GATEWAY_URL", "", "URL for the PDS gateway."));
		public static final StringFlag FILE_SERVER_URL = new StringFlag(new StringInternalFlag("FILE_SERVER_URL", "http://localhost/files/", "URL where the uploaded files will be stored"));		
		public static final StringFlag CUSTOM_UPLOADS_URL = new StringFlag(new StringInternalFlag("CUSTOM_UPLOADS_URL", "http://localhost/uploads/", "URL where the uploaded files will be stored"));
		public static final StringFlag REPORTS_TYPE = new StringFlag(new StringInternalFlag("REPORTS_TYPE", "Crystal", "Use either Crystal or QueryBuilder reports", new String[] {"Crystal", "QueryBuilder"}));
		public static final StringFlag SFCO_BARCODE_URL = new StringFlag(new StringInternalFlag("SFCO_BARCODE_URL", "http://localhost/SoftcoAPI/Barcode.asp", "URL of Softco Barcode Printing service"));
		public static final StringFlag SFCO_VIEW_URL = new StringFlag(new StringInternalFlag("SFCO_VIEW_URL", "http://localhost/SoftcoAPI/ProvideDoc.asp", "URL of Softco scanned image viewing service"));
        public static final StringFlag SENDER_EMAIL = new StringFlag(new StringInternalFlag("SENDER_EMAIL",  "alerts@web.app", "Generic sender's email address"));
        public static final StringFlag UUID_IP = new StringFlag(new StringInternalFlag("UUID_IP", "", "IP Address to be used when obtaining a MAC address for generating UUID's"));        
		public static final StringFlag MSH_REPOSITORY = new StringFlag(new StringInternalFlag("MSH_REPOSITORY", "/hermes/ebxmlms/repository", "Message Handler repository location."));		
		public static final StringFlag MSH_URL = new StringFlag(new StringInternalFlag("MSH_URL", "http://localhost:8080/msh/", "URL of MSH Servlet"));
		public static final StringFlag QUARTZ_SERVER_URL = new StringFlag(new StringInternalFlag("QUARTZ_SERVER_URL", "", "URL of IMS Quartz Scheduler"));
		public static final StringFlag RISK_ASSESSMENT_URL = new StringFlag(new StringInternalFlag("RISK_ASSESSMENT_URL", "", "URL containing Braden scale help document."));
		public static final StringFlag PCI_CLIENT_PREFIX = new StringFlag(new StringInternalFlag("PCI_CLIENT_PREFIX", "ID", "Flag to determine the prefix for PCI Client Identification Number."));		
		public static final StringFlag ICAB_STORE_MESSAGE_LOC = new StringFlag(new StringInternalFlag("ICAB_STORE_MESSAGE_LOC", "", "If ICAB_STORE_MESSAGE is set to TRUE, this should be set pointing to a store folder. Inbound messages will be held in inbound folder off this, and outbound in outbound folder"));
		public static final StringFlag OPENOFFICE_URL = new StringFlag(new StringInternalFlag("OPENOFFICE_URL", "127.0.0.1", "Open Office URL"));
		public static final StringFlag OPENOFFICE_PORT = new StringFlag(new StringInternalFlag("OPENOFFICE_PORT", "8100", "Open Office port"));
		public static final StringFlag APPLICATION_URL = new StringFlag(new StringInternalFlag("APPLICATION_URL", "", "Application URL (to be used when application is behind and Apache web server with mod_alias)"));
		public static final StringFlag MOBILE_UNIT_DIARY_FILEPATH = new StringFlag(new StringInternalFlag("MOBILE_UNIT_DIARY_FILEPATH", "http://", "Used to launch the Excel File which keeps a diary of all the mobile units."));
		public static final StringFlag BATCH_JOB_EXPORT_FOLDER = new StringFlag(new StringInternalFlag("BATCH_JOB_EXPORT_FOLDER", "", "Folder where output of batch reports is saved.")); 
		public static final StringFlag ICAB_CONFIG_FILE = new StringFlag(new StringInternalFlag("ICAB_CONFIG_FILE", "", "Full path and filename of the ICAB Configuration File - replacement of cabgw_configuration.xml", true));  // FWB-183		
		public static final StringFlag DOCUMENT_STORE_LEVEL = new StringFlag(new StringInternalFlag("DOCUMENT_STORE_LEVEL", "Referral", "The level where documents will de saved (Ex: Referral, CareContext, Patient)", new String[] {"Referral", "CareContext", "Patient"}));
		public static final StringFlag OFFICE_CONNECTION_PROTOCOL  = new StringFlag(new StringInternalFlag("OFFICE_CONNECTION_PROTOCOL", "SOCKET", "Office connection protocol (SOCKET or PIPE)", new String[] {"SOCKET", "PIPE"}));
		public static final StringFlag SUPPORT_NETWORK_FAMILY_TYPE = new StringFlag(new StringInternalFlag("SUPPORT_NETWORK_FAMILY_TYPE", "Default", "Which type of support network family should be used.", new String[]{"Default", "CCO"})); // http://jira/browse/FWB-258
		public static final StringFlag CARE_PLAN_FUNCTIONALITY_TYPE = new StringFlag(new StringInternalFlag("CARE_PLAN_FUNCTIONALITY_TYPE", "Default", "Modifies the Care plan evaluation process.", new String[]{"Default", "CCO"}, true)); // http://jira/browse/FWB-263
		public static final StringFlag DOCUMENT_EDITOR_FORMAT  = new StringFlag(new StringInternalFlag("DOCUMENT_EDITOR_FORMAT", "PDF", "Specify the application used for opening the patient documents", new String[]{"PDF","WORD"})); //http://jira/browse/FWB-261
		public static final StringFlag MAXIMS_DOCUMENT_WORK_AREA = new StringFlag(new StringInternalFlag("MAXIMS_DOCUMENT_WORK_AREA", "", "Network location for working area for patient documents")); //http://jira/browse/FWB-280//http://jira/browse/FWB-310
		public static final StringFlag ORDERING_CLINIC_LOCATION_MANDATORY_FIELDS =  new StringFlag(new StringInternalFlag("ORDERING_CLINIC_LOCATION_MANDATORY_FIELDS", "Clinic", "Specify the mandatory location fields when ordering for Outpatents.", new String[]{"Clinic","Outpatient Department","Clinic and Outpatient Department","Outpatient Department - Hide Clinic"}));  //http://jira/browse/FWB-362 
		public static final StringFlag MINIMUM_CONTEXT_REQUIRED_TO_SCAN_OR_IMPORT = new StringFlag(new StringInternalFlag("MINIMUM_CONTEXT_REQUIRED_TO_SCAN_OR_IMPORT", "Care Context", "Specify the minimum context level required to enable where scanning and importing.", new String[]{"Care Context","Episode of Care","None ","Patient","Referral"},true));  //http://jira/browse/FWB-300
		public static final StringFlag DOCUMENT_VIEW_LEVEL = new StringFlag(new StringInternalFlag("DOCUMENT_VIEW_LEVEL", "Care Context", "The minimum context level required to view documents.", new String[]{"Care Context","Patient","Referral"},true));  //http://jira/browse/FWB-301
		public static final StringFlag EVOLVE_URL = new StringFlag(new StringInternalFlag("EVOLVE_URL", "", "URL to access Evolve"));
		public static final StringFlag WARD_DASHBOARD_URL = new StringFlag(new StringInternalFlag("WARD_DASHBOARD_URL", "", "Ward dashboard URL"));
		public static final StringFlag SPECTRUM_WEBSERVICE_URL = new StringFlag(new StringInternalFlag("SPECTRUM_WEBSERVICE_URL", "", "SPECTRUM WebService URL"));
		public static final StringFlag SPECTRUM_WEBSERVICE_USERNAME = new StringFlag(new StringInternalFlag("SPECTRUM_WEBSERVICE_USERNAME", "", "SPECTRUMRL WebService Username"));
		public static final StringFlag SPECTRUM_WEBSERVICE_PARAMETERS = new StringFlag(new StringInternalFlag("SPECTRUM_WEBSERVICE_PARAMETERS", "", "SPECTRUM WebService parameters"));
		public static final StringFlag THEATRE_PROFILE_PROCEDURES = new StringFlag(new StringInternalFlag("THEATRE_PROFILE_PROCEDURES","List Owner", "For Theatre profiles controls where procedures are configured.",new String[]{"List Owner","Service"},true)); //http://jira/browse/FWB-527
		public static final StringFlag PDS_CONFIG_FILE = new StringFlag(new StringInternalFlag("PDS_CONFIG_FILE", "", "Full path and filename of the PDS Configuration File", true));  // FWB-558
		
		
		public static final StringFlag ED_DTA_ADMISSION_FUNCTIONALITY = new StringFlag(new StringInternalFlag("ED_DTA_ADMISSION_FUNCTIONALITY", "PENDING", "Controls the Decision To Admit functionality in ED.",getLookupInstanceNames("ims.emergency.vo.lookups.DTAAdmissionType"),true));//http://jira/browse/FWB-466
		
		public static final StringFlag GENERATE_PATID_TYPE = new StringFlag(new StringInternalFlag("GENERATE_PATID_TYPE", "PATNUM", "Which Patient Identifier Type is created when a patient is registered and USE_PATIENT_NUMBER is true", getLookupInstanceNames("ims.core.vo.lookups.PatIdType")));//http://jira/browse/WDEV-17826
		
		public static final StringFlag EDISCHARGE_DIAGNOSIS_SEARCH_TAXONOMY_TYPE = new StringFlag(new StringInternalFlag("EDISCHARGE_DIAGNOSIS_SEARCH_TAXONOMY_TYPE", "ICD10", "Controls the diagnosis search taxonomy in eDischarge.",new String[]{"READ3","SNOMED","ICD10","NAT_SPEC_CODE ","NAT_TREAT_CODE","OPCS4","VTM","VMP","AMP"}));//http://jira/browse/FWB-494
		 
		public static final BooleanFlag START_CABGW = new BooleanFlag(new BooleanInternalFlag("START_CABGW", false, "Determine whether to start the CabGw Engine regardless of whether it is specified in web.xml or not", true));
		//MN the default for release mode should be true please do not change !!
		public static final BooleanFlag PMH_CONFIG_USE_SPECIALTY = new BooleanFlag(new BooleanInternalFlag("PMH_CONFIG_USE_SPECIALTY", true, "Configure PMH using Specialties.", true));
		public static final BooleanFlag ALLOW_NON_MOS_USERS = new BooleanFlag(new BooleanInternalFlag("ALLOW_NON_MOS_USERS", false, "Allow creation of App. Users not linked to a Member of Staff record.", true ));
		public static final BooleanFlag ALLOW_CONS_PAS_ID_UPDATE = new BooleanFlag(new BooleanInternalFlag("ALLOW_CONS_PAS_ID_UPDATE", true, "Allow updates of Consultants PAS Identifier. Set to FALSE if Consultants received via PAS interface.", true ));
		public static final BooleanFlag ALLOW_DUPLICATE_NHS_NUMBERS = new BooleanFlag(new BooleanInternalFlag("ALLOW_DUPLICATE_NHS_NUMBERS", false, "Determines whether to allow duplicate NHS Numbers on the database - duplicates stored as (DupX)", true));
		public static final BooleanFlag ALLOW_CLINIC_EDIT = new BooleanFlag(new BooleanInternalFlag("ALLOW_CLINIC_EDIT", true, "Enables/Disables to editing of Clinics. Turned off when Clinics populated from PAS Interface.", true));
		public static final BooleanFlag ALLOW_LOOKUP_TEXT_EDIT = new BooleanFlag(new BooleanInternalFlag("ALLOW_LOOKUP_TEXT_EDIT", false, "Enables/Disables editing of Lookup Instance Text. If disabled, user will be prompted for password.", true));
		public static final BooleanFlag ENABLE_ASSESSMENTS_IN_NAV_CFG = new BooleanFlag(new BooleanInternalFlag("ENABLE_ASSESSMENTS_IN_NAV_CFG", true, "Enables the Assessment selection grid and right click menu items in Navigation Config.", true));
		public static final BooleanFlag USE_SERVICE_MANAGER_IN_FORMLOADER = new BooleanFlag(new BooleanInternalFlag("USE_SERVICES_MANAGER_IN_FORMLOADER", false, "Use the Services Manager in FormLoader to load domain objects", true));
		public static final BooleanFlag USE_DOMAIN_AS_SERVICE_MANAGER = new BooleanFlag(new BooleanInternalFlag("USE_DOMAIN_AS_SERVICE_MANAGER", true, "Use the Domain Impl FlyweightFactory as Services Manager", true));
		public static final BooleanFlag SHOW_PROCEDURE_PRICING = new BooleanFlag(new BooleanInternalFlag("SHOW_PROCEDURE_PRICING", false, "Show Procedure Pricing functionality in Administration forms.", true));
		public static final BooleanFlag ICAB_STORE_MESSAGE = new BooleanFlag(new BooleanInternalFlag("ICAB_STORE_MESSAGE", false, "Controls whether Choose & Book messages are stored by the application."));
		public static final BooleanFlag USE_APPLET_FOR_UPLOADING_FILE = new BooleanFlag(new BooleanInternalFlag("USE_APPLET_FOR_UPLOADING_FILE", false, "Determines if the applet will be used to upload a file. If true, JRE needs to be installed on all client machines.", true));
		public static final BooleanFlag PROMPT_FOR_REPORT_PARAMS = new BooleanFlag(new BooleanInternalFlag("PROMPT_FOR_REPORT_PARAMS", false, "If true, when a job gets started manually it will prompt the user to enter the params for the report linked against that job"));
		public static final BooleanFlag ALLOW_UPDATES_TO_NHS_NO  = new BooleanFlag(new BooleanInternalFlag("ALLOW_UPDATES_TO_NHS_NO", false, "Allow updates to NHS number",true));
		public static final BooleanFlag ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS  = new BooleanFlag(new BooleanInternalFlag("ALLOW_LINK_EXISTING_APPOINTMENTS_AND_ORDERS", false, "To allow linking of existing appointments and Orders in the ReferralAppointmentDetails screen",true));  // FWB-178
		public static final BooleanFlag PUKKAJ_ENABLED = new BooleanFlag(new BooleanInternalFlag("PUKKAJ_ENABLED", false, "Enables support for diagnostic only referrals",true));  // FWB-194 
		public static final BooleanFlag CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL = new BooleanFlag(new BooleanInternalFlag("CREATE_ICP_ON_ACCEPTANCE_OF_REFERRAL", false, "Create an ICP once the Referral is Accepted",true));  // FWB-195
		public static final BooleanFlag DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARY = new BooleanFlag(new BooleanInternalFlag("DISPLAY_DISCHARGE_OUTCOME_INFO_ON_PATIENT_SUMMARY", false, "Displays discharge reason on Patient Summary Grid"));  // FWB-197
		public static final BooleanFlag SHOW_PRESENTATION_TAB = new BooleanFlag(new BooleanInternalFlag("SHOW_PRESENTATION_TAB", false, "Whether to show the Presentation tab in Referral Details dialog"));  // FWB-207
		public static final BooleanFlag ALLOW_RE_ADMIT_FUNCTIONALITY  = new BooleanFlag(new BooleanInternalFlag("ALLOW_RE_ADMIT_FUNCTIONALITY", false, "Whether to allow re-admission of a Patient"));  // FWB-208
		public static final BooleanFlag SHOW_VIRTUAL_EVENT_ONLY  = new BooleanFlag(new BooleanInternalFlag("SHOW_VIRTUAL_EVENT_ONLY", true, "Show virtual event only"));  // FWB-216
		public static final BooleanFlag USE_ORDERING_HOSPITAL_LOCATION  = new BooleanFlag(new BooleanInternalFlag("USE_ORDERING_HOSPITAL_LOCATION", false, "Link a locsite to the CareContext for ordering and include PASID for locsite in Order Message and label"));  
		public static final BooleanFlag SEND_PUSH_NOTIFICATIONS  = new BooleanFlag(new BooleanInternalFlag("SEND_PUSH_NOTIFICATIONS", false, "Sends push notification using Apple Push Notifications Server"));
		public static final BooleanFlag LINK_REFERRALS_TO_EPISODE  = new BooleanFlag(new BooleanInternalFlag("LINK_REFERRALS_TO_EPISODE", false, "Allow Linking of Referrals to Episodes.",true));
		public static final BooleanFlag AUTODETECT_DOCUMENT_EDITOR = new BooleanFlag(new BooleanInternalFlag("AUTODETECT_DOCUMENT_EDITOR", false, "Automatically launch MS Word editor ", true));
		public static final BooleanFlag CANCEL_APPOINTMENTS_WHEN_DOD_ENTERED  = new BooleanFlag(new BooleanInternalFlag("CANCEL_APPOINTMENTS_WHEN_DOD_ENTERED",false,"Cancels appointments when DOD entered ",true));
		public static final BooleanFlag LOG_REPORT_EXECUTION = new BooleanFlag(new BooleanInternalFlag("LOG_REPORT_EXECUTION ",true,"Logs report execution details to the system log."));
		public static final BooleanFlag COMPRESS_REPORT_DATA = new BooleanFlag(new BooleanInternalFlag("COMPRESS_REPORT_DATA",true,"Compress report data to reduce memory overhead running reports."));
		public static final BooleanFlag CONTRACT_CCG_ENABLED = new BooleanFlag(new BooleanInternalFlag("CONTRACT_CCG_ENABLED",true,"Controls if CCG codes are mandatory."));//http://jira/browse/FWB-516
		
		public static final BooleanFlag SITE_USES_ORDER_BLEEP_EXT_NUMBER = new BooleanFlag(new BooleanInternalFlag("SITE_USES_ORDER_BLEEP_EXT_NUMBER ",false,"During ordering a Bleep / Extension Number may be recorded and sent with the order message."));//FWB-438
		
		//Billing Demo
		public static final BooleanFlag SHOW_REFERRAL_DETAILS_BILLING_TABS  = new BooleanFlag(new BooleanInternalFlag("SHOW_REFERRAL_DETAILS_BILLING_TABS", false, "For Billing demo show Referral Details Payor Details and Contract Details tabs ", true));
		public static final BooleanFlag SHOW_INTRA_OPERATIVE_PACKAGES_AND_CONSUMABLES_TAB  = new BooleanFlag(new BooleanInternalFlag("SHOW_INTRA_OPERATIVE_PACKAGES_AND_CONSUMABLES_TAB", false, "For Billing demo show Packages and Consumables tab on IntraOperativeCareRecord form ", true));
		
		// Dementia
		public static final BooleanFlag DEMENTIA_FUNCTIONALITY  = new BooleanFlag(new BooleanInternalFlag("DEMENTIA_FUNCTIONALITY", false, "Speficies whether the Dementia Functionality should be incorporated as part of the HL7 processing", true));  // FWB-427
		public static final BooleanFlag DEMENTIA_ALLOW_SAVE_EDISCHARGE_DISCHARGEDETAILS = new BooleanFlag(new BooleanInternalFlag("DEMENTIA_ALLOW_SAVE_EDISCHARGE_DISCHARGEDETAILS", true, "When TRUE there will be no check in eDischarge to see if the Dementia FAIR process is completed."));  // FWB-432
		
//FWB-511		public static final BooleanFlag ED_CAN_DISCHARGE_FROM_ED_WITHOUT_CODING = new BooleanFlag(new BooleanInternalFlag("ED_CAN_DISCHARGE_FROM_ED_WITHOUT_CODING", true, "When true the patient can be discharged from ED without coding details being completed for the attendance."));  // FWB-457
		public static final BooleanFlag ED_CAN_DISCHARGE_FROM_ED_WITHOUT_GP_ADVICE = new BooleanFlag(new BooleanInternalFlag("ED_CAN_DISCHARGE_FROM_ED_WITHOUT_GP_ADVICE", true, "When true the patient can be discharged from ED without recording Actions, Comments and Advise for GP."));  // FWB-469
		
		public static final BooleanFlag CREATE_NEW_PATIENTDOCUMENT_ON_PRINTREPORTDIALOG = new BooleanFlag(new BooleanInternalFlag("CREATE_NEW_PATIENTDOCUMENT_ON_PRINTREPORTDIALOG", false, "Controls the option to create a patient document when printing.",true));  // FWB-470
		public static final BooleanFlag USE_ELECTIVE_LIST_FUNCTIONALITY = new BooleanFlag(new BooleanInternalFlag("USE_ELECTIVE_LIST_FUNCTIONALITY", false, "Enables the Elective List functionality.",true));  // http://jira/browse/FWB-482
		public static final BooleanFlag PATIENT_SEARCH_ALLOW_NUMERIC_CHARS = new BooleanFlag(new BooleanInternalFlag("PATIENT_SEARCH_ALLOW_NUMERIC_CHARS", false, "Enables the use of numeric chars in Surname and Forename patient searches.",true));  // http://jira/browse/FWB-490
		
		public static final BooleanFlag PRESCRIPTION_ALLOW_FREETEXT_MEDICATION = new BooleanFlag(new BooleanInternalFlag("PRESCRIPTION_ALLOW_FREETEXT_MEDICATION", false, "Enables the use of a text field when adding medications."));  // http://jira/browse/FWB-505
		public static final BooleanFlag PRESCRIPTION_EXCLUDE_CONTROLLED_DRUGS_ON_SEARCH = new BooleanFlag(new BooleanInternalFlag("PRESCRIPTION_EXCLUDE_CONTROLLED_DRUGS_ON_SEARCH", false, "Excludes controlled drugs from the medication search."));  // http://jira/browse/FWB-505
		public static final BooleanFlag ED_USE_CUSTOM_ATTENDANCE_ID = new BooleanFlag(new BooleanInternalFlag("ED_USE_CUSTOM_ATTENDANCE_ID", false, "Controls if a custom emergency attendance ID is displayed",true));  // http://jira/browse/FWB-514
		public static final BooleanFlag MRN_PROVIDED_BY_EXTERNAL_PAS = new BooleanFlag(new BooleanInternalFlag("MRN_PROVIDED_BY_EXTERNAL_PAS", false, "Controls if the MRN status field is used",true));  // http://jira/browse/FWB-515
		public static final BooleanFlag ASSESSMENTS_SAVE_PDF_ENABLED = new BooleanFlag(new BooleanInternalFlag("ASSESSMENTS_SAVE_PDF_ENABLED", false, "Controls the option to save a completed assessment as a patient document regardless of assessment configuration",true));  // http://jira/browse/FWB-512
		
		public static final BooleanFlag CHECK_DUPLICATE_PATIENT_REFERRALS = new BooleanFlag(new BooleanInternalFlag("CHECK_DUPLICATE_PATIENT_REFERRALS", false, "Checks for existing active referrals for the patient when creating a new refarral"));  // http://jira/browse/FWB-524
		public static final BooleanFlag BED_MANAGEMENT_APPLY_MIXED_SEX_LOGIC = new BooleanFlag(new BooleanInternalFlag("BED_MANAGEMENT_APPLY_MIXED_SEX_LOGIC", false, "Controls if the mixed sex logic is applied in Bed Management"));  // http://jira/browse/FWB-576
		public static final BooleanFlag ED_OBSERVATIONS_HIDE_VITAL_SIGNS_FOR_PAEDIATRICS = new BooleanFlag(new BooleanInternalFlag("ED_OBSERVATIONS_HIDE_VITAL_SIGNS_FOR_PAEDIATRICS", false, "Hides the OBS tab for paediatric patients on the ED Assessment form"));  // http://jira/browse/WDEV-21142
		public static final BooleanFlag PATIENT_SEARCH_RETRIEVE_QUICKREGISTRATION_PATIENTS = new BooleanFlag(new BooleanInternalFlag("PATIENT_SEARCH_RETRIEVE_QUICKREGISTRATION_PATIENTS", false, "When true patient search will include quick registation patients"));  // http://jira/browse/FWB-579
		public static final BooleanFlag ENFORCE_WAITINGLIST_THEATRE_BOOKING_RULES = new BooleanFlag(new BooleanInternalFlag("ENFORCE_WAITINGLIST_THEATRE_BOOKING_RULES", true, "When true the waiting list theatre booking rules are enforced"));  // http://jira/browse/FWB-580
		public static final BooleanFlag BOOKING_APPOINTMENT_PERFORM_AUTO_PDS_LOOKUP = new BooleanFlag(new BooleanInternalFlag("BOOKING_APPOINTMENT_PERFORM_AUTO_PDS_LOOKUP", true, "When true booking an appointment performs an auto PDS lookup"));  // http://jira/browse/FWB-583
		public static final BooleanFlag ELECTIVE_LIST_TCI_GIVEN_PERFORM_AUTO_PDS_LOOKUP = new BooleanFlag(new BooleanInternalFlag("ELECTIVE_LIST_TCI_GIVEN_PERFORM_AUTO_PDS_LOOKUP", true, "When true giving a TCI performs an auto PDS lookup"));  // http://jira/browse/FWB-583
		public static final StringFlag ANALYTE_CHECK_NOT_REQUIRED_VALUETYPES = new StringFlag(new StringInternalFlag("ANALYTE_CHECK_NOT_REQUIRED_VALUETYPES", "", "Comma separated list of OBX value types where the analyte check is skipped",true));  // http://jira/browse/WDEV-16826
		
		public static final IntFlag DEMENTIA_WORKLIST_TIMER_INTERVAL = new IntFlag(new IntInternalFlag("DEMENTIA_WORKLIST_TIMER_INTERVAL", 300, "Specifies the interval rate in seconds at which Dementia Worklist will be refreshed automatically."));  // FWB-435
		
		public static final IntFlag PASSWD_EXP_INCREMENT = new IntFlag(new IntInternalFlag("PASSWD_EXP_INCREMENT", 14, "Number of days to increment user password expiry date by when new password is set"));
		public static final IntFlag INVOICE_THRESHOLD = new IntFlag(new IntInternalFlag("INVOICE_THRESHOLD", 100000, "The threshold in for an invoice requiring a second authorizing user."));
		public static final IntFlag PAEDIATRIC_AGE = new IntFlag(new IntInternalFlag("PAEDIATRIC_AGE", 16, "Cut off from Paediatric to Adult age"));
		public static final IntFlag HCP_FAVOURITE_MEDICATIONS_LIST_SIZE = new IntFlag(new IntInternalFlag("HCP_FAVOURITE_MEDICATIONS_LIST_SIZE", 10, "HCPs Favourite Medications list size."));//FWB-293
		
		public static final IntFlag EMERGENCY_ATTENDANCE_UNSCHEDULED_RETURN_RULE_DAYS = new IntFlag(new IntInternalFlag("EMERGENCY_ATTENDANCE_UNSCHEDULED_RETURN_RULE_DAYS", 28, "The number of days that a new attendance can be selected as unscheduled for an existing episode."));//FWB-379
		public static final IntFlag EMERGENCY_ATTENDANCE_SCHEDULED_RETURN_RULE_DAYS = new IntFlag(new IntInternalFlag("EMERGENCY_ATTENDANCE_SCHEDULED_RETURN_RULE_DAYS", 28, "The number of days that a new attendance can be selected as scheduled for an existing episode."));//FWB-379
		
		public static final IntFlag ED_WAIT_TIME_REQUIRING_BREACH_REASON = new IntFlag(new IntInternalFlag("ED_WAIT_TIME_REQUIRING_BREACH_REASON", 240, "The number of minutes of ED wait time that requires a reason specified when discharging."));//FWB-458 //FWB-517
		
		public static final IntFlag HCG_TEST_LOWER_AGE_LIMIT = new IntFlag(new IntInternalFlag("HCG_TEST_LOWER_AGE_LIMIT", 14, "Sets the lower age limit for the HCG Urine Test prompt."));//FWB-513
		public static final IntFlag HCG_TEST_UPPER_AGE_LIMIT = new IntFlag(new IntInternalFlag("HCG_TEST_UPPER_AGE_LIMIT", 60, "Sets the upper age limit for the HCG Urine Test prompt."));//FWB-508
		public static final IntFlag ISAR_ASSESSMENT_AGE_LIMIT = new IntFlag(new IntInternalFlag("ISAR_ASSESSMENT_AGE_LIMIT", 65, "Sets the age limit for the ISAR assessment prompt."));//FWB-509
		public static final IntFlag REFERRAL_FOR_SERVICE_WITHIN_DAYS = new IntFlag(new IntInternalFlag("REFERRAL_FOR_SERVICE_WITHIN_DAYS", 5, "Days to check for duplicate referrals within a service on referral creation."));//FWB-529
	}

	public static final class DTO extends ims.configuration.ConfigFlag.DTO
	{
		public static final StringFlag USER_REPLICATION_SERVICE = new StringFlag(new StringInternalFlag("USER_REPLICATION_SERVICE", "APP_USERS", "Specify whether to call USER or APP_USERS servers on user replication", new String[] {"APP_USERS", "USER", "BOTH"}, true));
	
		public static final BooleanFlag PAT_SEARCH_ADD_WILDCARD = new BooleanFlag(new BooleanInternalFlag("PATIENT_SEARCH_ADD_WILDCARD", false, "Add Wildcard ? to Surname and Forename in Patient Search", false)); // wdev-4219
		public static final BooleanFlag EXTENDED_OP_NOTES_TEMPLATE_FIELDS = new BooleanFlag(new BooleanInternalFlag("EXTENDED_OP_NOTES_TEMPLATE_FIELDS", false, "Use extended Op notes template fields.")); // FWB-295 

		public static final IntFlag SCHEDULER_APPT_INTERVAL = new IntFlag(new IntInternalFlag("SCHEDULER_APPT_INTERVAL", 10, "Number of minutes to use for appointment time range"));
	}

	public static final class HL7 extends ims.configuration.ConfigFlag.HL7
	{
		public static final StringFlag HL7_FACILITY = new StringFlag(new StringInternalFlag("HL7_FACILITY", "IMS", "Default HL7 Facility name."));
		public static final StringFlag HL7_RECEIVING_FACILITY = new StringFlag(new StringInternalFlag("HL7_RECEIVING_FACILITY", "IMS", "Default HL7 Receiving Facility name."));
		public static final StringFlag HL7_APPLICATION = new StringFlag(new StringInternalFlag("HL7_APPLICATION", "MAXIMS ADT/OCS", "Default HL7 Application name."));
		public static final StringFlag HL7_PROCESSING_ID = new StringFlag(new StringInternalFlag("HL7_PROCESSING_ID","P", "Indicates whether (P)roduction, (T)raining or (D)ebugging system is in use.", new String[] {"P", "T", "D"}));
		public static final StringFlag HL7_STORE_INBOUND_LOC = new StringFlag(new StringInternalFlag("HL7_STORE_INBOUND_LOC", "", "If HL7_STORE_INBOUND_MSG is set to TRUE, this should be set pointing to a store folder."));
		public static final StringFlag HL7NASAPP_CLASSNAME = new StringFlag(new StringInternalFlag("HL7NASAPP_CLASSNAME", "ims.hl7.nas.HL7NasApplication", "Which class to use as the NAS Application launched by the HL7NasListener", new String[] {"ims.hl7.nas.HL7NasApplication", "ims.hl7.nas.HL7PasApplication"}, true));
		public static final StringFlag HL7_EXTERNAL_LISTENER_HOST = new StringFlag(new StringInternalFlag("HL7_EXTERNAL_LISTENER_HOST", "localhost", "Hostname of External HL7 Listener to which deferred processing responses are sent"));
		public static final StringFlag CLEARSPAN_AUDIT_DATASOURCE  = new StringFlag(new StringInternalFlag("CLEARSPAN_AUDIT_DATASOURCE", "", "Datasource of the ClearSpan audit database"));
		public static final StringFlag HL7_MDM_DOCUMENT_SHARE  = new StringFlag(new StringInternalFlag("HL7_MDM_DOCUMENT_SHARE", "c:/MDM_FILES", "Directory or fileshare where files referenced in MDM messages are copied to from Maxims."));
		public static final StringFlag DEFAULT_ORDER_CONTROL_SC_STATUS = new StringFlag(new StringInternalFlag("DEFAULT_ORDER_CONTROL_SC_STATUS", "", "If OCR-1 contains SC and this is set then Investigation status is set to this value",getLookupInstanceNames("ims.ocrr.vo.lookups.OrderInvStatus")));
		
		public static final StringFlag ORDER_CATEGORY_HL7_FIELD = new StringFlag(new StringInternalFlag("ORDER_CATEGORY_HL7_FIELD", "PV1-18", "HL7 field the Order Category in included in Order messages",new String[]{"PV1-18","PV1-20"}));//WDEV-12841

		public static final BooleanFlag HL7_START_LISTENER = new BooleanFlag(new BooleanInternalFlag("HL7_START_LISTENER", false, "Controls whether a HL7 Listener is started within this WebApp instance."));
		public static final BooleanFlag HL7_START_OUTBOUND = new BooleanFlag(new BooleanInternalFlag("HL7_START_OUTBOUND", false, "Controls whether a HL7 Outbound Thread is started within this WebApp instance."));
		public static final BooleanFlag HL7_STORE_INBOUND_MSG = new BooleanFlag(new BooleanInternalFlag("HL7_STORE_INBOUND_MSG", false, "Controls whether inbound messages are stored by the application."));
		public static final BooleanFlag HL7_MAXIMS_RIS = new BooleanFlag    (new BooleanInternalFlag("HL7_MAXIMS_RIS", false, "Sets destination system type to MAXIMS Radiology.",true));
		public static final BooleanFlag INSTANTIATE_EPISODE_FROM_ADT = new BooleanFlag(new BooleanInternalFlag("INSTANTIATE_EPISODE_FROM_ADT", false, "Specifies whether a CareContext etc. needs to be created on receipt of ADT messages.",true));
		public static final BooleanFlag INPATIENT_EPISODE_MANAGEMENT_FROM_PAS  = new BooleanFlag(new BooleanInternalFlag("INPATIENT_EPISODE_MANAGEMENT_FROM_PAS", false, "Specifies if Care context is updated by PAS for inpatients.",true));
		public static final BooleanFlag ADT_IN_UPDATE_PARTIAL_ADMISSION_ONLY  = new BooleanFlag(new BooleanInternalFlag("ADT_IN_UPDATE_PARTIAL_ADMISSION_ONLY", false, "If true inbound ADT (A01 A08 A11)messages only update the partial admission.",true));
		// wdev-3656
		public static final BooleanFlag HL7_STRIP_PATIENT_IDENTIFIER_CHARACTER = new BooleanFlag(new BooleanInternalFlag("HL7_STRIP_PATIENT_IDENTIFIER_CHARACTER", false, "This system flag was created as BHRT HL7Interface required patient identifiers first character to be stripped for non NHS and District Numbers", true));
		
		// FWB-171
		public static final BooleanFlag PERSISTENT_HL7_OUTBOUND_CONNECTION = new BooleanFlag(new BooleanInternalFlag("PERSISTENT_HL7_OUTBOUND_CONNECTION", false, "This system flag specifies whether the outbound socket link is persistent or not", true));
		public static final BooleanFlag REJECT_RESULTS_FOR_UNKNOWN_ORDERINGPROVIDER_OR_LOCATION = new BooleanFlag(new BooleanInternalFlag("REJECT_RESULTS_FOR_UNKNOWN_ORDERINGPROVIDER_OR_LOCATION", true, "Reject a result message if the Ordering provider or Location has a value but it is unknown in Maxims"));
		public static final BooleanFlag HL7_PROCESS_EXTENDED_ALERT_DATA = new BooleanFlag(new BooleanInternalFlag("HL7_PROCESS_EXTENDED_ALERT_DATA", false, "Process extended alert data in ADT messages"));//http://jira/browse/FWB-408
		
		public static final BooleanFlag UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION = new BooleanFlag(new BooleanInternalFlag("UNSOLICTED_NEW_SPECIMEN_PER_INVESTIGATION", false, "Creates new specimen records for every investigation in unsolicted HL7 messages",true));//http://jira/browse/WDEV-16304

		
		public static final IntFlag HL7_PORT = new IntFlag(new IntInternalFlag("HL7_PORT", 8888, "HL7 Engine Port"));		
		public static final IntFlag HL7_EXTERNAL_LISTENER_PORT = new IntFlag(new IntInternalFlag("HL7_EXTERNAL_LISTENER_PORT", 10000, "Port used by External HL7 Listener to which deferred processing responses are sent"));		
		public static final IntFlag HL7_STORE_COUNT = new IntFlag(new IntInternalFlag("HL7_STORE_COUNT", 10, "Size of buffer for holding recently received messages."));
		public static final IntFlag HL7_OUTBOUND_SLEEP = new IntFlag(new IntInternalFlag("HL7_OUTBOUND_SLEEP", 10, "Sleep interval for outbound interface thread to poll for new orders. In Seconds."));		
		// WDEV-5927
		public static final BooleanFlag HL7_OUTBOUND_READ_RESP = new BooleanFlag    (new BooleanInternalFlag("HL7_OUTBOUND_READ_RESP", false, "Sets whether to process response (ACK/NAK) from remote system.",true));
		public static final StringFlag EXTENDED_HL7_PROCESSING = new StringFlag(new StringInternalFlag("EXTENDED_HL7_PROCESSING", "None", "Extended HL7 Message processing", new String[] {"None","CARE_UK","ChangeOrderResponse","Configured"},true));
		public static final StringFlag HL7_OUTBOUND_DOCUMENT_SHARE = new StringFlag(new StringInternalFlag("HL7_OUTBOUND_DOCUMENT_SHARE","","Windows File share for outbound documents. i.e. GP Referral Documents"));
		public static final StringFlag HL7_INBOUND_DOCUMENT_SHARE = new StringFlag(new StringInternalFlag("HL7_INBOUND_DOCUMENT_SHARE","","Windows File share for inbound documents. i.e. Result reports as PDFs"));
		public static final StringFlag CUSTOM_OCS_NUMBER_PREFIX  = new StringFlag(new StringInternalFlag("CUSTOM_OCS_NUMBER_PREFIX","X","OCS number prefix for use with custom Placer number generator."));
		
		//WDEV-9674
		public static final BooleanFlag HEARTS_GP_MODEL = new BooleanFlag    (new BooleanInternalFlag("HEARTS_GP_MODEL", false, "Sets HEARTS GP Interface behaviour.",true));
		public static final BooleanFlag SEND_ONLY_VERIFIED_NHSN = new BooleanFlag    (new BooleanInternalFlag("SEND_ONLY_VERIFIED_NHSN", false, "Only sends the patients NHS number if it is verified"));
		//
		public static final BooleanFlag VALIDATE_MSG_PATIENT_WITH_ORDER_PATIENT = new BooleanFlag(new BooleanInternalFlag("VALIDATE_MSG_PATIENT_WITH_ORDER_PATIENT", true, "Checks the patient in the ocs message is the same as patient stored in the order."));
		public static final BooleanFlag ALLOW_HL7_UPDATES_TO_LOCATION_AND_CONSULTANT  = new BooleanFlag(new BooleanInternalFlag("ALLOW_HL7_UPDATES_TO_LOCATION_AND_CONSULTANT", false, "Allows the OCS HL7 interface update the Ordering Location (ward or clinic), the Responsible HCP or GP"));
		public static final BooleanFlag ALLOW_XO_CHANGE_INV_TO_NEW_SERVICE  = new BooleanFlag(new BooleanInternalFlag("ALLOW_XO_CHANGE_TO_NEW_SERVICE", false, "Allows clinical imaging systems change investigations to a different service than originally ordered."));
		public static final BooleanFlag USE_ORN_NUMBERS_FOR_CORRESPONDENCE_ADDRESS = new BooleanFlag(new BooleanInternalFlag("USE_ORN_NUMBERS_FOR_CORRESPONDENCE_ADDRESS", false, "When true home and work phone numbers of type ORN will be populated into the corresponence address."));//FWB-380
		public static final BooleanFlag REMOVE_HL7_INDENT_FORMATTING = new BooleanFlag(new BooleanInternalFlag("REMOVE_HL7_INDENT_FORMATTING", false, "Strips out the .in HL7 formatting when the message is initially processed."));//FWB-403
		public static final BooleanFlag INCLUDE_EMAIL_FORMATTED_WORK_NUMBERS = new BooleanFlag(new BooleanInternalFlag("INCLUDE_EMAIL_FORMATTED_WORK_NUMBERS", true, "When false strips out work phone number that look like email addresses from outbound HL7 messages"));//http://jira/browse/WDEV-18951
		public static final BooleanFlag HL7_INCLUDE_FAMILY_SUPPORT= new BooleanFlag(new BooleanInternalFlag("HL7_INCLUDE_FAMILY_SUPPORT", false, "When true includes Family Support Network details as NOK segments in HL7 messages."));//http://jira/browse/WDEV-19555
		public static final BooleanFlag USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN= new BooleanFlag(new BooleanInternalFlag("USE_CONFIGURED_TAXONOMYTYPES_FOR_XCN", false, "When true includes all MOS/GP identifiers with Provider System mappings for the TaxonomyType"));//http://jira/browse/WDEV-21000
		
		
	}

	public static final class RCHTIM extends ims.configuration.ConfigFlag.RCHTIM
	{
		public static final StringFlag HL7_EXT_SYSTEM = new StringFlag(new StringInternalFlag("HL7_EXT_SYSTEM", "HL7", "External System name used for reverse lookup translation calls."));
		public static final StringFlag HL7_PRIMARY_PATID = new StringFlag(new StringInternalFlag("HL7_PRIMARY_PATID",  "NHS", "Identifier type code in use for interface primary patient identifier type."));
		public static final StringFlag HL7_IDTYPE_COMPONENT = new StringFlag(new StringInternalFlag("HL7_IDTYPE_COMPONENT", "C5", "Identifier type code in use for interface primary patient identifier type.", new String[] {"C4", "C5"}, true));
		public static final StringFlag HL7_NHSN_IDTYPE_CODE = new StringFlag(new StringInternalFlag("HL7_NHSN_IDTYPE_CODE",  "NSHN", "Identifier type code in use for identifying the patient NHS Number.", true));
		public static final StringFlag HL7_HOSPNUM_IDTYPE_CODE = new StringFlag(new StringInternalFlag("HL7_HOSPNUM_IDTYPE_CODE", "HOSPNUM", "Identifier type code in use for identifying the patient Hospital Number.", true));		
	}
	
	public static IFlag[] getFlags(String className) 
	{
		if (className.equals("FW"))
		{
			return getFlags(FW.class);
		}
		else if (className.equals("DOM"))
		{
			return getFlags(DOM.class);
		}
		else if (className.equals("UI"))
		{
			return getFlags(UI.class);
		}
		else if (className.equals("HL7"))
		{
			return getFlags(HL7.class);
		}
		else if (className.equals("GEN"))
		{
			return getFlags(GEN.class);
		}
		else if (className.equals("DTO"))
		{
			return getFlags(DTO.class);
		}
		else if (className.equals("RCHTIM"))
		{
			return getFlags(RCHTIM.class);
		}
		else return null;
	}

	public static IFlag saveFlag(String flagName, Object flagValue) throws Exception
	{
		AFlag flag = ConfigFlag.getConfigFlag(flagName);
		if (flag != null)
			return saveFlag(flag, flagName, flagValue);
		return null;
	}
}
