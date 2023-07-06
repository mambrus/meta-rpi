SUMMARY     = "Adroid inspired logger"
DESCRIPTION = "C-library: functions for logging, debug printouts"
HOMEPAGE    = "https://gitlab.com/mambrus/liblog"
AUTHOR      = "Michael Ambrus <michael@ambrus.se>"
SECTION     = "system"
LICENSE     = "MIT"

inherit cmake pkgconfig

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=4836dc1cc92e958125f4b135a5817fea \
    file://COPYING;md5=3da9cfbcb788c80a0384361b4de20420 \
"
SRCREV = "ccf8c5cf6e4b474b924c7e4a744d120122e4cf67"
PV = "0.3.12"

SRC_URI = "gitsm://gitlab.com/mambrus/liblog.git;branch=master;protocol=https"

S = "${WORKDIR}/git"
INSANE_SKIP:${PN}-dev += "dev-elf"
FILES:${PN}-dev += "${libdir}/${PN}.so ${libdir}/a${PN}.a ${libdir}/so${PN}.so"
FILES_${PN}     += "${libdir}/${PN}.so ${libdir}/a${PN}.a ${libdir}/so${PN}.so"

