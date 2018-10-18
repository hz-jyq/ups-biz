/**
 *
 */
package com.yylc.risk.gateway.business.zcaf;

import com.alibaba.fastjson.JSONObject;

/**
 * @description params閲岃竟鐨勫叿浣撳唴瀹?
 * @author Hoary (hoary_huang@foxmail.com)
 * @since 2016骞?4鏈?29鏃?
 */
public class InnerEcParams {

	/**
	 * 浜嬪姟绫诲瀷
	 */
	private String tx;

	/**
	 * 鍐呭
	 */
	private String data;

	public InnerEcParams() {
	}

	public InnerEcParams( String data ) {
		this.data = data;
	}

	public String getJson(){
		final JSONObject jo = new JSONObject();
		jo.put("tx", tx);
		jo.put("data", JSONObject.parseObject(data));

		final String json = jo.toJSONString();

		return json;
	}

	public InnerEcParams( String tx,String data ) {
		this.tx = tx;
		this.data = data;
	}

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
