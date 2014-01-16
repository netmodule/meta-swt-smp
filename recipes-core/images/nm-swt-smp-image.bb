SUMMARY = "Linux image for SMP training"
DESCRIPTION = "NetModule Linux image for multithread and multicore software training"
AUTHOR = "David Andrey <david.andrey@netmodule.com>"
HOMEPAGE = "http://www.netmodule.com"

# Support for U-Boot image format
IMAGE_CLASSES += "image_types_uboot"

# minimal
include recipes-core/images/core-image-minimal.bb

# Add high-level features
# see http://www.yoctoproject.org/docs/1.5/ref-manual/ref-manual.html#ref-features-image
IMAGE_FEATURES += " \
    ssh-server-openssh \
    debug-tweaks \
    tools-debug \
    "

IMAGE_INSTALL += " \
    openssh-sftp-server \	
    mtd-utils \
    "

# Image in ext2 format and with U-Boot header	
IMAGE_FSTYPES := "ext2.gz ext2.gz.u-boot"
IMAGE_ROOTFS_SIZE = "32768"
IMAGE_ROOTFS_SIZE_ext2 = "32768"
	
export IMAGE_BASENAME = "nm-swt-smp-image"
