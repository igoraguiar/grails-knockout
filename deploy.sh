#!/bin/bash

cd $(dirname $0)

mv -v ~/.m2/settings.xml ~/.m2/settings.xml.bkp
grails maven-deploy --repository=releases
cp -v ~/.m2/settings.xml.bkp ~/.m2/settings.xml
