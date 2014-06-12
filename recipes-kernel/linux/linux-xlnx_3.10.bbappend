FILESEXTRAPATHS_prepend := "${THISDIR}/linux-xlnx:"

SCR_URI += "file://linux-xlnx/microzed_swt_smp_defconfig.cfg"

MACHINE_KCONFIG_microzed-zynq7    := "microzed_swt_smp_defconfig.cfg"
