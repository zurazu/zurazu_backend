package com.zurazu.zurazu_backend.web.dto;

import com.zurazu.zurazu_backend.core.GenderType;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Data
public class RegisterApplySellProductDTO {
    @NotNull(message = "카테고리 인덱스가 필요합니다.")
    private Integer categoryIdx;
    @NotEmpty(message = "브랜드 이름 입력이 필요합니다")
    private String brandName;
    @NotNull(message = "가격 입력이 필요합니다")
    private Integer price;
    @NotEmpty(message = "옷 사이즈 입력이 필요합니다.")
    private String clothingSize;
    @NotNull(message = "옷 상태 입력이 필요합니다. 0~4")
    private Integer clothingStatus;
    private GenderType gender = GenderType.MALE;
    private String comments;
}
