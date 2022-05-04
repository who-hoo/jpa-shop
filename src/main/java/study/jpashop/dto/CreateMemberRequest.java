package study.jpashop.dto;

import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateMemberRequest {

    @NotEmpty
    private String name;

    public CreateMemberRequest(String name) {
        this.name = name;
    }
}
