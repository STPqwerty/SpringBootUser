<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Пользователь </span></div>
		<div class="panel-body">
	        <div class="formcontainer">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert" ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	                <input type="hidden" ng-model="ctrl.user.id" />
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="first_name">Имя</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.user.first_name" id="first_name" class="username form-control input-sm" placeholder="Введите ваше имя" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="last_name">Фамилия</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.last_name" id="last_name" class="username form-control input-sm" placeholder="Введите вашу Фамилию" required ng-minlength="3"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="middle_name">Отчество</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.middle_name" id="middle_name" class="username form-control input-sm" placeholder="Введите ваше Отчество" required ng-minlength="3"/>
                            </div>
                        </div>
                    </div>


                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="phone_n">Телефон</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.phone_num" id="phone_n" class="username form-control input-sm" placeholder="Введите ваш номер телефона" required ng-pattern="ctrl.onlyIntegers"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="email">Email</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.email" id="email" class="username form-control input-sm" placeholder="Введите ваш email" required ng-minlength=""/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="adress">Адрес</label>
						<#--<div class="col-md-7">-->
						<#--<input type="text" ng-model="ctrl.user.adress" id="adress" class="username form-control input-sm" placeholder="Введите ваш адрес" required ng-minlength="3"/>-->
						<#--</div>-->
                        </div>
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="region">Область</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.region" id="region" class="username form-control input-sm" placeholder="Введите вашу область" required ng-minlength="3"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="city">Город</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.city" id="city" class="username form-control input-sm" placeholder="Введите ваш город" required ng-minlength="3"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="street">Улица</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.street" id="street" class="username form-control input-sm" placeholder="Введите вашу улицу" required ng-minlength="3"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="num_house">Дом</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.num_house" id="num_house" class="username form-control input-sm" placeholder="Введите номер дома" required ng-pattern="ctrl.onlyNumbers"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="appartment">Квартира</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.appartment" id="appartment" class="username form-control input-sm" placeholder="Введите номер квартиры" required ng-pattern="ctrl.onlyNumbers"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-2 control-lable" for="birth_year">Год рождения</label>
                            <div class="col-md-7">
                                <input type="text" ng-model="ctrl.user.birth_date" id="birth_year" class="username form-control input-sm" placeholder="Введите год рождения" required ng-pattern="ctrl.onlyNumbers"/>
                            </div>
                        </div>
                    </div>


	                <#--<div class="row">-->
	                    <#--<div class="form-group col-md-12">-->
	                        <#--<label class="col-md-2 control-lable" for="age">Age</label>-->
	                        <#--<div class="col-md-7">-->
	                            <#--<input type="text" ng-model="ctrl.user.age" id="age" class="form-control input-sm" placeholder="Enter your Age." required ng-pattern="ctrl.onlyIntegers"/>-->
	                        <#--</div>-->
	                    <#--</div>-->
	                <#--</div>-->
	<#---->
	                <#--<div class="row">-->
	                    <#--<div class="form-group col-md-12">-->
	                        <#--<label class="col-md-2 control-lable" for="salary">Salary</label>-->
	                        <#--<div class="col-md-7">-->
	                            <#--<input type="text" ng-model="ctrl.user.salary" id="salary" class="form-control input-sm" placeholder="Enter your Salary." required ng-pattern="ctrl.onlyNumbers"/>-->
	                        <#--</div>-->
	                    <#--</div>-->
	                <#--</div>-->

	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                        <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Очистить форму</button>
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>
	<#--Search form-->
    <form class="well form-search">
        <input type="text" class="span3 search-query" placeholder="Поиск...">
        <button class="btn">Найти</button>
    </form>
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Список пользователей </span></div>
		<div class="panel-body">
			<div class="table-responsive">
		        <table class="table table-hover">
		            <thead>
		            <tr>
		                <#--<th>ID</th>-->
		                <th>Имя</th>
		                <th>Фамилия</th>
		                <th>Отчество</th>
                        <th>Телефон</th>
                        <th>Email</th>
                        <th>Год рождения</th>
							<th>Адрес</th>
		                <th width="100"></th>
		                <th width="100"></th>
		            </tr>
		            </thead>
		            <tbody>
		            <tr ng-repeat="u in ctrl.getAllUsers()">
		                <#--<td>{{u.id}}</td>-->
		                <td>{{u.first_name}}</td>
							<td>{{u.last_name}}</td>
                            <td>{{u.middle_name}}</td>
                            <td>{{u.phone_num}}</td>
                            <td>{{u.email}}</td>
                            <td>{{u.birth_date}}</td>
                            <td>{{u.adress}}</td>
		                <#--<td>{{u.age}}</td>-->
		                <#--<td>{{u.salary}}</td>-->
		                <td><button type="button" ng-click="ctrl.editUser(u.id)" class="btn btn-success custom-width">Изменить</button></td>
		                <td><button type="button" ng-click="ctrl.removeUser(u.id)" class="btn btn-danger custom-width">Удалить</button></td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
    </div>
</div>