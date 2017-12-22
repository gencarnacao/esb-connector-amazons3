/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.connector.amazons3.constants;

/**
 * This class contains required constants.
 */
public class AmazonS3Constants {

    /**
     * Constant for Access key id.
     */
    public static final String ACCESS_KEY_ID = "uri.var.accessKeyId";

    /**
     * Constant for Secret access key.
     */
    public static final String SECRET_ACCESS_KEY = "uri.var.secretAccessKey";

    /**
     * Constant for Signature version.
     */
    public static final String SIGNATURE_VERSION = "uri.var.signatureVersion";

    /**
     * Constant for Signature method.
     */
    public static final String SIGNATURE_METHOD = "uri.var.signatureMethod";

    /**
     * Constant for signature version Api signature version.
     */
    public static final String API_SIGNATURE_VERSION = "SignatureVersion";

    /**
     * Constant for Signature method Api Signature method.
     */
    public static final String API_SIGNATURE_METHOD = "SignatureMethod";

    /**
     * Constant for GMT.
     */
    public static final String GMT = "GMT";

    /**
     * Constant for Date format.
     */
    public static final String ISO8601_BASIC_DATE_FORMAT = "yyyyMMdd'T'HHmmss'Z'";

    /**
     * Constant for Short Date Format.
     */
    public static final String SHORT_DATE_FORMAT = "yyyyMMdd";

    /**
     * Constant for x-amz-Date.
     */
    public static final String AMZ_DATE = "amzDate";

    /**
     * Constant for API variable x-amz-Date.
     */
    public static final String API_AMZ_DATE = "x-amz-date";

    /**
     * Constant for HmacSha256.
     */
    public static final String HAMC_SHA_256 = "HmacSHA256";

    /**
     * Constant for sha 256.
     */
    public static final String SHA_256 = "SHA-256";

    /**
     * Constant for aws4-hmac-sha256.
     */
    public static final String AWS4_HMAC_SHA_256 = "AWS4-HMAC-SHA256";

    /**
     * Constant for UTF-8.
     */
    public static final String UTF_8 = "UTF-8";

    /**
     * Constant for UTF8.
     */
    public static final String UTF8 = "UTF8";

    /**
     * Constant for Connector Error.
     */
    public static final String CONNECTOR_ERROR = "Error occurred in connector";

    /**
     * Constant for Hex Array String.
     */
    public static final String HEX_ARRAY_STRING = "0123456789ABCDEF";

    /**
     * Constant for Http method.
     */
    public static final String HTTP_METHOD = "httpMethod";

    /**
     * Constant for Host.
     */
    public static final String HOST = "uri.var.host";

    /**
     * Constant for Host header.
     */
    public static final String API_HOST = "Host";

    /**
     * Constant for credential.
     */
    public static final String CREDENTIAL = "Credential";

    /**
     * Constant for Region.
     */
    public static final String REGION = "uri.var.region";

    /**
     * Constant for service.
     */
    public static final String SERVICE = "uri.var.service";

    /**
     * Constant for Termination String.
     */
    public static final String TERMINATION_STRING = "uri.var.terminationString";

    /**
     * Constant for Signed Headers.
     */
    public static final String SIGNED_HEADERS = "SignedHeaders";

    /**
     * Constant for Authorization Header.
     */
    public static final String AUTHORIZATION_HEADER = "authorizationHeader";

    /**
     * Constant for Date format pattern.
     */
    public static final String CURR_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z ";

    /**
     * Constant for empty string.
     */
    public static final String EMPTY_STR = "";

    /**
     * Constant for colon.
     */
    public static final String COLON = ":";

    /**
     * Constant for forward slash.
     */
    public static final String FORWARD_SLASH = "/";

    /**
     * Constant for new line character.
     */
    public static final char NEW_LINE = '\n';

    /**
     * Constant for Equal.
     */
    public static final String EQUAL = "=";

    /**
     * Constant for Ampersand.
     */
    public static final String AMP = "&";

    /**
     * Constant for QUESTION_MARK.
     */
    public static final String QUESTION_MARK = "?";

    /**
     * Constant for Comma.
     */
    public static final String COMMA = ",";

    /**
     * Constant for semi colon.
     */
    public static final String SEMI_COLON = ";";

    /**
     * Constant for AWS4.
     */
    public static final String AWS4 = "AWS4";

    /**
     * Constant for regular expression (space).
     */
    public static final String REGEX = "\\s+";

    /**
     * Constant for bucketName.
     */
    public static final String BUCKET_NAME = "uri.var.bucketName";

    /**
     * Constant for time zone (GMT).
     */
    public static final String TIME_ZONE = "GMT";

    // AmazonS3Authentication Class Constants.

    /**
     * Constant for standard mac algorithm name.
     */
    public static final String HMAC_SHA1 = "HmacSHA1";

    /**
     * Constant for standard md5 algorithm name.
     */
    public static final String MD5 = "MD5";

    /**
     * Constant for shorten Amazon Web Services prefix.
     */
    public static final String AWS = "AWS ";

    /**
     * Constant for Signature Api signature.
     */
    public static final String API_SIGNATURE = "Signature";

    /**
     * Error code constant for Invalid parameters.
     */
    public static final String INVALID_PARAMETERS = "Invalid parameters";

    /**
     * Constant fot Invalid Key Error.
     */
    public static final String INVALID_KEY_ERROR = "Invalid key";

    /**
     * Constant for Invalid Error.
     */
    public static final String NO_SUCH_ALGORITHM_ERROR = "Invalid Algorithm";

    /**
     * Constant for Illegal State Error.
     */
    public static final String ILLEGAL_STATE_ERROR = "Illegal State";

    /**
     * Constant for Unsupported Encoding Error.
     */
    public static final String UNSUPPORTED_ENCORDING_ERROR = "Unsupported Encoding";

    /**
     * Constant for methodType.
     */
    public static final String METHOD_TYPE = "uri.var.methodType";

    /**
     * Constant for contentMD5.
     */
    public static final String CONTENT_MD5 = "uri.var.contentMD5";

    /**
     * Constant for contentMD5 header.
     */
    public static final String API_CONTENT_MD5 = "Content-MD5";

    /**
     * Constant for contentType.
     */
    public static final String CONTENT_TYPE = "uri.var.contentType";

    /**
     * Constant for contentType header.
     */
    public static final String API_CONTENT_TYPE = "Content-Type";

    /**
     * Constant for uriRemainder.
     */
    public static final String URI_REMAINDER = "uri.var.uriRemainder";

    /**
     * Constant for deleteConfig.
     */
    public static final String DELETE_CONFIG = "uri.var.deleteConfig";

    /**
     * Constant for xAmzDate.
     */
    public static final String IS_XAMZ_DATE = "uri.var.isXAmzDate";

    /**
     * Constant for xAmzSecurityToken.
     */
    public static final String XAMZ_SECURITY_TOKEN = "uri.var.xAmzSecurityToken";

    /**
     * Constant for xAmzAcl.
     */
    public static final String XAMZ_ACL = "uri.var.xAmzAcl";

    /**
     * Constant for xAmzGrantRead.
     */
    public static final String XAMZ_GRANT_READ = "uri.var.xAmzGrantRead";

    /**
     * Constant for xAmzGrantWrite.
     */
    public static final String XAMZ_GRANT_WRITE = "uri.var.xAmzGrantWrite";

    /**
     * Constant for xAmzGrantReadAcp.
     */
    public static final String XAMZ_GRANT_READ_ACP = "uri.var.xAmzGrantReadAcp";

    /**
     * Constant for xAmzGrantWriteAcp.
     */
    public static final String XAMZ_GRANT_WRITE_ACP = "uri.var.xAmzGrantWriteAcp";

    /**
     * Constant for xAmzGrantFullControl.
     */
    public static final String XAMZ_GRANT_FULL_CONTROL = "uri.var.xAmzGrantFullControl";

    // CreateObject method related Amz header Constants.

    /**
     * Constant for xAmzMeta.
     */
    public static final String XAMZ_META = "uri.var.xAmzMeta";

    /**
     * Constant for xAmzServeEncryption.
     */
    public static final String XAMZ_SERVE_ENCRYPTION = "uri.var.xAmzServeEncryption";

    /**
     * Constant for xAmzStorageClass.
     */
    public static final String XAMZ_STORAGE_CLASS = "uri.var.xAmzStorageClass";

    /**
     * Constant for xAmzWebsiteLocation.
     */
    public static final String XAMZ_WEBSITE_LOCATION = "uri.var.xAmzWebsiteLocation";

    /**
     * Constant for xAmzMfa.
     */
    public static final String XAMZ_MFA = "uri.var.xAmzMfa";

    // createObjectCopy method related Amz header Constants.

    /**
     * Constant for xAmzCopySource.
     */
    public static final String XAMZ_COPY_SOURCE = "uri.var.xAmzCopySource";

    /**
     * Constant for xAmzCopySourceRange.
     */
    public static final String XAMZ_COPY_SOURCE_RANGE = "uri.var.xAmzCopySourceRange";

    /**
     * Constant for xAmzMetadataDirective.
     */
    public static final String XAMZ_METADATA_DIRECTIVE = "uri.var.xAmzMetadataDirective";

    /**
     * Constant for xAmzCopySourceIfMatch.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MATCH = "uri.var.xAmzCopySourceIfMatch";

    /**
     * Constant for xAmzCopySourceIfNoneMatch.
     */
    public static final String XAMZ_COPY_SOURCE_IF_NONE_MATCH = "uri.var.xAmzCopySourceIfNoneMatch";

    /**
     * Constant for xAmzCopySourceIfModifiedSince.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MODIFIED_SINCE = "uri.var.xAmzCopySourceIfModifiedSince";

    /**
     * Constant for xAmzCopySourceIfUnmodifiedSince.
     */
    public static final String XAMZ_COPY_SOURCE_IF_UNMODIFIED_SINCE = "uri.var.xAmzCopySourceIfUnmodifiedSince";

    //headObject method constants
    /**
     * Constant for xAmzServerSide​Encryption​CustomerAlgorithm.
     */
    public static final String XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "uri.var.xAmzServerSide​Encryption​CustomerAlgorithm";

    /**
     * Constant for x-amz-server-side​-encryption​-customer-algorithm.
     */
    public static final String HD_XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM = "x-amz-server-side​-encryption​-customer-algorithm";

    /**
     * Constant for xAmzServerSide​Encryption​CustomerKey.
     */
    public static final String XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "uri.var.xAmzServerSide​Encryption​CustomerKey";

    /**
     * Constant for x-amz-server-side​-encryption​-customer-algorithm.
     */
    public static final String HD_XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY = "x-amz-server-side​-encryption​-customer-key";

    /**
     * Constant for xAmzServerSide​Encryption​CustomerKey.
     */
    public static final String XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "uri.var.xAmzServerSide​Encryption​CustomerKeyMD5";

    /**
     * Constant for x-amz-server-side​-encryption​-customer-algorithm.
     */
    public static final String HD_XMAZ_SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5 = "x-amz-server-side​-encryption​-customer-key-MD5";


    // Common Amz header Constants.

    /**
     * Constant for x-amz-date.
     */
    public static final String HD_XAMZ_DATE = "x-amz-date";

    /**
     * Constant for x-amz-content-sha256.
     */
    public static final String XAMZ_CONTENT_SHA256 = "uri.var.xAmzContentSha256";
    /**
     * Constant for x-amz-content-sha256.
     */
    public static final String HD_XAMZ_CONTENT_SHA256 = "x-amz-content-sha256";

    /**
     * Constant for x-amz-security-token.
     */
    public static final String HD_XAMZ_SECURITY_TOKEN = "x-amz-security-token";

    // ACL related Amz real header name Constants.

    /**
     * Constant for x-amz-acl.
     */
    public static final String HD_XAMZ_ACL = "x-amz-acl";

    /**
     * Constant for x-amz-grant-read.
     */
    public static final String HD_XAMZ_GRANT_READ = "x-amz-grant-read";

    /**
     * Constant for x-amz-grant-write.
     */
    public static final String HD_XAMZ_GRANT_WRITE = "x-amz-grant-write";

    /**
     * Constant for x-amz-grant-read-acp.
     */
    public static final String HD_XAMZ_GRANT_READ_ACP = "x-amz-grant-read-acp";

    /**
     * Constant for x-amz-grant-write-acp.
     */
    public static final String HD_XAMZ_GRANT_WRITE_ACP = "x-amz-grant-write-acp";

    /**
     * Constant for x-amz-grant-full-control.
     */
    public static final String HD_XAMZ_GRANT_FULL_CONTROL = "x-amz-grant-full-control";

    // PutObject method related Amz real header name Constants.

    /**
     * Constant for x-amz-meta-.
     */
    public static final String HD_XAMZ_META = "x-amz-meta-";

    /**
     * Constant for x-amz-server-side-encryption.
     */
    public static final String HD_XAMZ_SERVE_ENCRYPTION = "x-amz-server-side-encryption";

    /**
     * Constant for x-amz-storage-class.
     */
    public static final String HD_XAMZ_STORAGE_CLASS = "x-amz-storage-class";

    /**
     * Constant for x-amz-website-redirect-location.
     */
    public static final String HD_XAMZ_WEBSITE_LOCATION = "x-amz-website-redirect-location";

    /**
     * Constant for x-amz-mfa.
     */
    public static final String HD_XAMZ_MFA = "x-amz-mfa";

    // Real header names that are requested for createObjectCopy.

    /**
     * Constant for x-amz-copy-source.
     */
    public static final String HD_XAMZ_COPY_SOURCE = "x-amz-copy-source";

    /**
     * Constant for x-amz-copy-source-range.
     */
    public static final String HD_XAMZ_COPY_SOURCE_RANGE = "x-amz-copy-source-range";

    /**
     * Constant for x-amz-metadata-directive.
     */
    public static final String HD_XAMZ_METADATA_DIRECTIVE = "x-amz-metadata-directive";

    /**
     * Constant for x-amz-copy-source-if-match.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_MATCH = "x-amz-copy-source-if-match";

    /**
     * Constant for x-amz-copy-source-if-none-match.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_NONE_MATCH = "x-amz-copy-source-if-none-match";

    /**
     * Constant for x-amz-copy-source-if-modified-since.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_MODIFIED_SINCE = "x-amz-copy-source-if-modified-since";

    /**
     * Constant for x-amz-copy-source-if-unmodified-since.
     */
    public static final String HD_XAMZ_COPY_SOURCE_IF_UNMODIFIED_SINCE = "x-amz-copy-source-if-unmodified-since";

    // Other Constants.

    /**
     * Constant for authenticationCode.
     */
    public static final String AUTH_CODE = "authenticationCode";

    /**
     * Constant for contentMD5Value.
     */
    public static final String CONTENT_MD5_VAL = "contentMD5Value";

    /**
     * Constant for contentTypeValue.
     */
    public static final String CONTENT_TYPE_VAL = "contentTypeValue";

    /**
     * Constant for date.
     */
    public static final String DATE = "date";

    /**
     * Constant for xAmzDateValue.
     */
    public static final String IS_XAMZ_DATE_VAL = "isXAmzDateValue";

    /**
     * Constant for xAmzAclValue.
     */
    public static final String XAMZ_ACL_VAL = "xAmzAclValue";

    /**
     * Constant for xAmzGrantReadValue.
     */
    public static final String XAMZ_GRANT_READ_VAL = "xAmzGrantReadValue";

    /**
     * Constant for xAmzGrantWriteValue.
     */
    public static final String XAMZ_GRANT_WRITE_VAL = "xAmzGrantWriteValue";

    /**
     * Constant for xAmzGrantReadAcpValue.
     */
    public static final String XAMZ_GRANT_READ_ACP_VAL = "xAmzGrantReadAcpValue";

    /**
     * Constant for xAmzGrantWriteAcpValue.
     */
    public static final String XAMZ_GRANT_WRITE_ACP_VAL = "xAmzGrantWriteAcpValue";

    /**
     * Constant for xAmzGrantFullControlValue.
     */
    public static final String XAMZ_GRANT_FULL_CONTROL_VAL = "xAmzGrantFullControlValue";

    // Header names to set of createObject method.
    /**
     * Constant for xAmzMetaValue.
     */
    public static final String XAMZ_META_VAL = "xAmzMetaValue";

    /**
     * Constant for xAmzServeEncryptionValue.
     */
    public static final String XAMZ_SERVE_ENCRYPTION_VAL = "xAmzServeEncryptionValue";

    /**
     * Constant for xAmzStorageClassValue.
     */
    public static final String XAMZ_STORAGE_CLASS_VAL = "xAmzStorageClassValue";

    /**
     * Constant for xAmzWebsiteLocationValue.
     */
    public static final String XAMZ_WEBSITE_LOCATION_VAL = "xAmzWebsiteLocationValue";

    /**
     * Constant for xAmzMfaValue.
     */
    public static final String XAMZ_MFA_VAL = "xAmzMfaValue";

    // Header names to set of createObjectCopy method.

    /**
     * Constant for xAmzCopySourceValue.
     */
    public static final String XAMZ_COPY_SOURCE_VAL = "xAmzCopySourceValue";

    /**
     * Constant for xAmzMetadataDirectiveValue.
     */
    public static final String XAMZ_METADATA_DIRECTIVE_VAL = "xAmzMetadataDirectiveValue";

    /**
     * Constant for xAmzCopySourceIfMatchValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MATCH_VAL = "xAmzCopySourceIfMatchValue";

    /**
     * Constant for xAmzCopySourceIfNoneMatchValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_NONE_MATCH_VAL = "xAmzCopySourceIfNoneMatchValue";

    /**
     * Constant for xAmzCopySourceIfModifiedSinceValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_MODIFIED_SINCE_VAL = "xAmzCopySourceIfModifiedSinceValue";

    /**
     * Constant for xAmzCopySourceIfUnmodifiedSinceValue.
     */
    public static final String XAMZ_COPY_SOURCE_IF_UNMODIFIED_SINCE_VAL = "xAmzCopySourceIfUnmodifiedSinceValue";

    /**
     * Constant for getObjectResponse.
     */
    public static final String GET_OBJECT_RESPONSE = "getObjectResponse";

    /**
     * Constant for buffer size during MD5 conversion.
     */
    public static final int BUFFER_SIZE = 8192;

    // Error Constants
    /**
     * Constant errorCode for IOException.
     */
    public static final int IO_EXCEPTION_ERROR_CODE = 700001;

    /**
     * Constant errorCode for InvalidKeyException.
     */
    public static final int INVALID_KEY_ERROR_CODE = 700007;

    /**
     * Constant errorCode for NoSuchAlgorithmException.
     */
    public static final int NO_SUCH_ALGORITHM_ERROR_CODE = 700008;

    /**
     * Constant errorCode for IllegalArgumentException.
     */
    public static final int ILLEGAL_ARGUMENT_ERROR_CODE = 700013;

    /**
     * Constant for Illegal State Error Code.
     */
    public static final int ILLEGAL_STATE_ERROR_CODE = 700015;

    /**
     * Constant errorCode for UnsupportedEncodingException.
     */
    public static final int UNSUPPORTED_ENCORDING_ERROR_CODE = 700009;

    /**
     * Error code constant for generic exception.
     */
    public static final int ERROR_CODE_EXCEPTION = 900001;

    /**
     * Constant for privateKeyFilePath.
     */
    public static final String PRIVATE_KEY_FILE_PATH = "uri.var.privateKeyFilePath";

    /**
     * Constant for keyPairId.
     */
    public static final String KEY_PAIR_ID = "uri.var.keyPairId";

    /**
     * Constant for s3ObjectKey.
     */
    public static final String OBJECT_NAME = "uri.var.objectName";

    /**
     * Constant for policyType.
     */
    public static final String POLICY_TYPE = "uri.var.policyType";

    /**
     * Constant for UrlSign.
     */
    public static final String BUCKET_URL = "uri.var.bucketUrl";

    /**
     * Constant for QueryParameters.
     */
    public static final String QUERY_PARAMS = "uri.var.query";

    /**
     * Constant for QueryParameters.
     */
    public static final String QUERY_STRING = "uri.var.queryString";

    /**
     * Constant for DateLessThan.
     */
    public static final String DATE_LESS_THAN = "uri.var.dateLessThan";

    /**
     * Constant for DateGreaterThan.
     */
    public static final String DATE_GREATER_THAN = "uri.var.dateGreaterThan";

    /**
     * Constant for IPAddress.
     */
    public static final String IP_ADDRESS = "uri.var.ipAddress";

    /**
     * Constant for CannedPolicy.
     */
    public static final String CANNED_POLICY = "canned";

    /**
     * Constant for CustomPlocy.
     */
    public static final String CUSTOM_POLICY = "custom";

    /**
     * Constant for delimiter.
     */
    public static final String DELIMITER = "uri.var.delimiter";

    /**
     * Constant for API delimiter.
     */
    public static final String API_DELIMITER = "delimiter";

    /**
     * Constant for encoding-type.
     */
    public static final String ENCODING_TYPE = "uri.var.encodingType";

    /**
     * Constant for API encoding-type.
     */
    public static final String API_ENCODING_TYPE = "encoding-type";

    /**
     * Constant for key-marker.
     */
    public static final String KEY_MARKER = "uri.var.keyMarker";

    /**
     * Constant for key-marker.
     */
    public static final String API_KEY_MARKER = "key-marker";

    /**
     * Constant for max-keys.
     */
    public static final String MAX_KEYS = "uri.var.maxKeys";

    /**
     * Constant for max-keys.
     */
    public static final String API_MAX_KEYS = "max-keys";

    /**
     * Constant for marker.
     */
    public static final String MARKER = "uri.var.marker";

    /**
     * Constant for max-keys.
     */
    public static final String API_MARKER = "marker";

    /**
     * Constant for prefix.
     */
    public static final String PREFIX = "uri.var.prefix";

    /**
     * Constant for prefix.
     */
    public static final String API_PREFIX = "prefix";

    /**
     * Constant for version-id-marker.
     */
    public static final String VERSION_ID_MARKER = "uri.var.versionIdMarker";

    /**
     * Constant for version-id-marker.
     */
    public static final String API_VERSION_ID_MARKER = "version-id-marker";

    /**
     * Constant for upload-id-marker.
     */
    public static final String UPLOAD_ID_MARKER = "uri.var.uploadIdMarker";

    /**
     * Constant for upload-id-marker.
     */
    public static final String API_UPLOAD_ID_MARKER = "upload-id-marker";

    /**
     * Constant for upload-id-marker.
     */
    public static final String MAX_UPLOADS = "uri.var.maxUploads";

    /**
     * Constant for upload-id-marker.
     */
    public static final String API_MAX_UPLOADS = "max-uploads";

    /**
     * Constant for versionId.
     */
    public static final String VERSION_ID = "uri.var.versionId";

    /**
     * Constant for versionId.
     */
    public static final String API_VERSION_ID = "versionId";

    /**
     * Constant for partNumber.
     */
    public static final String PART_NUMBER = "uri.var.partNumber";

    /**
     * Constant for versionId.
     */
    public static final String API_PART_NUMBER = "partNumber";

    /**
     * Constant for uploadId.
     */
    public static final String UPLOAD_ID = "uri.var.uploadId";

    /**
     * Constant for versionId.
     */
    public static final String API_UPLOAD_ID = "uploadId";

    /**
     * Constant for responseContentType.
     */
    public static final String RESPONSE_CONTENT_TYPE = "uri.var.responseContentType";

    /**
     * Constant for versionId.
     */
    public static final String API_RESPONSE_CONTENT_TYPE = "response-content-type";

    /**
     * Constant for responseContentLanguage.
     */
    public static final String RESPONSE_CONTENT_LANGUAGE = "uri.var.responseContentLanguage";

    /**
     * Constant for responseContentLanguage.
     */
    public static final String API_RESPONSE_CONTENT_LANGUAGE = "response-content-language";

    /**
     * Constant for responseExpires.
     */
    public static final String RESPONSE_EXPIRES = "uri.var.responseExpires";

    /**
     * Constant for responseExpires.
     */
    public static final String API_RESPONSE_EXPIRES = "response-expires";

    /**
     * Constant for responseCacheControl.
     */
    public static final String RESPONSE_CACHE_CONTROL = "uri.var.responseCacheControl";

    /**
     * Constant for responseCacheControl.
     */
    public static final String API_RESPONSE_CACHE_CONTROL = "response-cache-control";

    /**
     * Constant for responseContentDisposition.
     */
    public static final String RESPONSE_CONTENT_DISPOSITION = "uri.var.responseContentDisposition";

    /**
     * Constant for responseContentDisposition.
     */
    public static final String API_RESPONSE_CONTENT_DISPOSITION = "response-content-disposition";

    /**
     * Constant for responseContentEncoding.
     */
    public static final String RESPONSE_CONTENT_ENCODING = "uri.var.responseContentEncoding";

    /**
     * Constant for responseContentEncoding.
     */
    public static final String API_RESPONSE_CONTENT_ENCODING = "response-content-encoding";

    /**
     * Constant for partNumberMarker.
     */
    public static final String PART_NUMBER_MARKER = "uri.var.partNumberMarker";

    /**
     * Constant for partNumberMarker.
     */
    public static final String API_PART_NUMBER_MARKER = "part-number-marker";

    /**
     * Constant for maxParts.
     */
    public static final String MAX_PARTS = "uri.var.maxParts";

    /**
     * Constant for maxParts.
     */
    public static final String API_MAX_PARTS = "max-parts";

    /**
     * Constant for unsigned payload.
     */
    public static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";
}