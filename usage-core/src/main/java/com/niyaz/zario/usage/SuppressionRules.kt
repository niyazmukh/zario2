package com.niyaz.zario.usage

/**
 * Pre-computed suppression and navigation sets derived from [UsageAggregationConfig].
 * Keeps lookup cost low and ensures consistent semantics across ingestion components.
 */
data class SuppressionRules(
    val suppressedPackages: Set<String>,
    val suppressedClasses: Set<String>,
    val navigationPackages: Set<String>,
    val navigationClasses: Set<String>
) {
    fun isNavigationPackage(packageName: String?): Boolean =
        packageName != null && packageName in navigationPackages

    fun isNavigationClass(className: String?): Boolean =
        className != null && className in navigationClasses

    fun isSuppressedPackage(packageName: String?): Boolean =
        packageName != null && packageName in suppressedPackages

    fun isSuppressedClass(className: String?): Boolean =
        className != null && className in suppressedClasses

    companion object {
        fun fromConfig(config: UsageAggregationConfig): SuppressionRules {
            val navigationPackages = config.navigationPackages
            val navigationClasses = config.navigationActivityClassNames
            val suppressedPackages = (config.suppressedTaskRootPackages + navigationPackages).toSet()
            val suppressedClasses = (config.suppressedTaskRootClassNames + navigationClasses).toSet()
            return SuppressionRules(
                suppressedPackages = suppressedPackages,
                suppressedClasses = suppressedClasses,
                navigationPackages = navigationPackages,
                navigationClasses = navigationClasses
            )
        }
    }
}
