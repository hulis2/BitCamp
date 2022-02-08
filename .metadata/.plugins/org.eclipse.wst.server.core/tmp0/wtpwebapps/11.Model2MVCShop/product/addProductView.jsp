<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html lang="ko">
<head>
	<meta charset="EUC-KR">

	<meta name="viewport" content="width=device-width, initial-scale=1.0" />

 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>

	<link href="/css/animate.min.css" rel="stylesheet">
	<link href="/css/bootstrap-dropdownhover.min.css" rel="stylesheet">
	<script src="/javascript/bootstrap-dropdownhover.min.js"></script>
	
	<link rel="stylesheet" href="//code.jquery.com/ui/1.13.0/themes/base/jquery-ui.css">
	<script src="https://code.jquery.com/ui/1.13.0/jquery-ui.js"></script> 
	<style>
	  body {
	      padding-top : 100px;
	  }
	</style>
	
	<title>��ǰ���</title>
	
	<script type="text/javascript">
	
	function fncAddProduct(){
		//Form ��ȿ�� ����
		var name = $("input[name='prodName']").val();
		var detail = $("input[name='prodDetail']").val();
		var manuDate = $("input[name='manuDate']").val();
		var price = $("input[name='price']").val();
	
		if(name == null || name.length<1){
			alert("��ǰ���� �ݵ�� �Է��Ͽ��� �մϴ�.");
			return;
		}
		if(detail == null || detail.length<1){
			alert("��ǰ�������� �ݵ�� �Է��Ͽ��� �մϴ�.");
			return;
		}
		if(manuDate == null || manuDate.length<1){
			alert("�������ڴ� �ݵ�� �Է��ϼž� �մϴ�.");
			return;
		}
		if(price == null || price.length<1){
			alert("������ �ݵ�� �Է��ϼž� �մϴ�.");
			return;
		}
	
		$("form").attr("method","POST").attr("action","/product/addProduct").attr("enctype","multipart/form-data").submit();
		
	}
	
	$(function() {
		
	    $("#manuDate").datepicker({
	        dateFormat: 'yy-mm-dd' 
	    });      
	    
	    $('#manuDate').datepicker('setDate', 'today');            
				
		$("a[href='#' ]").on("click", function() {
			$("form")[0].reset();
		});
		
		$("button").on("click", function() {
			fncAddProduct();
		});
	});

</script>
</head>

<body>

	<jsp:include page="/layout/toolbar.jsp" />

	<div class="container">
	
		<div class="page-header text-center">
			<h3 class=" text-info">�ǸŻ�ǰ ���</h3>
			<h5 class="text-muted">�ǸŻ�ǰ�� <strong class="text-danger">������ �Է�</strong>�� �ּ���.</h5>
		</div>
		
		<form class="form-horizontal" >
		
			<div class="form-group">
				<label for="prodName" class="col-sm-offset-1 col-sm-3 control-label">��  ǰ  ��</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="prodName" name="prodName" placeholder="��ǰ���� �Է����ּ���."> 
				</div>
			</div>
		
			<div class="form-group">
				<label for="prodDetail" class="col-sm-offset-1 col-sm-3 control-label">��ǰ������</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" id="prodDetail" name="prodDetail" placeholder="��ǰ�������� �Է����ּ���."> 
				</div>
			</div>
			
			<div class="form-group">
				<label for="manuDate" class="col-sm-offset-1 col-sm-3 control-label">�� �� �� ��</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="manuDate" name="manuDate"/>
				</div>
			</div>  

			<div class="form-group">
				<label for="price" class="col-sm-offset-1 col-sm-3 control-label">��     ��</label>
				<div class="col-sm-2">
					<input type="text" class="form-control" id="price" name="price" placeholder="������ �Է����ּ���.">
				</div>
				<div class="center">
					<label for="price" class="control-label">��</label>
				</div>
			</div>
			
			<div class="form-group">
				<label for="file" class="col-sm-offset-1 col-sm-3 control-label">�� ǰ �� �� ��</label>
				<div class="col-sm-4">
					<input type="file" class="btn btn-default" role="button" name="file" />
				</div>
			</div>
			
			<div class="form-group">
			    <div class="col-sm-offset-4  col-sm-4 text-center">
			      <button type="button" class="btn btn-primary"  >�� &nbsp;��</button>
				  <a class="btn btn-primary btn" href="#" role="button">�� &nbsp;��</a>
			    </div>
		    </div>		
		
		</form>
	</div>
</body>
</html>