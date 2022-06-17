HOMEPAGE = "https://github.com/altera-opensource/u-boot-socfpga"
SECTION = "bootloaders"

PV_append = "+git${SRCPV}"

SRC_URI = "git://github.com/altera-opensource/u-boot-socfpga.git;nobranch=1;protocol=https"

S = "${WORKDIR}/git"

RPROVIDES_${PN} += "u-boot"
