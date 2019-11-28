package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "2016101500692553";//??????????????????
	
	public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCRS8DLQtnjB/TSDeDey31CHxlrL/PYmlWODb8oiF0Ysxz1jskMwcQl5IXLseQ+tjU7pL3y0Z0L/Pt2n27V526eimKoU0vMpFSYCqG1F20twFRzXArszgxGQFna95N+So3wWCXh88WmIqFR+ZblpOXFL8XNVvRpjgYT3iU0G3Bx5O1CBzygNS9Z/kL0K5xsWikBVOeTKCgkFX/LWy76phSYYhvPVQxkXEnd+OlGJbgPS7wwnkfNX+YP3GmcYXPWwugE2Wxdjs9Gc/0hExo/5cxWGDJGSudFj5YP8MIbvcqpMQcvZ9RcBZ/lV8XiWoBoc2QXHg1z3xxuix+xvTIgKfUHAgMBAAECggEBAJAFaOuSLmxOfKyiOR5e0qByNz36YFl6UgfnNG63DKDpGnGFwWA1yXpOFRmeEcLf1dBzMh25DVTOxWwGCVVafFoGjliPiHknAvtavoPE3uIU3SEkQWgNrjkMnITiF39940gz+AkLHAXcGdAp+RtU4rUc75Lk+IyQzRFwh6wo7sLVTGm9HEf+CCaggi7xnoljJESEvkxUT3jgg2w+y3LeDQOouPBerjA6aSpH1gsxP47G8kmMg4Ah7cOv6OX5mTKTsTodsQXM0h0Xl7NKfLqnlx3tq2p+eRdp8bXgnqnd1uk4pvTpYlX5iYWORGi8vKllqkjarR3SMRHvHj6QCj5Ml7ECgYEAyYbPn/Khe97X/wxRyeUulmY8mRpgX8CVLqPFsciWaO8dOKyRaG7s2e2pLIH7LpuDmdTPF8OEFY2cZZY1XQbbdCXwkd/x6OQr+WJj2YkXd6B4L94Mtxx+5YiEOIZ0y/8q7JYRf+UF+ZLkuwWaYLB1rrl5jueELp4jPLSL0KyPGe0CgYEAuJHndO9c5HJHuBrwkg2ZTv/ZNCq6Kg1LCWPqjDgVrT8dIWVFI8MV8eL83J6O68g6+sydUSt/0FQ7KIwuEBCZn48O5KTjHejeE2rxTMi6McnOeT6Ix9M9Nz2my6r5HssAe9HCf8CzBwYuPqPXYHUDNAER+ApD713CpEzz7t5ZXEMCgYEAkSDAjNNSb74/lrDshZTCRBVENo3EMbCivn+6cxmdF9x7EsFTxf18HEUGu8KvfRUJZNLYgKiQimT86DuQGnpBuBdKdALuV2VaNbIhbhtIByJM60vhpEylJe92KK7Llc0gwFgiKhRohR7AEd8rGc56MWXooH0ht+CyR5lNxu098NECgYEAiKDpV/TBLRMz6CN5JoUOkh5vKWDfwrVocKEYRYhW85Ke+9O9pMWLfy3qxV5SqlPk5TeG1UmAKjXQPSnYB2hicG00NymgPsndaz5lNdP5kVW0lKgoFNRYooXu7SG5nIPl7cLPWkbJwE9g+FnM28iDAIIyTQ08UPt1VK7qfE74k4UCgYB2OEEEYyHrUevaq2fVfZyIOYO7kbreiPQ02/GUYkva3wbkF83iPagbkl1jOraxHa5AJMUP4rD6a8NpAyoVavb29KA7Mq9Pc+ZUWGheiA+KVN5FN22CRhoHyW+mpyMUfEJj/5JpgGlpKBknEN6C22rK/2c8wrNDqcq2WldDuhKRbg==";//?????????????????????

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkUvAy0LZ4wf00g3g3st9Qh8Zay/z2JpVjg2/KIhdGLMc9Y7JDMHEJeSFy7HkPrY1O6S98tGdC/z7dp9u1edunopiqFNLzKRUmAqhtRdtLcBUc1wK7M4MRkBZ2veTfkqN8Fgl4fPFpiKhUfmW5aTlxS/FzVb0aY4GE94lNBtwceTtQgc8oDUvWf5C9CucbFopAVTnkygoJBV/y1su+qYUmGIbz1UMZFxJ3fjpRiW4D0u8MJ5HzV/mD9xpnGFz1sLoBNlsXY7PRnP9IRMaP+XMVhgyRkrnRY+WD/DCG73KqTEHL2fUXAWf5VfF4lqAaHNkFx4Nc98cbosfsb0yICn1BwIDAQAB";//?????????????????????
	
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//????????????????????????https://openapi.alipay.com/gateway.do
}
