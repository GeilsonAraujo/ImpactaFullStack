package utilitarios;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class UtilitariosBean {
	
	public static void populateBean(Object formBean, HttpServletRequest request) {
		populateBean(formBean, request.getParameterMap());
	}
	
	public static void populateBean(Object formBean, Map parameterMap) { //metodo que aceita um bean e um map, e passa para a propriedade do bean correta
		try {
			BeanUtils.populate(formBean, parameterMap);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
