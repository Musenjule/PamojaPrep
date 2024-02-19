package com.muss.pamoja_prep;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class TermsAndConditions2 extends AppCompatActivity {

    private MaterialAlertDialogBuilder materialAlertDialogBuilder;

    private CheckBox checkBox;
    private Button btnNext, back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions2);

        getSupportActionBar();


        checkBox = findViewById(R.id.checkId);
        btnNext = findViewById(R.id.btnNext);
        back = findViewById(R.id.backBtn);

        btnNext.setEnabled(false);

        materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermsAndConditions2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    materialAlertDialogBuilder.setTitle("Terms And Conditions");
                    materialAlertDialogBuilder.setMessage("Firebase Data_Processing_and_Security_Terms\n" +
                            "\n" +
                            "bookmark_border last modified: June 1, 2023 | Previous versions\n" +
                            "\n" +
                            "The customer agreeing to these terms (\"Customer\"), and Google LLC (formerly known as Google Inc.), Google Ireland Limited, Google Asia Pacific Pte. Ltd., or any other entity that directly or indirectly controls, is controlled by, or is under common control with Google LLC (as applicable, \"Google\"), have entered into an agreement under which Google has agreed to provide Firebase Services (as described at https://firebase.google.com/terms) which specifically reference the Firebase Data Processing and Security Terms (as amended from time to time, the \"Agreement\").\n" +
                            "\n" +
                            "These Firebase Data Processing and Security Terms, including their appendices, (the \"Terms\") are incorporated into the Agreement. These Terms will be effective and replace any previously applicable data processing and security terms as from the Terms Effective Date (as defined below). \u200BWith respect to the Firebase Crashlytics and Firebase App Distribution Terms of Service under which Google has agreed to provide Firebase Crashlytics and Firebase App Distribution Services, these Terms were formerly known as the \"Crashlytics and App Distribution Data Processing and Security Terms.\"\n" +
                            "\n" +
                            "1. Introduction\n" +
                            "These Terms reflect the parties \\\\ agreement with respect to the terms governing the processing and security of Customer Data under the Agreement.\n" +
                            "\n" +
                            "2. Definitions\n" +
                            "2.1 Capitalized terms used but not defined in these Terms have the meanings set out in the Agreement. In these Terms, unless stated otherwise:\n" +
                            "\n" +
                            "Account has the meaning given in the Agreement or, if no such meaning is given, means Customer\\'s account for the Services.\n" +
                            "Additional Product means a product, service or application provided by Google or a third party that: (a) is not part of the Services; and (b) is accessible for use within the user interface of the Services or is otherwise integrated with the Services.\n" +
                            "Additional Security Controls means security resources, features, functionality and/or controls that Customer may use at its option and/or as it determines, including the Admin Console and other features and/or functionality of the Services such as logging and monitoring and identity and access management.\n" +
                            "Adequate Country means:\n" +
                            "(a) for data processed subject to the EU GDPR: the EEA, or a country or territory recognized as ensuring adequate data protection under the EU GDPR;\n" +
                            "\n" +
                            "(b) for data processed subject to the UK GDPR: the UK or a country or territory recognized as ensuring adequate data protection under the UK GDPR and the Data Protection Act 2018; and/or\n" +
                            "\n" +
                            "© for data processed subject to the Swiss FDPA: Switzerland, or a country or territory that is (i) included in the list of the states whose legislation ensures adequate protection as published by the Swiss Federal Data Protection and Information Commissioner, or (ii) recognized as ensuring adequate data protection under the Swiss FDPA,\n" +
                            "\n" +
                            "in each case, other than on the basis of an optional data protection framework.\n" +
                            "\n" +
                            "Admin Console has the meaning given in the Agreement or, if no such meaning is given, means the online console(s) and/or tool(s) provided by Google to Customer for administering the Services.\n" +
                            "Affiliate has the meaning given in the Agreement or, if no such meaning is given, means any entity that directly or indirectly controls, is controlled by, or is under common control with, a party.\n" +
                            "Alternative Transfer Solution means a solution, other than SCCs, that enables the lawful transfer of personal data to a third country in accordance with European Data Protection Law, for example a data protection framework recognized as ensuring that participating local entities provide adequate protection.\n" +
                            "Audited Services means the then-current Services indicated as being in-scope for the relevant certification or report at https://firebase.google.com/support/privacy/#certifications, as may be updated by Google from time to time.\n" +
                            "Customer Data has the meaning given in the Agreement or, if no such meaning is given, has the meaning given to \"Developer Data\" in the Agreement, or if no such meaning is given, means data provided by or on behalf of Customer or Customer End Users via the Services (except TSS and any other support services, if applicable) under the Account.\n" +
                            "Customer End Users means the individuals who are permitted by Customer to use the Services. For clarity, Customer End Users may include employees of Customer Affiliates and other authorized third parties.\n" +
                            "Customer Personal Data means the personal data contained within the Customer Data, including any special categories of personal data defined under European Data Protection Law.\n" +
                            "Customer SCCs means the SCCs (Controller-to-Processor), the SCCs (Processor-to-Processor), and/or the SCCs (Processor-to-Controller), as applicable.\n" +
                            "Data Incident means a breach of Google\\'s security leading to the accidental or unlawful destruction, loss, alteration, unauthorized disclosure of, or access to, Customer Data on systems managed by or otherwise controlled by Google.\n" +
                            "European Data Protection Law means, as applicable: (a) the GDPR; and/or (b) the Swiss FDPA.\n" +
                            "EEA means the European Economic Area.\n" +
                            "EU GDPR means Regulation (EU) 2016/679 of the European Parliament and of the Council of 27 April 2016 on the protection of natural persons with regard to the processing of personal data and on the free movement of such data, and repealing Directive 95/46/EC.\n" +
                            "European Law means, as applicable: (a) EU or EU Member State law (if the EU GDPR applies to the processing of Customer Personal Data); and (b) the law of the UK or a part of the UK (if the UK GDPR applies to the processing of Customer Personal Data).\n" +
                            "GDPR means, as applicable: (a) the EU GDPR; and/or (b) the UK GDPR.\n" +
                            "Google\\'s Third Party Auditor means a Google-appointed, qualified and independent third party auditor, whose then-current identity Google will disclose to Customer.\n" +
                            "Instructions has the meaning given in Section 5.2.1 (Customer’s Instructions).\n" +
                            "ISO 27001 Certification means an ISO/IEC 27001:2013 certification or a comparable certification for the Audited Services.\n" +
                            "Non-European Data Protection Law means data protection or privacy laws in force outside the EEA, Switzerland, and the UK.\n" +
                            "Notification Email Address means the email address(es) designated by Customer in the Admin Console to receive certain notifications from Google. Customer is responsible for using the Admin Console to ensure that its Notification Email Address remains current and valid.\n" +
                            "SCCs means the Customer SCCs and/or SCCs (Processor-to-Processor, Google Exporter), as applicable.\n" +
                            "SCCs (Controller-to-Processor) means the terms at: https://firebase.google.com/terms/firebase-sccs-eu-c2p\n" +
                            "SCCs (Processor-to-Controller) means the terms at: https://firebase.google.com/terms/firebase-sccs-eu-p2c\n" +
                            "SCCs (Processor-to-Processor) means the terms at: https://firebase.google.com/terms/firebase-sccs-eu-p2p\n" +
                            "SCCs (Processor-to-Processor, Google Exporter) means the terms at: https://firebase.google.com/terms/firebase-sccs-eu-p2p-google-exporter\n" +
                            "Security Documentation means all documents and information made available by Google under Section 7.5.1 (Reviews of Security Documentation).\n" +
                            "Security Measures has the meaning given in Section 7.1.1 (Google\\'s Security Measures).\n" +
                            "Services has the meaning given to \"Paid Services\", \"APIs\" or \"Services\" (as applicable) in the Agreement.\n" +
                            "SOC 2 Report means a confidential Service Organization Control (SOC) 2 report (or a comparable report) on Google\\'s systems examining logical security controls, physical security controls, and system availability, as produced by Google\\'s Third Party Auditor in relation to the Audited Services.\n" +
                            "Subprocessor means a third party authorized as another processor under these Terms to have logical access to and process Customer Data in order to provide parts of the Services and TSS (if applicable).\n" +
                            "Supervisory Authority means, as applicable: (a) a \"supervisory authority\" as defined in the EU GDPR; and/or (b) the \"Commissioner\" as defined in the UK GDPR and/or the Swiss FDPA.\n" +
                            "Swiss FDPA means the Federal Data Protection Act of 19 June 1992 (Switzerland).\n" +
                            "Term means the period from the Terms Effective Date until the end of Google\\'s provision of the Services, including, if applicable, any period during which provision of the Services may be suspended and any post-termination period during which Google may continue providing the Services for transitional purposes.\n" +
                            "Terms Effective Date means the date on which Customer accepted, or the parties otherwise agreed to, these Terms.\n" +
                            "TSS means technical support services that Google has agreed to provide to Customer under an agreement that incorporates the Firebase Technical Support Services Guide available at https://cloud.google.com/terms/tssg/firebase/.\n" +
                            "UK GDPR means the EU GDPR as amended and incorporated into UK law under the UK European Union (Withdrawal) Act 2018, and applicable secondary legislation made under that Act.\n" +
                            "2.2 The terms \"personal data\", \"data subject\", \"processing\", \"controller\", and \"processor\" as used in these Terms have the meanings given in the GDPR, irrespective of whether European Data Protection Law or Non-European Data Protection Law applies.\n" +
                            "\n" +
                            "3. Duration\n" +
                            "Regardless of whether the Agreement has terminated or expired, these Terms will remain in effect until, and automatically expire when Google deletes all Customer Data as described in these Terms.\n" +
                            "\n" +
                            "4. Scope of Data Protection Law\n" +
                            "4.1 Application of European Law. The parties acknowledge that European Data Protection Law will apply to the processing of Customer Personal Data, if, for example:\n" +
                            "\n" +
                            "the processing is carried out in the context of the activities of an establishment of Customer in the territory of the EEA or the UK; and/or\n" +
                            "the Customer Personal Data is personal data relating to data subjects who are in the EEA or the UK and the processing relates to the offering to them of goods or services in the EEA or the UK or the monitoring of their behaviour in the EEA or the UK.\n" +
                            "4.2 Application of Non-European Law. The parties acknowledge that Non-European Data Protection Law may also apply to the processing of Customer Personal Data.\n" +
                            "\n" +
                            "4.3 Application of Terms. Except to the extent these Terms state otherwise, these Terms will apply irrespective of whether European Data Protection Law or Non-European Data Protection Law applies to the processing of Customer Personal Data.\n" +
                            "\n" +
                            "5. Processing of Data\n" +
                            "5.1 Roles and Regulatory Compliance; Authorization.\n" +
                            "\n" +
                            "5.1.1 Processor and Controller Responsibilities. If European Data Protection Law applies to the processing of Customer Personal Data:\n" +
                            "\n" +
                            "the subject matter and details of the processing are described in Appendix 1;\n" +
                            "Google is a processor of that Customer Personal Data under European Data Protection Law;\n" +
                            "Customer is a controller or processor, as applicable, of that Customer Personal Data under European Data Protection Law; and\n" +
                            "each party will comply with the obligations applicable to it under European Data Protection Law with respect to the processing of that Customer Personal Data.\n" +
                            "5.1.2 Processor Customers. If European Data Protection Law applies to the processing of Customer Personal Data and Customer is a processor:\n" +
                            "\n" +
                            "Customer warrants on an ongoing basis that the relevant controller has authorized: (i) the Instructions, (ii) Customer’s appointment of Google as another processor, and (iii) Google’s engagement of Subprocessors as described in Section 11 (Subprocessors);\n" +
                            "Customer will immediately forward to the relevant controller any notice provided by Google under Sections 5.2.3 (Instruction Notifications), 7.2.1 (Incident Notification), 9.2.1 (Responsibility for Requests), 11.4 (Opportunity to Object to Subprocessor Changes) or that refers to any SCCs; and\n" +
                            "Customer may:\n" +
                            "request access for the relevant controller to the SOC 2 Report in accordance with Section 7.5.3(a); and\n" +
                            "make available to the relevant controller any other information made available by Google under Sections 10.4 (Supplementary Measures and Information), 10.3 (Data Centre Information) and 11.2 (Information about Subprocessors).\n" +
                            "5.1.3 Responsibilities under Non-European Law. If Non-European Data Protection Law applies to either party’s processing of Customer Personal Data, the relevant party will comply with any obligations applicable to it under that law with respect to the processing of that Customer Personal Data.\n" +
                            "\n" +
                            "5.2 Scope of Processing.\n" +
                            "\n" +
                            "5.2.1 Customer\\'s Instructions. Customer instructs Google to process Customer Personal Data in accordance with applicable law only: (a) to provide, secure and monitor the Services and TSS (if applicable); (b) as further specified via Customer\\'s use of the Services (including the Admin Console and other functionality of the Services) and TSS (if applicable); © as documented in the form of the Agreement (including these Terms); and (d) as further documented in any other written instructions given by Customer and acknowledged by Google as constituting instructions for purposes of these Terms (collectively, the \"Instructions\").\n" +
                            "\n" +
                            "5.2.2 Google\\'s Compliance with Instructions. Google will comply with the Instructions unless prohibited by European Law.\n" +
                            "\n" +
                            "5.2.3 Instruction Notifications. Without prejudice to Google’s obligations under Section 5.2.1 (Customer’s Instructions) or any other rights or obligations of either party under the Agreement, Google will immediately notify Customer if, in Google’s opinion, (a) European Law prohibits Google from complying with an Instruction; (b) an Instruction does not comply with European Data Protection Law; or © Google is otherwise unable to comply with an Instruction, in each case unless such notice is prohibited by European Law.\n" +
                            "\n" +
                            "5.3 Additional Products. If Customer uses any Additional Product, the Services may allow that Additional Product to access Customer Personal Data as required for the interoperation of the Additional Product with the Services. For clarity, these Terms do not apply to the processing of personal data in connection with the provision of any Additional Product used by Customer, including personal data transmitted to or from that Additional Product.\n" +
                            "\n" +
                            "6. Data Deletion\n" +
                            "6.1 Deletion by Customer. Google will enable Customer to delete Customer Data during the Term in a manner consistent with the functionality of the Services. If Customer uses the Services to delete any Customer Data during the Term and that Customer Data cannot be recovered by Customer, this use will constitute an Instruction to Google to delete the relevant Customer Data from Google\\'s systems in accordance with applicable law. Google will comply with this Instruction as soon as reasonably practicable and within a maximum period of 180 days, unless European Law requires storage.\n" +
                            "\n" +
                            "6.2 Return or Deletion at the end of the Term. If Customer wishes to retain any Customer Data after the end of the Term, it may instruct Google in accordance with Section 9.1 (Access; Rectification; Restricted Processing; Portability) to return that data during the Term. Customer instructs Google to delete all remaining Customer Data (including existing copies) from Google’s systems at the end of the Term in accordance with applicable law. After a recovery period of up to 30 days from that date, Google will comply with this Instruction as soon as reasonably practicable and within a maximum period of 180 days, unless European Law requires storage.\n" +
                            "\n" +
                            "7. Data Security\n" +
                            "7.1 Google\\'s Security Measures, Controls and Assistance.\n" +
                            "\n" +
                            "7.1.1 Google\\'s Security Measures. Google will implement and maintain technical, organizational and physical measures to protect Customer Data against accidental or unlawful destruction, loss, alteration, unauthorized disclosure or access as described in Appendix 2 (the \"Security Measures\"). The Security Measures include measures to encrypt personal data; to help ensure ongoing confidentiality, integrity, availability and resilience of Google\\'s systems and services; to help restore timely access to personal data following an incident; and for regular testing of effectiveness. Google may update the Security Measures from time to time provided that such updates do not result in a material reduction of the security of the Services.\n" +
                            "\n" +
                            "7.1.2 Access and Compliance. Google will (a) authorize its employees, contractors and Subprocesses to access Customer Personal Data only as strictly necessary to comply with Instructions; (b) take appropriate steps to ensure compliance with the Security Measures by its employees, contractors and Subprocessors to the extent applicable to their scope of performance and © ensure that all persons authorized to process Customer Personal Data are under an obligation of confidentiality.\n" +
                            "\n" +
                            "7.1.3 Additional Security Controls. Google will make Additional Security Controls available to: (a) allow Customer to take steps to secure Customer Data; and (b) provide Customer with information about securing, accessing and using Customer Data.\n" +
                            "\n" +
                            "7.1.4 Google\\'s Security Assistance. Google will (taking into account the nature of the processing of Customer Personal Data and the information available to Google) assist Customer in ensuring compliance with its (or, where Customer is a processor, the relevant controller’s) obligations under Articles 32 to 34 of the GDPR, by:\n" +
                            "\n" +
                            "implementing and maintaining the Security Measures in accordance with Section 7.1.1 (Google\\'s Security Measures);\n" +
                            "making Additional Security Controls available to Customer in accordance with Section 7.1.3 (Additional Security Controls);\n" +
                            "complying with the terms of Section 7.2 (Data Incidents); and\n" +
                            "providing Customer with the Security Documentation in accordance with Section 7.5.1 (Reviews of Security Documentation) and the information contained in the Agreement (including these Terms).\n" +
                            "7.2. Data Incidents.\n" +
                            "\n" +
                            "7.2.1 Incident Notification. Google will notify Customer promptly and without undue delay after becoming aware of a Data Incident, and promptly take reasonable steps to minimize harm and secure Customer Data.\n" +
                            "\n" +
                            "7.2.2 Details of Data Incident. Google’s notification of a Data Incident will describe: the nature of the Data Incident including the Customer resources impacted; the measures Google has taken, or plans to take, to address the Data Incident and mitigate its potential risk; the measures, if any, Google recommends that Customer take to address the Data Incident; and details of a contact point where more information can be obtained. If it is not possible to provide all such information at the same time, Google’s initial notification will contain the information then available and further information will be provided without undue delay as it becomes available.\n" +
                            "\n" +
                            "7.2.3 Delivery of Notification. Notification(s) of any Data Incident(s) will be delivered to the Notification Email Address or, at Google\\'s discretion, by direct communication (for example, by phone call or an in-person meeting). Customer is solely responsible for ensuring that the Notification Email Address is current and valid.\n" +
                            "\n" +
                            "7.2.4 No Assessment of Customer Data by Google. Google has no obligation to assess Customer Data in order to identify information subject to any specific legal requirements.\n" +
                            "\n" +
                            "7.2.5 No Acknowledgement of Fault by Google. Google\\'s notification of or response to a Data Incident under this Section 7.2 (Data Incidents) will not be construed as an acknowledgement by Google of any fault or liability with respect to the Data Incident.\n" +
                            "\n" +
                            "7.3 Customer\\'s Security Responsibilities and Assessment.\n" +
                            "\n" +
                            "7.3.1 Customer\\'s Security Responsibilities. Without prejudice to Google\\'s obligations under Sections 7.1 (Google\\'s Security Measures, Controls and Assistance) and 7.2 (Data Incidents), and elsewhere in the Agreement, Customer is responsible for its use of the Services and its storage of any copies of Customer Data outside Google’s or Google’s Subprocessors’ systems, including:\n" +
                            "\n" +
                            "using the Services and Additional Security Controls to ensure a level of security appropriate to the risk to the Customer Data;\n" +
                            "securing the account authentication credentials, systems and devices Customer uses to access the Services; and\n" +
                            "backing up or retaining copies of its Customer Data as appropriate.\n" +
                            "7.3.2 Customer\\'s Security Assessment. Customer agrees that the Services, Security Measures implemented and maintained by Google, Additional Security Controls and Google’s commitments under this Section 7 (Data Security) provide a level of security appropriate to the risk to Customer Data (taking into account the state of the art, the costs of implementation and the nature, scope, context and purposes of the processing of Customer Personal Data as well as the risks to individuals).\n" +
                            "\n" +
                            "7.4 Security Certifications and Reports. Google will maintain at least the following in order to evaluate the continued effectiveness of the Security Measures: (a) the ISO 27001 Certification; and (b) the SOC 2 Report, based on an audit performed at least once every 18 months. Google may add standards at any time. Google may replace the ISO 27001 Certification or the SOC 2 Report with an equivalent or enhanced alternative.\n" +
                            "\n" +
                            "7.5 Reviews and Audits of Compliance.\n" +
                            "\n" +
                            "7.5.1 Reviews of Security Documentation. Google will make the ISO 27001 Certification and the then-current SOC 2 Report available for review by Customer to demonstrate compliance by Google with its obligations under these Terms.\n" +
                            "\n" +
                            "7.5.2 Customer\\'s Audit Rights.\n" +
                            "\n" +
                            "If European Data Protection Law applies to the processing of Customer Personal Data, Google will allow Customer or an independent auditor appointed by Customer to conduct audits (including inspections) to verify Google\\'s compliance with its obligations under these Terms in accordance with Section 7.5.3 (Additional Business Terms for Reviews and Audits). During an audit, Google will make available all information necessary to demonstrate such compliance and contribute to the audit as described in Section 7.4 (Security Certifications and Reports) and this Section 7.5 (Reviews and Audits of Compliance).\n" +
                            "If Customer SCCs apply as described in Section 10.2 (Restricted European Transfers), Google will allow Customer (or an independent auditor appointed by Customer) to conduct audits as described in the SCCs and, during an audit, make available all information required by the SCCs, both in accordance with Section 7.5.3 (Additional Business Terms for Reviews and Audits).\n" +
                            "Customer may conduct an audit to verify Google\\'s compliance with its obligations under these Terms by reviewing the Security Documentation (which reflects the outcome of audits conducted by Google\\'s Third Party Auditor).\n" +
                            "7.5.3 Additional Business Terms for Reviews and Audits.\n" +
                            "\n" +
                            "Customer must send any requests for reviews of the SOC 2 Report under Section 5.1.2©(i) or 7.5.1, or any audits under Section 7.5.2(a) or 7.5.2(b), via https://firebase.google.com/support/privacy/dpo as described in Section 12 (Firebase Data Protection Team; Processing Records).\n" +
                            "Following receipt by Google of a request under Section 7.5.3(a), Google and Customer will discuss and agree in advance on: (i) the reasonable date(s) of and security and confidentiality controls applicable to any review of the SOC 2 Report under Section 5.1.2©(i) or 7.5.1; and (ii) the reasonable start date, scope and duration of and security and confidentiality controls applicable to any audit under Section 7.5.2(a) or 7.5.2(b).\n" +
                            "Google may charge a fee (based on Google\\'s reasonable costs) for any audit under Section 7.5.2(a) or 7.5.2(b). Google will provide Customer with further details of any applicable fee, and the basis of its calculation, in advance of any such audit. Customer will be responsible for any fees charged by any auditor appointed by Customer to execute any such audit.\n" +
                            "Google may object in writing to an auditor appointed by Customer to conduct any audit under Section 7.5.2(a) or 7.5.2(b) if the auditor is, in Google\\'s reasonable opinion, not suitably qualified or independent, a competitor of Google, or otherwise manifestly unsuitable. Any such objection by Google will require Customer to appoint another auditor or conduct the audit itself.\n" +
                            "Nothing in these Terms will require Google either to disclose to Customer or its third party auditor, or to allow Customer or its third party auditor to access:\n" +
                            "any data of any other customer of Google or its Affiliates;\n" +
                            "Google or its Affiliates\\' internal accounting or financial information;\n" +
                            "any trade secret of Google or its Affiliates;\n" +
                            "any information that, in Google\\'s reasonable opinion, could: (A) compromise the security of any of Google or its Affiliates\\' systems or premises; or (B) cause Google or its Affiliates to breach obligations under European Data Protection Law or its security and/or privacy obligations to Customer or any third party; or\n" +
                            "any information that Customer or its third party auditor seeks to access for any reason other than the good faith fulfilment of Customer\\'s obligations under European Data Protection Law.\n" +
                            "8. Impact Assessments and Consultations\n" +
                            "Google will (taking into account the nature of the processing and the information available to Google) assist Customer in ensuring compliance with its (or, where Customer is a processor, the relevant controller’s) obligations under Articles 35 and 36 of the GDPR, by:\n" +
                            "\n" +
                            "providing Additional Security Controls in accordance with Section 7.1.3 (Additional Security Controls) and the Security Documentation in accordance with Section 7.5.1 (Reviews of Security Documentation);\n" +
                            "providing the information contained in the Agreement including these Terms; and\n" +
                            "providing or otherwise making available, in accordance with Google’s standard practices, other materials concerning the nature of the Services and the processing of Customer Personal Data (for example, help center materials).\n" +
                            "9. Access etc.; Data Subject Rights; Data Export\n" +
                            "9.1 Access; Rectification; Restricted Processing; Portability. During the Term, Google will enable Customer, in a manner consistent with the functionality of the Services, to access, rectify and restrict processing of Customer Data, including via the deletion functionality provided by Google as described in Section 6.1 (Deletion by Customer), and to export Customer Data. If Customer becomes aware that any Customer Personal Data is inaccurate or outdated, Customer will be responsible for using such functionality to rectify or delete that data if required by applicable European Data Protection Law.\n" +
                            "\n" +
                            "9.2 Data Subject Requests.\n" +
                            "\n" +
                            "9.2.1 Responsibility for Requests. During the Term, if Google receives a request from a data subject via https://firebase.google.com/support/privacy/dpo that relates to Customer Personal Data and identifies Customer, Google will (a) advise the data subject to submit their request to Customer, (b) promptly notify Customer upon the data subject’s request, provided the data subject has identified Customer; and © not otherwise respond to that data subject’s request without authorization from Customer. Customer will be responsible for responding to any such request including, where necessary, by using the functionality of the Services.\n" +
                            "\n" +
                            "9.2.2 Google's Data Subject Request Assistance. Google will (taking into account the nature of the processing of Customer Personal Data) assist Customer in fulfilling its (or, where Customer is a processor, the relevant controller’s) obligations under Chapter III of the GDPR to respond to requests for exercising the data subject's rights by:\n" +
                            "\n" +
                            "providing Additional Security Controls in accordance with Section 7.1.3 (Additional Security Controls);\n" +
                            "complying with Sections 9.1 (Access; Rectification; Restricted Processing; Portability) and 9.2.1 (Responsibility for Requests); and\n" +
                            "providing the functionality of the Services.\n" +
                            "10. Data Transfers\n" +
                            "10.1 Data Storage and Processing Facilities. Subject to Google’s data location commitments in the Agreement (if applicable) and to the remainder of this Section 10 (Data Transfers), Customer Data may be processed in any country in which Google or its Subprocessors maintain facilities.\n" +
                            "\n" +
                            "10.2 Restricted European Transfers. The parties acknowledge that European Data Protection Law does not require SCCs or an Alternative Transfer Solution in order for Customer Personal Data to be processed in or transferred to an Adequate Country. If Customer Personal Data is transferred to any other country, and European Data Protection Law applies to the transfers (\"Restricted European Transfers\"), then:\n" +
                            "\n" +
                            "if Google has adopted an Alternative Transfer Solution for any Restricted European Transfers, then Google will inform Customer of the relevant solution and ensure that such Restricted European Transfers are made in accordance with that solution; and/or\n" +
                            "if Google has not adopted, or has informed Customer that Google is no longer adopting, an Alternative Transfer Solution for any Restricted European Transfers, then:\n" +
                            "if Google’s address is in an Adequate Country:\n" +
                            "the SCCs (Processor-to-Processor, Google Exporter) will apply with respect to such Restricted European Transfers from Google to Subprocessors; and\n" +
                            "in addition, if Customer’s address is not in an Adequate Country, the SCCs (Processor-to-Controller) will apply (regardless of whether Customer is a controller and/or processor) with respect to Restricted European Transfers between Google and Customer; or\n" +
                            "if Google’s address is not in an Adequate Country, the SCCs (Controller-to-Processor) and/or SCCs (Processor-to-Processor) will apply (according to whether Customer is a controller and/or processor) with respect to such Restricted European Transfers between Customer and Google.\n" +
                            "10.3 Data Centre Information. Information about the locations of Google data centers is available at: https://www.google.com/about/datacenters/inside/locations/index.html (as may be updated by Google from time to time).\n" +
                            "\n" +
                            "10.4 Supplementary Measures and Information.  Without prejudice to any further supplementary measures and information Google may provide to Customer from time to time, Google will provide Customer with information relevant to Restricted European Transfers, including information about Additional Security Controls and other supplementary measures to protect Customer Personal Data:\n" +
                            "\n" +
                            "as described in Section 7.5.1 (Reviews of Security Documentation);\n" +
                            "in the documentation for the Services, available at https://firebase.google.com/docs; and\n" +
                            "in the Firebase Privacy and Security website, available at https://firebase.google.com/support/privacy.\n" +
                            "10.5 Termination. If Customer concludes, based on its current or intended use of the Services, that the Alternative Transfer Solution and/or SCCs, as applicable, do not provide appropriate safeguards for Customer Personal Data, then Customer may immediately terminate the Agreement for convenience by notifying Google.\n" +
                            "\n" +
                            "11. Subprocesses\n" +
                            "11.1 Consent to Subprocess Engagement. Customer specifically authorizes the engagement as Subprocesses of those entities listed as of the Terms Effective Date at the URL specified in Section 11.2 (Information about Subprocessors). In addition, without prejudice to Section 11.4 (Opportunity to Object to Subprocessor Changes), Customer generally authorizes the engagement of any other third parties as Subprocessors (\"New Subprocessors\").\n" +
                            "\n" +
                            "11.2 Information about Subprocesses. Information about Subprocesses, including their names, locations and activities, is available at: https://firebase.google.com/terms/subprocessors (as may be updated by Google from time to time in accordance with these Terms).\n" +
                            "\n" +
                            "11.3 Requirements for Subprocess Engagement. When engaging any Subprocess, Google will:\n" +
                            "\n" +
                            "ensure via a written contract that:\n" +
                            "the Subprocess only accesses and uses Customer Data to the extent required to perform the obligations subcontracted to it, and does so in accordance with the Agreement (including these Terms); and\n" +
                            "if the processing of Customer Personal Data is subject to European Data Protection Law, the data protection obligations described in these Terms (as referred to in Article 28(3) of the GDPR, if applicable) are imposed on the Subprocessor; and\n" +
                            "remain fully liable for all obligations subcontracted to, and all acts and omissions of, the Subprocess.\n" +
                            "11.4 Opportunity to Object to Subprocess Changes.\n" +
                            "\n" +
                            "When any New Subprocess is engaged during the Term, Google will, at least 30 days before the New Subprocess starts processing any Customer Data, notify Customer of the engagement (including the name, location and activities of the New Subprocessor).\n" +
                            "Customer may, within 90 days after being notified of the engagement of a New Subprocess, object by immediately terminating the Agreement for convenience by notifying Google.\n" +
                            "12. Firebase Data Protection Team; Processing Records\n" +
                            "12.1 Google's Representative. Customer may contact a Google representative in relation to the exercise of its rights under these Terms via the methods described at https://firebase.google.com/support/privacy/dpo (and/or via such other means as Google may provide from time to time). Such representative will provide prompt and reasonable assistance with any Customer queries related to processing of Customer Personal Data under the Agreement.\n" +
                            "\n" +
                            "12.2 Google's Processing Records. Google will keep appropriate documentation of its processing activities as required by the GDPR. Customer acknowledges that Google is required under the GDPR to: (a) collect and maintain records of certain information, including (i) the name and contact details of each processor and/or controller on behalf of which Google is acting and (if applicable) of such processor's or controller's local representative and data protection officer, (ii) if applicable under the Customer SCCs, Customer’s Supervisory Authority; and (b) make such information available to the Supervisory Authorities. Accordingly Customer will, where requested and as applicable to Customer, provide such information to Google via the Admin Console or via such other means as may be provided by Google, and will use the Admin Console or such other means to ensure that all information provided is kept accurate and up-to-date.\n" +
                            "\n" +
                            "12.3 Controller Requests. During the Term, if Google receives a request or instruction via the methods described in Section 12.1 (Google’s Representative), or any other method, from a third party purporting to be a controller of Customer Personal Data, Google will advise the third party to contact Customer.\n" +
                            "\n" +
                            "13. Liability\n" +
                            "13.1 Liability Cap. If the Agreement is governed by the laws of:\n" +
                            "\n" +
                            "a state of the United States of America, then, notwithstanding anything else in the Agreement, the total liability of either party towards the other party under or in connection with these Terms will be limited to the maximum monetary or payment-based amount at which that party's liability is capped under the Agreement (and therefore, any exclusion of indemnification claims from the Agreement's limitation of liability will not apply to indemnification claims under the Agreement relating to European Data Protection Law or Non-European Data Protection Law); or\n" +
                            "a jurisdiction that is not a state of the United States of America, then the liability of the parties under or in connection with these Terms will be subject to the exclusions and limitations of liability in the Agreement.\n" +
                            "14. Interpretation\n" +
                            "14.1 Precedence. Notwithstanding anything to the contrary in the Agreement, to the extent of any conflict or inconsistency between:\n" +
                            "\n" +
                            "these Terms and the remainder of the Agreement, these Terms will prevail; and\n" +
                            "any Customer SCCs (which are incorporated by reference into these Terms) and the remainder of the Agreement (including these Terms), the Customer SCCs will prevail.\n" +
                            "14.2 Legacy UK SCCs. The supplementary terms for UK GDPR transfers in the SCCs will, as of 21 September 2022, supersede and terminate any standard contractual clauses approved under the UK GDPR or Data Protection Act 2018 and previously entered into by Customer and Google (\"Legacy UK SCCs\"). This Section 14.2 will not affect either parties’ rights, or any data subject’s rights, that may have accrued under the Legacy UK SCCs while they were in force.\n" +
                            "\n" +
                            "14.3 No Modification of SCCs. Nothing in the Agreement (including these Terms) is intended to modify or contradict any SCCs or prejudice the fundamental rights or freedoms of data subjects under European Data Protection Law.\n" +
                            "\n" +
                            "15. Changes to these Terms\n" +
                            "15.1 Changes to URLs. From time to time, Google may change any URL referenced in these Terms and the content at any such URL, except that Google may only change the SCCs in accordance with Sections 15.2(b) - 15.2(d) (Changes to these Terms) or to incorporate any new version of the SCCs that may be adopted under European Data Protection Law, in each case in a manner that does not affect the validity of the SCCs under European Data Protection Law.\n" +
                            "\n" +
                            "15.2 Changes to these Terms. Google may change these Terms if the change:\n" +
                            "\n" +
                            "is expressly permitted by these Terms, including as described in Section 15.1 (Changes to URLs);\n" +
                            "reflects a change in the name or form of a legal entity;\n" +
                            "is required to comply with applicable law, applicable regulation, a court order or guidance issued by a governmental regulator or agency, or reflects Google’s adoption of an Alternative Transfer Solution; or\n" +
                            "does not: (i) result in a material reduction of the security of the Services; (ii) expand the scope of, or remove any restrictions on, Google's processing of Customer Personal Data, as described in Section 5.2 (Scope of Processing); and (iii) otherwise have a material adverse impact on Customer's rights under these Terms, as reasonably determined by Google.\n" +
                            "15.3 Notification of Changes. If Google makes a material change to these Terms in accordance with Section 15© or (d), Google will post the change at the webpage containing the Terms. If Customer does not agree to the revised Terms, Customer may immediately terminate the Agreement for convenience by giving written notice to Google within 90 days of Google posting such change.\n" +
                            "\n" +
                            "Appendix 1: Subject Matter and Details of the Data Processing\n" +
                            "Subject Matter\n" +
                            "Google's provision of the Services and TSS (if applicable) to Customer.\n" +
                            "Duration of the Processing\n" +
                            "The Term plus the period from the end of the Term until deletion of all Customer Data by Google in accordance with these Terms.\n" +
                            "Nature and Purpose of the Processing\n" +
                            "Google will process Customer Data for the purposes of providing the Services and TSS (if applicable) to Customer in accordance with these Terms.\n" +
                            "Categories of Data\n" +
                            "Data relating to individuals provided to Google via the Services, by (or at the direction of) Customer or by Customer End Users.\n" +
                            "Data Subjects\n" +
                            "Data subjects include the individuals about whom data is provided to Google via the Services by (or at the direction of) Customer or by Customer End Users.\n" +
                            "Appendix 2: Security Measures\n" +
                            "As from the Terms Effective Date, Google will implement and maintain the Security Measures described in this Appendix 2.\n" +
                            "\n" +
                            "1. Data Center and Network Security\n" +
                            "(a) Data Centers.\n" +
                            "\n" +
                            "Infrastructure. Google maintains geographically distributed data centers. Google stores all production data in physically secure data centers.\n" +
                            "Redundancy. Infrastructure systems have been designed to eliminate single points of failure and minimize the impact of anticipated environmental risks. Dual circuits, switches, networks or other necessary devices help provide this redundancy. The Services are designed to allow Google to perform certain types of preventative and corrective maintenance without interruption. All environmental equipment and facilities have documented preventative maintenance procedures that detail the process for and frequency of performance in accordance with the manufacturer's or internal specifications. Preventative and corrective maintenance of the data center equipment is scheduled through a standard change process according to documented procedures.\n" +
                            "Power. The data center electrical power systems are designed to be redundant and maintainable without impact to continuous operations, 24 hours a day, 7 days a week. In most cases, a primary as well as an alternate power source, each with equal capacity, is provided for critical infrastructure components in the data center. Backup power is provided by various mechanisms such as uninterruptible power supplies (UPS) batteries, which supply consistently reliable power protection during utility brownouts, blackouts, over voltage, under voltage, and out-of-tolerance frequency conditions. If utility power is interrupted, backup power is designed to provide transitory power to the data center, at full capacity, for up to 10 minutes until the backup generator systems take over. The backup generators are capable of automatically starting up within seconds to provide enough emergency electrical power to run the data center at full capacity typically for a period of days.\n" +
                            "Server Operating Systems. Google servers use a Linux based implementation customized for the application environment. Data is stored using proprietary algorithms to augment data security and redundancy. Google employs a code review process to increase the security of the code used to provide the Services and enhance the security of products in production environments.\n" +
                            "Businesses Continuity. Google replicates data over multiple systems to help to protect against accidental destruction or loss. Google has designed and regularly plans and tests its business continuity planning/disaster recovery programs.\n" +
                            "(b) Networks and Transmission.\n" +
                            "\n" +
                            "Data Transmission. Data centers are typically connected via high-speed private links to provide secure and fast data transfer between data centers. This is designed to prevent data from being read, copied, altered or removed without authorization during electronic transfer or transport or while being recorded onto data storage media. Google transfers data via Internet standard protocols.\n" +
                            "External Attack Surface. Google employs multiple layers of network devices and intrusion detection to protect its external attack surface. Google considers potential attack vectors and incorporates appropriate purpose built technologies into external facing systems.\n" +
                            "Intrusion Detection. Intrusion detection is intended to provide insight into ongoing attack activities and provide adequate information to respond to incidents. Google's intrusion detection involves:\n" +
                            "tightly controlling the size and make-up of Google's attack surface through preventative measures;\n" +
                            "employing intelligent detection controls at data entry points; and\n" +
                            "employing technologies that automatically remedy certain dangerous situations.\n" +
                            "Incident Response. Google monitors a variety of communication channels for security incidents, and Google's security personnel will react promptly to known incidents.\n" +
                            "Encryption Technologies. Google makes HTTPS encryption (also referred to as SSL or TLS connection) available. Google servers support ephemeral elliptic curve Diffie-Hellman cryptographic key exchange signed with RSA and ECDSA. These perfect forward secrecy (PFS) methods help protect traffic and minimize the impact of a compromised key, or a cryptographic breakthrough.\n" +
                            "2. Access and Site Controls\n" +
                            "a. Site Controls.\n" +
                            "\n" +
                            "On-site Data Center Security Operation. Google's data centers maintain an on-site security operation responsible for all physical data center security functions 24 hours a day, 7 days a week. The on-site security operation personnel monitor closed circuit TV (CCTV) cameras and all alarm systems. On-site security operation personnel perform internal and external patrols of the data center regularly.\n" +
                            "Data Center Access Procedures. Google maintains formal access procedures for allowing physical access to the data centers. The data centers are housed in facilities that require electronic card key access, with alarms that are linked to the on-site security operation. All entrants to the data center are required to identify themselves as well as show proof of identity to on-site security operations. Only authorized employees, contractors and visitors are allowed entry to the data centers. Only authorized employees and contractors are permitted to request electronic card key access to these facilities. Data center electronic card key access requests must be made through e-mail, and require the approval of the requestor's manager and the data center director. All other entrants requiring temporary data center access must: (i) obtain approval in advance from the data center managers for the specific data center and internal areas they wish to visit; (ii) sign in at on-site security operations; and (iii) reference an approved data center access record identifying the individual as approved.\n" +
                            "On-site Data Center Security Devices. Google's data centers employ a dual authentication access control system that is linked to a system alarm. The access control system monitors and records each individual's electronic card key and when they access perimeter doors, shipping and receiving, and other critical areas. Unauthorized activity and failed access attempts are logged by the access control system and investigated, as appropriate. Authorized access throughout the business operations and data centers is restricted based on zones and the individual's job responsibilities. The fire doors at the data centers are alarmed. CCTV cameras are in operation both inside and outside the data centers. The positioning of the cameras has been designed to cover strategic areas including, among others, the perimeter, doors to the data center building, and shipping/receiving. On-site security operations personnel manage the CCTV monitoring, recording and control equipment. Secure cables throughout the data centers connect the CCTV equipment. Cameras record on site via digital video recorders 24 hours a day, 7 days a week. The surveillance records are retained for up to 30 days based on activity.\n" +
                            "b. Access Control.\n" +
                            "\n" +
                            "Infrastructure Security Personnel. Google has, and maintains, a security policy for its personnel, and requires security training as part of the training package for its personnel. Google's infrastructure security personnel are responsible for the ongoing monitoring of Google's security infrastructure, the review of the Services, and responding to security incidents.\n" +
                            "Access Control and Privilege Management. Customer's administrators and Customer End Users must authenticate themselves via a central authentication system or via a single sign on system in order to administer the Services.\n" +
                            "Internal Data Access Processes and Policies – Access Policy. Google's internal data access processes and policies are designed to prevent unauthorized persons and/or systems from gaining access to systems used to process Customer Personal Data. Google designs its systems to (i) only allow authorized persons to access data they are authorized to access; and (ii) ensure that Customer Personal Data cannot be read, copied, altered or removed without authorization during processing, use and after recording. The systems are designed to detect any inappropriate access. Google employs a centralized access management system to control personnel access to production servers, and only provides access to a limited number of authorized personnel. Google's authentication and authorization systems utilize SSH certificates and security keys, and are designed to provide Google with secure and flexible access mechanisms. These mechanisms are designed to grant only approved access rights to site hosts, logs, data and configuration information. Google requires the use of unique user IDs, strong passwords, two factor authentication and carefully monitored access lists to minimize the potential for unauthorized account use. The granting or modification of access rights is based on: the authorized personnel's job responsibilities; job duty requirements necessary to perform authorized tasks; and a need to know basis. The granting or modification of access rights must also be in accordance with Google's internal data access policies and training. Where passwords are employed for authentication (e.g., login to workstations), password policies that follow at least industry standard practices are implemented. These standards include restrictions on password reuse and sufficient password strength. For access to extremely sensitive information, Google uses hardware tokens.\n" +
                            "3. Data\n" +
                            "a. Data Storage, Isolation and Logging. Google stores data in a multi-tenant environment on Google-owned servers. Google also logically isolates the Customer's data. Customer will be given control over specific data sharing policies. Those policies, in accordance with the functionality of the Services, will enable Customer to determine the product sharing settings applicable to Customer End Users for specific purposes. Customer may choose to use logging functionality that Google may make available via the Services.\n" +
                            "b. Decommissioned Disks and Disk Erase Policy. Disks containing data may experience performance issues, errors or hardware failure that lead them to be decommissioned (\"Decommissioned Disk\"). Every Decommissioned Disk is subject to a series of data destruction processes (the \"Disk Erase Policy\") before leaving Google's premises either for reuse or destruction. Decommissioned Disks are erased in a multi-step process and verified complete by at least two independent validators. The erase results are logged by the Decommissioned Disk's serial number for tracking. Finally, the erased Decommissioned Disk is released to inventory for reuse and redeployment. If, due to hardware failure, the Decommissioned Disk cannot be erased, it is securely stored until it can be destroyed. Each facility is audited regularly to monitor compliance with the Disk Erase Policy.\n" +
                            "4. Personnel Security\n" +
                            "Google personnel are required to conduct themselves in a manner consistent with the company's guidelines regarding confidentiality, business ethics, appropriate usage, and professional standards. Google conducts reasonably appropriate background checks to the extent legally permissible and in accordance with applicable local labor law and statutory regulations.\n" +
                            "\n" +
                            "Personnel are required to execute a confidentiality agreement and must acknowledge receipt of, and compliance with, Google's confidentiality and privacy policies. Personnel are provided with security training. Personnel handling Customer Data are required to complete additional requirements appropriate to their role (eg., certifications). Google's personnel will not process Customer Data without authorization.\n" +
                            "\n" +
                            "5. Subprocess Security\n" +
                            "Before onboarding Subprocesses, Google conducts an audit of the security and privacy practices of Subprocessors to ensure Subprocessors provide a level of security and privacy appropriate to their access to data and the scope of the services they are engaged to provide. Once Google has assessed the risks presented by the Subprocessor, then subject to the requirements described in Section 11.3 (Requirements for Subprocessor Engagement) of these Terms, the Subprocessor is required to enter into appropriate security, confidentiality and privacy contract terms.\n" +
                            "\n" +
                            "Appendix 3: Additional Terms for Non-European Data Protection Law\n" +
                            "The following Additional Terms for Non-European Data Protection Law supplement these Data Processing Terms:\n");
                    materialAlertDialogBuilder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            btnNext.setEnabled(true);
                            btnNext.setVisibility(View.VISIBLE);
                            dialog.dismiss();
                        }
                    });
                    materialAlertDialogBuilder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            checkBox.setChecked(false);

                        }
                    });
                    materialAlertDialogBuilder.show();
                }else {
                    btnNext.setEnabled(false);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                Intent intent = new Intent(TermsAndConditions2.this, Login.class);
                startActivity( intent );
                finish();
            }
        });
    }
}