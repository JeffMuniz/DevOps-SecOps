def jobName = "EC/est-api-autoec/develop"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()

def jobName = "EC/est-api-autoec/staging"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()

def jobName = "EC/est-api-autoec/master"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()


aws ecr get-login --no-include-email --region sa-east-1
aws ecr get-login-password --region sa-east-1 | docker login --username AWS --password-stdin 957723433972.dkr.ecr.sa-east-1.amazonaws.com
aws eks update-kubeconfig --region sa-east-1 --name mac-dev



https://jenkins-qa.itpreprodb.com/script

def jobName = "Financeiro-Contabil/ctb-wkr-atutransac/develop"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()

def jobName = "Financeiro-Contabil/ctb-wkr-atutransac/staging"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()

def jobName = "Financeiro-Contabil/ctb-wkr-atutransac/master"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()
 



CUIDADO não usar esses comandos

aws eks update-cluster-config --region sa-east-1 --name MAC-DEV --resources-vpc-config 
\endpointPublicAccess=true,publicAccessCidrs="18.228.250.18/32",endpointPrivateAccess=true
aws eks describe-update --region sa-east-1 --name MAC-DEV --update-id some-id

ping 99AD65B8D177D04205B5493185C3987F.gr7.sa-east-1.eks.amazonaws.com
 18.228.250.18
 


def jobName = "EC/est-api-autoec/develop"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()

def jobName = "EC/est-api-autoec/staging"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()

def jobName = "EC/est-api-autoec/master"
def job = Jenkins.getInstance().getItemByFullName(jobName, Job.class)
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()


https://jenkins-qa.itpreprodb.com/script

