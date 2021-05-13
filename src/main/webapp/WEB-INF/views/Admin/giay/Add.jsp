<%--
  Created by IntelliJ IDEA.
  User: nohop
  Date: 4/20/2021
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <div class="container col-12 col-sm-10 col-md-8 ">

        <div class="card shadow">
            <div class=" card-body">
                <h1>Tạo Mới</h1>
                <h2>Giày</h2>
                <hr/>
                <div class="row">
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Mã giày</label>
                        <input id="magiay" name="magiay" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Tên giày</label>
                        <input id="tengiay" name="tengiay" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Loại giày</label>
                        <select id="maloaigiay" name="maloaigiay" class="form-control">

                        </select>
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Size</label>
                        <input id="size" name="size" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Số lượng</label>
                        <input id="soluong" name="soluong" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">giá</label>
                        <input id="gia" name="gia" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Mã Nhà Sản Xuất</label>
                        <input id="manhasanxuat" name="manhasanxuat" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Mô Tả</label>
                        <input id="mota" name="mota" class="form-control">
                    </div>
                    <div class="form-group col-12 col-md-6">
                        <label class="font-weight-bold">Ảnh</label>
                        <input type="file" id="anh" name="anh" class="form-control">
                    </div>
                    <hr/>
                    <div class="form-inline text-right">
                        <button class="btn btn-success mr-1" >Luu</button>
                        <button class="btn btn-dark">huy</button>
                    </div>

                </div>
                <div class="card-footer"></div>

            </div>
        </div>
    </div>
<script src="<c:url value="/resources/vendor/jquery/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/giay/add.js"/>"></script>

