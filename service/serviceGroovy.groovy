def moquitraining = ec.entity.makeValue("moquitraining.MoquiTraining")
moquitraining.setFields(context, true, null, null)
if (!moquitraining.trainingId) moquitraining.setSequencedIdPrimary()
moquitraining.create()