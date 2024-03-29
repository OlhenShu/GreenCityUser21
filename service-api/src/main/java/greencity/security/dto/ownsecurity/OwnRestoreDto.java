package greencity.security.dto.ownsecurity;

import greencity.annotations.PasswordValidation;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OwnRestoreDto {
    @NotBlank
    @PasswordValidation
    private String password;

    @NotBlank
    @PasswordValidation
    private String confirmPassword;

    @NotBlank
    private String token;

    private Boolean isUbs;
}
