package com.futcleats.repository;

import com.futcleats.model.FieldModel;
import com.futcleats.model.ReservationModel;
import com.futcleats.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel, UUID> {

    List<ReservationModel> findAllReservationByUserModel(UserModel userModel);

    List<ReservationModel> findReservationModelByFieldModel(FieldModel fieldModel);

}
