package cn.jbolt.common.model;

import cn.jbolt.base.JBoltAutoCache;
import cn.jbolt.common.model.base.BasePermission;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@JBoltAutoCache(keyCache = true,column = "permission_key")
public class Permission extends BasePermission<Permission>{
	
	public static final int LEVEL_1=1;
	public static final int LEVEL_2=2;
	public static final int LEVEL_3=3;
	private static final String SPRIT="/";
}