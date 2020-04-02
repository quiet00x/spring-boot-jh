import com.bangb.common.validation.constraints.ValidCardNumber;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

/**
 * @project_name: spring-boot-jh
 * @date: 2020/4/2 - 1:09
 * @author: Mr_Bangb
 */
@Data
public class UserBean {
    @NotBlank(message = "编号不能为空")
    @Max(value = 1000,message = "id不能大于1000")
    private Long id;
    @NotBlank(message = "用户名不能为空")
    private String userName;
    @ValidCardNumber
    private String cardNumber;
}