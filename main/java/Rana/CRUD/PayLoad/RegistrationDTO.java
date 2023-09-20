package Rana.CRUD.PayLoad;

import lombok.Data;

@Data
public class RegistrationDTO {

        private Long id;
        public String name;
        public String email;
        public int mobile;

}
