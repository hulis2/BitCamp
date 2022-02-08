package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;

public class GetProductAction extends Action{

	@Override
	public String execute(	HttpServletRequest request,
												HttpServletResponse response) throws Exception {
		String prodNo=request.getParameter("prodNo");
		String menu=request.getParameter("menu");
		
		ProductService service=new ProductServiceImpl();
		Product product=service.getProduct(Integer.parseInt(prodNo));
		
		request.setAttribute("productVO", product);
				
		if(menu.equals("manage")){
			return "forward:/updateProductView.do";
		}else {
			return "forward:/product/getProduct.jsp";
		}
	}
}