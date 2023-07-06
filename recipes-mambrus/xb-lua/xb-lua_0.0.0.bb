SUMMARY     = "X-built Lua for deeply embedded systems"
DESCRIPTION = "X-built Lua, terminal servlet and LBM (C-language briging)"
HOMEPAGE    = "https://gitlab.com/mambrus/xb-lua"
AUTHOR      = "Michael Ambrus <michael@ambrus.se>"
SECTION     = "system"
LICENSE     = "MIT"

inherit cmake pkgconfig

LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=295b69af9dd7b1a236a7be9452bdbead \
"
SRCREV = "bd3dbd7152cf3ec273d0e0c7e398ef6668e38b2f"
PV = "5.3.3"

DEPENDS = "tcptap liblog"

SRC_URI = "gitsm://gitlab.com/mambrus/xb-lua.git;branch=wikiless;protocol=https"

S = "${WORKDIR}/git"
INSANE_SKIP:${PN}-dev += "dev-elf"
FILES:${PN}-dev += "${libdir}/${PN}.so ${libdir}/a${PN}.a ${libdir}/so${PN}.so"
FILES_${PN}     += "${libdir}/${PN}.so ${libdir}/a${PN}.a ${libdir}/so${PN}.so"

