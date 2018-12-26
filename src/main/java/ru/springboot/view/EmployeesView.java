package ru.springboot.view;

import javax.validation.constraints.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Сотрудник")
public class EmployeesView {

    @NotEmpty
    @ApiModelProperty(value = "Уникальный идентификатор", hidden = true, example = "1")
    public String employeeId;

    @Size(max = 255)
    @NotEmpty(message = "name cannot be null")
    @ApiModelProperty(value = "Имя", example = "Иван")
    public String employeeFirstName;

    @Size(max = 255)
    @NotEmpty(message = "name cannot be null")
    @ApiModelProperty(value = "Фамилия", example = "Иванов")
    public String employeeLastName;

    @Size(max = 255)
    @NotEmpty(message = "name cannot be null")
    @ApiModelProperty(value = "Должность", example = "Генеральный Директор")
    public String employeePosition;

    @Size(max = 20)
    @NotEmpty(message = "name cannot be null")
    @ApiModelProperty(value = "Телефон", example = "+7-977-777-77-77")
    public String employeePhone;

//    @NotNull(message = "age cannot be null")
//    @Min(18)
//    @Max(200)
//    @ApiModelProperty(value = "Возраст", example = "27")
//    public Integer age;

    @Override
    public String toString() {
        return "{id:" + employeeId + ";Name:" + employeeFirstName + ";LastName:" + employeeLastName + ";Position:" + employeePosition +";Phone:"+ employeePhone+"}";
    }
}
