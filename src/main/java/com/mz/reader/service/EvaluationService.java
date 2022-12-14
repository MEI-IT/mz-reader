package com.mz.reader.service;

import com.mz.reader.entity.Evaluation;

import java.util.List;

public interface EvaluationService {

    public List<Evaluation> selectByBookId(Long bookId);
}
