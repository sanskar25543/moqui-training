def moquitraining = ec.entity.makeValue("moquitraining.MoquiTraining")
moquitraining.setFields(context, true, null, null)
if (!moquitraining.tutorialId) moquitraining.setSequencedIdPrimary()
moquitraining.create()