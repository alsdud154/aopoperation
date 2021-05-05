package kr.co.velnova.aopoperation.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
* UserDTO는 LangDTO를 상속받아 instance는 LangDTO, UserDTO 2개
* */
@Getter
@Setter
@ToString
public class UserDTO extends LangDTO {
    private String name;
    private String lang;
}
