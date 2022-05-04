package study.jpashop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberResponse {

    private String name;

    public MemberResponse(String name) {
        this.name = name;
    }
}
