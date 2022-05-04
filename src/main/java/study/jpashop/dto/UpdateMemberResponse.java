package study.jpashop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateMemberResponse {

    private Long id;
    private String name;

    public UpdateMemberResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
