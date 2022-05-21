package com.example.practice.repository;

import com.example.practice.domain.member.Member;
import com.example.practice.domain.member.SaveMember;

public class MemberRepositoryImpl implements MemberRepository{

    @Override
    public void save(SaveMember member) {

    }

    @Override
    public void updateNickname(Long memberId, String nickname) {

    }

    @Override
    public void updateIntro(Long memberId, String intro) {

    }

    @Override
    public void delete(Long memberId) {

    }

    @Override
    public Member findById(Long memberId) {
        return null;
    }
}
