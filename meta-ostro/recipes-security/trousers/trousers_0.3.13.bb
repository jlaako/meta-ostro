SUMMARY = "TPM TSS implementation"
DESCRIPTION = "Trousers is an open-source TCG Software Stack (TSS)."

DEPENDS = "openssl"
RDEPENDS_${PN} = "openssl"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8031b2ae48ededc9b982c08620573426"

SRC_URI = " \
	git://git.code.sf.net/p/trousers/trousers \
	file://config.patch \
"
SRCREV = "ed31dfbd013760abd75d4b3fe92d7dd593ea7ebe"

S = "${WORKDIR}/git"

PACKAGECONFIG[gtk] = "--with-gui=gtk,--with-gui=none"

inherit autotools pkgconfig

