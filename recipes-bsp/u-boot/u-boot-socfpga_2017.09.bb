require recipes-bsp/u-boot/u-boot.inc
# This revision is the v2017.09 release
require u-boot-socfpga.inc
SRCREV = "4a634e3b1583a267ca39838f68ad26ed080012d0"
SRCREV_arm = "2a2102e92e470beec51d8b2dea8323cfc92f92b1"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
LIC_FILES_CHKSUM_arm = "file://Licenses/README;md5=c7383a594871c03da76b3707929d2919"

PV = "2017.09"
PV_arm = "2014.10"

DEPENDS += "dtc-native"
