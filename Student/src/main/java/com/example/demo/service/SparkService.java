package com.example.demo.service;





import org.apache.spark.sql.Row;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SparkService {

    // ... other methods

    private Map<String, Object> rowFunction(Row row) {
        Map<String, Object> result = new HashMap<>();

        // Adapt the transformation logic based on your Student entity attributes
        result.put("studentId", row.getLong(0));
        result.put("studentName", row.getString(1) + " (Mapped)");
        result.put("age", row.getInt(2));
        result.put("course", row.getString(3));
        result.put("grade", row.getDouble(4));

        return result;
    }

    public List<Map<String, Object>> processStudentData() {
        return null;
    }

    // ... other methods
}

