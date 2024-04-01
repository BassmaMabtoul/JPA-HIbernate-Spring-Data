package ma.bassma.tp2app.service;



import ma.bassma.tp2app.entities.Consultation;
import ma.bassma.tp2app.entities.Medecin;
import ma.bassma.tp2app.entities.Patient;
import ma.bassma.tp2app.entities.RendezVous;

import java.beans.MethodDescriptor;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
