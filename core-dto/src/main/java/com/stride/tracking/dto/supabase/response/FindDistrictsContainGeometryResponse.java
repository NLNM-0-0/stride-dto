package com.stride.tracking.dto.supabase.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindDistrictsContainGeometryResponse {
    private List<DistrictResponse> districts;
}
