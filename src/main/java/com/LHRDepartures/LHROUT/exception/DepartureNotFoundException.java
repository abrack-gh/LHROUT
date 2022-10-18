package com.LHRDepartures.LHROUT.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import javax.xml.transform.SourceLocator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartureNotFoundException extends RuntimeException implements GraphQLError {
    private Map<String, Object> extensions = new HashMap<>();

    public DepartureNotFoundException(String message, Long invalidDepartureId) {
        super(message);
        extensions.put("invalidDepartureId", invalidDepartureId);
    }

    public List<SourceLocation> getDeparture() { return null; }

    @Override
    public Map<String, Object> getExtensions() { return extensions; }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() { return ErrorType.DataFetchingException; }

    @Override
    public List<Object> getPath() {
        return GraphQLError.super.getPath();
    }

    @Override
    public Map<String, Object> toSpecification() {
        return GraphQLError.super.toSpecification();
    }
}

