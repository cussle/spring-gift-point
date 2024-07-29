package gift.controller;

import gift.dto.option.OptionCreateRequest;
import gift.dto.option.OptionResponse;
import gift.dto.option.OptionUpdateRequest;
import gift.service.OptionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Option API", description = "옵션 관리 API")
@RestController
@RequestMapping("/api/products/{productId}/options")
public class OptionController {

    private final OptionService optionService;

    public OptionController(OptionService optionService) {
        this.optionService = optionService;
    }

    @Operation(summary = "상품 옵션 조회", description = "특정 상품의 모든 옵션을 조회합니다.")
    @GetMapping
    public ResponseEntity<List<OptionResponse>> getOptionsByProductId(
        @PathVariable Long productId
    ) {
        List<OptionResponse> options = optionService.getOptionsByProductId(productId);
        return ResponseEntity.ok(options);
    }

    @Operation(summary = "옵션 조회", description = "ID를 사용하여 특정 옵션을 조회합니다.")
    @GetMapping("/{optionId}")
    public ResponseEntity<OptionResponse> getOptionById(
        @PathVariable Long optionId
    ) {
        OptionResponse option = optionService.getOptionById(optionId);
        return ResponseEntity.ok(option);
    }

    @Operation(summary = "옵션 추가", description = "특정 상품에 새로운 옵션을 추가합니다.")
    @PostMapping
    public ResponseEntity<OptionResponse> addOptionToProduct(
        @PathVariable Long productId,
        @Valid @RequestBody OptionCreateRequest optionCreateRequest
    ) {
        OptionResponse createdOption = optionService.addOptionToProduct(
            productId,
            optionCreateRequest
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOption);
    }

    @Operation(summary = "옵션 수정", description = "기존 옵션 정보를 수정합니다.")
    @PutMapping("/{optionId}")
    public ResponseEntity<OptionResponse> updateOption(
        @PathVariable Long productId,
        @PathVariable Long optionId,
        @Valid @RequestBody OptionUpdateRequest optionUpdateRequest
    ) {
        OptionResponse updatedOption = optionService.updateOption(
            productId,
            optionId,
            optionUpdateRequest
        );
        return ResponseEntity.ok(updatedOption);
    }

    @Operation(summary = "옵션 삭제", description = "기존 옵션을 삭제합니다.")
    @DeleteMapping("/{optionId}")
    public ResponseEntity<Void> deleteOption(
        @PathVariable Long productId,
        @PathVariable Long optionId
    ) {
        optionService.deleteOption(productId, optionId);
        return ResponseEntity.noContent().build();
    }
}
