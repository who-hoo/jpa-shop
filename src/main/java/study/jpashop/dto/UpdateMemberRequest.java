package study.jpashop.dto;

import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateMemberRequest {

    @NotEmpty
    private String name;

    public UpdateMemberRequest(String name) {
        this.name = name;
    }
}
