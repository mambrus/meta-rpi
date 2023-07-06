SUMMARY     = "A tap for stdio"
DESCRIPTION = "Multi-session tcp-servlet C-library and stdin/stout tap"
HOMEPAGE    = "https://gitlab.com/mambrus/tcp_tap"
AUTHOR      = "Michael Ambrus <michael@ambrus.se>"
SECTION     = "system"
LICENSE     = "GPL-2.0-only"

inherit cmake pkgconfig

LIC_FILES_CHKSUM = " \
    file://COPYING;md5=e673a95e6911049cc1cadf00eac1f759 \
"
SRCREV = "1b24afc1e2d8c3488fc2e00129fb95c575c7ffe5"
PV = "0.8.5"

DEPENDS = "liblog"

SRC_URI = "gitsm://gitlab.com/mambrus/tcp_tap.git;branch=wikiless;protocol=https"

S = "${WORKDIR}/git"
INSANE_SKIP:${PN}-dev += "dev-elf"
FILES:${PN}-dev += "${libdir}/${PN}.so ${libdir}/a${PN}.a ${libdir}/so${PN}.so"
FILES_${PN}     += "${libdir}/${PN}.so ${libdir}/a${PN}.a ${libdir}/so${PN}.so"

