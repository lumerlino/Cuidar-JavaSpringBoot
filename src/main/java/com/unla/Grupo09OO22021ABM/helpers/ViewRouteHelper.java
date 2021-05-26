package com.unla.Grupo09OO22021ABM.helpers;

import org.springframework.web.servlet.view.RedirectView;

@SuppressWarnings("unused")
public class ViewRouteHelper {
 
	/**** Views ****/
	
	public final static String INDEX = "/index";
	
	
	
	//USUARIO
	public final static String FORM_USUARIO = "/form";
	
	
	
	//PERFIL
	public final static String INDEX_PERFIL = "/index-perfil";
	public final static String FORM_PERFIL = "/form-perfil"; // return ViewRouteHelper.FORMPERFIL;
	
	//USER
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";
	
	
	/**** Redirects ****/
	public final static String HOME = "/home"; // new RedirectView(ViewRouteHelper.HOME)
	public final static String PERFILES = "/listar-perfiles"; //	new RedirectView(ViewRouteHelper.PERFILES)
	public final static String USUARIOS = "/listar"; 

}