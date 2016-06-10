SUMMARY = "TPM management tools"
DESCRIPTION = "Tools for managing TPM subsystem."

DEPENDS = "openssl trousers virtual/gettext"
RDEPENDS_${PN} = "openssl trousers"

LICENSE = "CPLv1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=059e8cd6165cb4c31e351f2b69388fd9"

SRC_URI = " \
	git://git.code.sf.net/p/trousers/tpm-tools \
	file://config.patch \
"
SRCREV = "490afe611c15d2a12e848231362f7449ecaea729"

S = "${WORKDIR}/git"

inherit autotools pkgconfig

