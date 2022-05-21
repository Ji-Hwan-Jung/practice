package com.example.practice.repository;

import com.example.practice.domain.member.Member;
import com.example.practice.domain.member.SaveMember;

public interface MemberRepository {

    void save(SaveMember member);
    void updateNickname(Long memberId, String nickname);
    void updateIntro(Long memberId, String intro);
    void delete(Long memberId);
    Member findById(Long memberId);
}
