<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Search Reports</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="input" action="search">
						<%-- <form:hidden path="id" />
						 <fieldset class="form-group">
							<form:label path="description">Description</form:label>
							<form:input path="description" type="text" class="form-control"
								required="required" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset> --%>

						<fieldset class="form-group">
							<form:label path="startDate">Start Date</form:label>
							<form:input path="startDate" type="text" class="form-control" required="required" />
							<form:errors path="startDate" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="endDate">End Date</form:label>
							<form:input path="endDate" type="text" class="form-control" required="required" />
							<form:errors path="endDate" cssClass="text-warning" />
						</fieldset>

						<button type="submit" class="btn btn-success">Search</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>